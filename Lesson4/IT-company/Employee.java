package com.antongorokh.lesson4.ITcompany;

import java.util.ArrayList;

public class Employee {
    int workHours;
    ArrayList<String> tasksList = new ArrayList<>();

    public Employee (int workHours, String... tasks) {
        this.workHours = workHours;
        for (String task : tasks) tasksList.add(task);
    }

    @Override
    public String toString() {
        String allTasks = "";
        for (int i = 0; i < tasksList.size() - 1; i++) allTasks += tasksList.get(i) + ", ";
        allTasks += tasksList.get(tasksList.size() - 1) + ".";
        return "Work hours: " + workHours + ", Tasks: " + allTasks;
    }
}
