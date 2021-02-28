package com.example.pluqqtesting;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class TasksViewHolder extends ChildViewHolder {


    private TextView courseName,question,due_At,time;

    public TasksViewHolder(View itemView) {
        super(itemView);
        courseName = itemView.findViewById(R.id.course_title);
        question =  itemView.findViewById(R.id.question);
        due_At =  itemView.findViewById(R.id.due_at);
        time = itemView.findViewById(R.id.time);
    }

    public void bind(Task task){
         courseName.setText(task.courseName);
         question.setText(task.instructions);
         due_At.setText(task.dueAt);
         time.setText(task.time);
    }
}
