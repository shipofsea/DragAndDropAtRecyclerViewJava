package com.mstar.dragdropsample3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Mstar on 02-28-2022.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {

    CardView cvView;
    ImageView userAvatar;
    TextView username;
    ImageView reorderView;
    ImageView ivDefault;

    public UserViewHolder(View itemView) {
        super(itemView);

        cvView = itemView.findViewById(R.id.cvView);
        userAvatar = itemView.findViewById(R.id.ivProfile);
        username = itemView.findViewById(R.id.tvName);
        reorderView = itemView.findViewById(R.id.ivRecorder);
        ivDefault = itemView.findViewById(R.id.ivDefault);
    }
}
