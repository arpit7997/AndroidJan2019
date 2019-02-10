package com.theninequeens.arpit.adapter;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.theninequeens.arpit.intent.R;
import com.theninequeens.arpit.model.Student;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Student> studentArrayList;
    Context ctx;

    public ListViewAdapter(ArrayList<Student> studentArrayList, Context ctx) {
        this.studentArrayList = studentArrayList;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return studentArrayList.size();
    }

    @Override
    public Student getItem(int i) {
        return studentArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(ctx);

        View inflatedView;
        if(view == null){

            inflatedView = layoutInflater.inflate(R.layout.item_row, viewGroup, false);

            ViewHolder vh = new ViewHolder(inflatedView);
            inflatedView.setTag(vh);
        }else {
        inflatedView = view;
        }

        ViewHolder viewHolder = (ViewHolder) inflatedView.getTag();


        Student student = getItem(i);
        viewHolder.name.setText(student.getName());
        viewHolder.designation.setText(student.getDesignation());

        return inflatedView;
    }

    class ViewHolder{
        TextView name, designation;

        public  ViewHolder(View view){
            name = view.findViewById(R.id.name);
            designation = view.findViewById(R.id.designation);
        }
    }
}
