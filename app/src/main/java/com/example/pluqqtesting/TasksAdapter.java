package com.example.pluqqtesting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class TasksAdapter  extends ExpandableRecyclerViewAdapter<DaysViewHolder,TasksViewHolder> {
    public TasksAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public DaysViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.days_recycler_view,parent,false);
        return new DaysViewHolder(view);
    }

    @Override
    public TasksViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tasks_recycview,parent,false);
        return new TasksViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(TasksViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Task task = (Task) group.getItems().get(childIndex);
        holder.bind(task);

    }

    @Override
    public void onBindGroupViewHolder(DaysViewHolder holder, int flatPosition, ExpandableGroup group) {

        final DaysModel day = (DaysModel) group;
        holder.bind(day);

    }
}
