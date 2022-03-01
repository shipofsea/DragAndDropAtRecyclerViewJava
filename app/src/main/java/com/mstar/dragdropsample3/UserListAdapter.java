package com.mstar.dragdropsample3;


import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.Collections;
import java.util.List;

/**
 * Created by Mstar on 02-28-2022.
 */

@SuppressLint("ClickableViewAccessibility")
public class UserListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements
        SwipeAndDragHelper.ActionCompletionContract {

    private static final int USER_TYPE = 1;
    private static final int HEADER_TYPE = 2;
    private List<User> usersList;
    private ItemTouchHelper touchHelper;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == HEADER_TYPE) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_user_list_section_header, parent, false);
            return new SectionHeaderViewHolder(view);
        }
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_user_list_item, parent, false);
        return new UserViewHolder(view);
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == USER_TYPE) {
            ((UserViewHolder) holder).username.setText(usersList.get(position).getName());
            Glide.with(holder.itemView).load(usersList.get(position).getImageUrl()).into(((UserViewHolder) holder).userAvatar);
            ((UserViewHolder) holder).ivDefault.setVisibility(View.GONE);
            if (usersList.get(position).getDefaultStatus() == 1)
                ((UserViewHolder) holder).ivDefault.setVisibility(View.VISIBLE);

            ((UserViewHolder) holder).reorderView.setOnTouchListener((v, event) -> {
                if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
                    touchHelper.startDrag(holder);
                }
                return false;
            });
        } else {
            SectionHeaderViewHolder headerViewHolder = (SectionHeaderViewHolder) holder;
            headerViewHolder.sectionTitle.setText(usersList.get(position).getType());
        }
    }

    @Override
    public int getItemCount() {
        return usersList == null ? 0 : usersList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (TextUtils.isEmpty(usersList.get(position).getName())) {
            return HEADER_TYPE;
        } else {
            return USER_TYPE;
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setUserList(List<User> usersList) {
        this.usersList = usersList;
        notifyDataSetChanged();
    }

    @Override
    public void onViewMoved(int oldPosition, int newPosition) {
        User targetUser = usersList.get(oldPosition);
        User user = new User(targetUser);
        int userDefaultStatus = user.getDefaultStatus();
        User preUser;
        if (oldPosition < newPosition) {
            preUser = usersList.get(newPosition);
        } else {
            preUser = usersList.get(newPosition-1);
        }
        if (userDefaultStatus == 1 && !preUser.getType().equals("Developers")) {
            for (int i = oldPosition; i > newPosition; i--) {
                Collections.swap(usersList, i, i - 1);
            }
            notifyItemMoved(oldPosition, newPosition);
            return;
        }
        usersList.remove(oldPosition);
        user.setType(preUser.getType());
        usersList.add(newPosition, user);
        notifyItemMoved(oldPosition, newPosition);
    }

    @Override
    public void onViewSwiped(int position) {
        usersList.remove(position);
        notifyItemRemoved(position);
    }

    public void setTouchHelper(ItemTouchHelper touchHelper) {
        this.touchHelper = touchHelper;
    }
}
