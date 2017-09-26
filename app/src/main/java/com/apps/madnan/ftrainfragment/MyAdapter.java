package com.apps.madnan.ftrainfragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/**
 * Created by mahmoud adnan on 9/26/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Info> Infolist;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView nameTV, ageTV;

        public MyViewHolder(View view) {
            super(view);
            nameTV = (TextView)view.findViewById(R.id.name);
            ageTV = (TextView)view.findViewById(R.id.age);

        }
    }

    public MyAdapter(List<Info> Infolist) {
        this.Infolist = Infolist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rec_item, parent, false);
        // set the view's size, margins, paddings and layout parameters

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Info info = Infolist.get(position);
        holder.nameTV.setText(info.getName());
        holder.ageTV.setText(info.getAge());
    }



    @Override
    public int getItemCount() {
        return Infolist.size();
    }
}
