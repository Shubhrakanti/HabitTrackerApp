package com.example.giddu.habittrackerapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.giddu.habittrackerapp.HabitContract.HabitEntry;

/**
 * Created by giddu on 3/18/17.
 */

public class HabitDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "habits.db";

    private static final int DATABASE_VERSION = 1;

    public HabitDbHelper (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_HABIT_TABLE =  "CREATE TABLE " + HabitEntry.TABLE_NAME + " ("
                + HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitEntry.COLUMN_CALORIES + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_DAY + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_SLEEP + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_WALK_DOG_TIME + " INTEGER NOT NULL DEFAULT 0, "
                + HabitEntry.COLUMN_MOOD + " TEXT NOT NULL, "
                + HabitEntry.COLUMN_STEPS + " INTEGER NOT NULL DEFAULT 0);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_HABIT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
