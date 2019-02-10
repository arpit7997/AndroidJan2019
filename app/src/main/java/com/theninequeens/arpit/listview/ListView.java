package com.theninequeens.arpit.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.theninequeens.arpit.intent.R;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {


    ArrayList<String> names = new ArrayList<>();
    android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listView);
        names.add("arpit");
        names.add("garvit");
        names.add("milind");
        names.add("raj");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.item_row, R.id.textView,
                names);

        listView.setAdapter(adapter);



    }
}
