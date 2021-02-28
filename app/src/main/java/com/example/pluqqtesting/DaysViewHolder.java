package com.example.pluqqtesting;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class DaysViewHolder extends GroupViewHolder {
    private TextView day;
    public DaysViewHolder(View itemView) {
        super(itemView);
        day = itemView.findViewById(R.id.days);
    }

    public void bind(DaysModel days){
        day.setText(days.getTitle());

    }
}
