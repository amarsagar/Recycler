package com.example.amar.listclassprac.module;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.amar.listclassprac.R;

/**
 * Created by amar on 8/21/2016.
 */
public class StudentViewHolder extends RecyclerView.ViewHolder{
    TextView txtName,txtAge;
    public StudentViewHolder(View itemView){
        super(itemView);

        txtName=(TextView) itemView.findViewById(R.id.txtName);
        txtAge=(TextView) itemView.findViewById(R.id.txtAge);
    }
}
