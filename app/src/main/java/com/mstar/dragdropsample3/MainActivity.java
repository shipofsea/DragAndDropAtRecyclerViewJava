package com.mstar.dragdropsample3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

/**
 * Created by Mstar on 02-28-2022.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialView();
    }

    private void initialView() {
        RecyclerView userRecyclerView = findViewById(R.id.lstUser);
        userRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        UserListAdapter adapter = new UserListAdapter();
        SwipeAndDragHelper swipeAndDragHelper = new SwipeAndDragHelper(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(swipeAndDragHelper);
        adapter.setTouchHelper(touchHelper);
        userRecyclerView.setAdapter(adapter);
        touchHelper.attachToRecyclerView(userRecyclerView);

        UsersData usersData = new UsersData();
        List<User> usersList = usersData.getUsersList();
        adapter.setUserList(usersList);
    }
}