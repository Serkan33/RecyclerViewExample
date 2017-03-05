package com.mobilhanem.recyclerviewexample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alper on 14.5.2015.
 */
public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView person_name;
        public TextView person_age;
        public ImageView person_img;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = (CardView)view.findViewById(R.id.card_view);
            person_name = (TextView)view.findViewById(R.id.person_name);
            person_age = (TextView)view.findViewById(R.id.person_age);
            person_img = (ImageView)view.findViewById(R.id.person_photo);

        }
    }

    List<Person> list_person;
    public SimpleRecyclerAdapter(List<Person> list_person) {

        this.list_person = list_person;
    }


    @Override
    public SimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.person_name.setText(list_person.get(position).getName());
        holder.person_age.setText(list_person.get(position).getAge());
        holder.person_img.setImageResource(list_person.get(position).getPhoto_id());

    }

    @Override
    public int getItemCount() {
        return list_person.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
