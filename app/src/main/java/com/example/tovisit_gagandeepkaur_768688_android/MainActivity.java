package com.example.tovisit_gagandeepkaur_768688_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

public class MainActivity extends AppCompatActivity {

    Button addPlace;
    SwipeMenuListView locationListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addPlace = findViewById(R.id.btn_add_place);

        locationListView =  findViewById(R.id.location_list_view);

        addPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LocationActivity.class);
                startActivity(intent);
            }
        });



        SwipeMenuCreator swipeMenuCreator = new SwipeMenuCreator() {
            @Override
            public void create(SwipeMenu menu) {
                SwipeMenuItem deleteitem = new SwipeMenuItem(getApplicationContext());
                deleteitem.setBackground(new ColorDrawable(Color.RED));
                deleteitem.setTitle("Delete");
                deleteitem.setTitleSize(15);
                deleteitem.setTitleColor(Color.WHITE);
                deleteitem.setWidth(170);

                menu.addMenuItem(deleteitem);

                SwipeMenuItem updateitem = new SwipeMenuItem(getApplicationContext());
                updateitem.setBackground(new ColorDrawable(Color.GRAY));
                updateitem.setWidth(170);
                updateitem.setTitle("Update");
                updateitem.setTitleSize(15);
                updateitem.setTitleColor(Color.WHITE);

                menu.addMenuItem(updateitem);
            }
        };
    }
}
