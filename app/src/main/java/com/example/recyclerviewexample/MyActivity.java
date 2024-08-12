package com.example.recyclerviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyActivity extends Activity {
    ArrayList<Person> list=new ArrayList<Person>();
    RecyclerView myRecycler;
    Button btnAdd;
    RecyclerView.LayoutManager manager;
    MyAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        btnAdd=findViewById(R.id.btnAdd);
        myRecycler=findViewById(R.id.myRecycler);
        list.add(new Person("Bishal","Good person."));
        manager=new LinearLayoutManager(this);
        myRecycler.setLayoutManager(manager);
        adapter=new MyAdapter(this,list);
        myRecycler.setAdapter(adapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //write code to insert new record
            }
        });
    }
}
