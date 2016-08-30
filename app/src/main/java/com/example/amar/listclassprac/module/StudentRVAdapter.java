package com.example.amar.listclassprac.module;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amar.listclassprac.R;
import com.example.amar.listclassprac.Student.Student;

import java.util.ArrayList;

/**
 * Created by amar on 8/21/2016.
 */
public class StudentRVAdapter extends RecyclerView.Adapter<StudentViewHolder>{

      Context context;
      ArrayList<Student> studentArrayList;

    public StudentRVAdapter(Context context, ArrayList<Student>students){
          this.context=context;
          this.studentArrayList=students;
        Log.e("test",studentArrayList.size()+"");
    }
    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
         View view= LayoutInflater.from(context).inflate(R.layout.rv_student_item,null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder,int position){
    Student student=studentArrayList.get(position);
        holder.txtName.setText(student.getName());
         holder.txtAge.setText(String.valueOf(student.getAge()));

    }

     @Override
     public int getItemCount(){
      return studentArrayList.size();

    }

}
