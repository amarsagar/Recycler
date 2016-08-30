package com.example.amar.listclassprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.amar.listclassprac.Student.Student;
import com.example.amar.listclassprac.module.StudentRVAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     RecyclerView rvListview;
    StudentRVAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init(){

       rvListview=(RecyclerView) findViewById(R.id.rvStudent);
       rvListview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Student> list=getDummyData();
        adapter=new StudentRVAdapter(this, list);
        rvListview.setAdapter(adapter);
    }

    private ArrayList<Student> getDummyData() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("A" , 12));
        list.add(new Student("B", 13));
        list.add(new Student("C", 14));


        return list;
    }
}
