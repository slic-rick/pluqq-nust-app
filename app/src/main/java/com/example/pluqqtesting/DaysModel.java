package com.example.pluqqtesting;

import android.os.Parcel;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;
import java.util.List;

public class DaysModel extends ExpandableGroup<Task> {


    public DaysModel(String title, List<Task> items) {
        super(title, items);
    }

}
