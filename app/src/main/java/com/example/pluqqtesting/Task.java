package com.example.pluqqtesting;

import android.os.Parcel;
import android.os.Parcelable;

public class Task implements Parcelable {

    public final String courseName;
    public final String instructions;
    public final String time;
    public final String dueAt;

    public Task(String courseName, String instructions,String time, String dueAt) {
        this.courseName = courseName;
        this.instructions = instructions;
        this.time = time;
        this.dueAt = dueAt;
    }

    protected Task(Parcel in) {
        courseName = in.readString();
        instructions = in.readString();
        time = in.readString();
        dueAt = in.readString();
    }

    public static final Creator<Task> CREATOR = new Creator<Task>() {
        @Override
        public Task createFromParcel(Parcel in) {
            return new Task(in);
        }

        @Override
        public Task[] newArray(int size) {
            return new Task[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(courseName);
        dest.writeString(instructions);
        dest.writeString(time);
        dest.writeString(dueAt);

    }
}
