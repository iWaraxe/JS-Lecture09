package com.coherentsolutions.section2.example5;

public class Student {
    private Database database;

    public Student(Database database) {
        this.database = database;
    }

    public void persist() {
        // Some save logic here
        //database.save(this);
        database.save(this);
    }
}
