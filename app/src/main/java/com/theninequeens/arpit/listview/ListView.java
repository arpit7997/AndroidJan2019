package com.theninequeens.arpit.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.theninequeens.arpit.adapter.ListViewAdapter;
import com.theninequeens.arpit.intent.R;
import com.theninequeens.arpit.model.Student;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {


    ArrayList<Student> student = new ArrayList<>();
    android.widget.ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);

        for(int i=0;i<100; i++) {
            student.add(new Student("arpit", "Android developer"));
            student.add(new Student("milind", "Baniya"));
            student.add(new Student("Garvit", "HOB"));
            student.add(new Student("Raj", "center head"));
        }


        ListViewAdapter listViewAdapter = new ListViewAdapter(student, ListView.this);

        listView.setAdapter(listViewAdapter);



    }
}
