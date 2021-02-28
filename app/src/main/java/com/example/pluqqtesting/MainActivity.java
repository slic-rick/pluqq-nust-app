package com.example.pluqqtesting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<DaysModel> days = new ArrayList<>();
        ArrayList<Task> mondayTasks = new ArrayList<>();

        mondayTasks.add(new Task("CourseName","instruction","due time","due at"));
        mondayTasks.add(new Task("CourseName2","instruction","due time","due at"));
        mondayTasks.add(new Task("CourseName3","instruction","due time","due at"));
        mondayTasks.add(new Task("CourseName4","instruction","due time","due at"));
        mondayTasks.add(new Task("CourseName5","instruction","due time","due at"));

        DaysModel monday = new DaysModel("Monday",mondayTasks);
        days.add(monday);

        ArrayList<Task> tuesdayTasks = new ArrayList<>();

        tuesdayTasks.add(new Task("CourseName","instruction","due time","due at"));
        tuesdayTasks.add(new Task("CourseName2","instruction","due time","due at"));
        tuesdayTasks.add(new Task("CourseName3","instruction","due time","due at"));
        tuesdayTasks.add(new Task("CourseName4","instruction","due time","due at"));
        tuesdayTasks.add(new Task("CourseName5","instruction","due time","due at"));

        DaysModel tuesday = new DaysModel("Tuesday",tuesdayTasks);
        days.add(tuesday);

        TasksAdapter adapter = new TasksAdapter(days);
        recyclerView.setAdapter(adapter);


    }
}
