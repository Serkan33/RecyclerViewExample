package com.mobilhanem.recyclerviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private RecyclerView recycler_view;
    private List<Person> person_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recycler_view = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        person_list = new ArrayList<Person>();

        person_list.add(new Person("Serkan Taş ", "22 yaş", R.drawable.boy_img));
        person_list.add(new Person("Furkan Tazegüllü", "22 yaş", R.drawable.user_man_img));
        person_list.add(new Person("Ayşe Turan", "35 yaş", R.drawable.women_img));
        person_list.add(new Person("Ahmet Ali", "60 yaş", R.drawable.male_img));

        SimpleRecyclerAdapter adapter_items = new SimpleRecyclerAdapter(person_list);

        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());


        recycler_view.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

            @Override
            public void onTouchEvent(RecyclerView recycler, MotionEvent event) {

            }

            @Override
            public boolean onInterceptTouchEvent(RecyclerView recycler, MotionEvent event) {
                return false;
            }
        });



    }


}
