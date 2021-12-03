package com.example.lab5database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    private String surname;

    private String comment;

    public void setId(int id) {
        this.id = id;
    }

    public User(String name, String surname, String comment) {
        this.name = name;
        this.surname = surname;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getComment() {
        return comment;
    }
}
