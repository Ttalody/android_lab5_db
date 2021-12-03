package com.example.lab5database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user_table")
    LiveData<List<User>> getAll();

    @Query("SELECT * FROM user_table WHERE id IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user_table WHERE name LIKE :first AND " +
            "surname LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Insert
    void insert(User... users);

    @Update
    void update(User user);

    @Delete
    void delete(User user);

    @Query("DELETE FROM user_table")
    void deleteAllUsers();
}
