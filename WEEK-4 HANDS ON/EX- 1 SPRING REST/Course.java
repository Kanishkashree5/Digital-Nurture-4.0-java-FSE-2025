

package com.example.coursemanagement.model;

public class Course {
    private int id;
    private String name;
    private String instructor;
    private int durationInHours;

    public Course() {}

    public Course(int id, String name, String instructor, int durationInHours) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public int getDurationInHours() { return durationInHours; }
    public void setDurationInHours(int durationInHours) { this.durationInHours = durationInHours; }
}
