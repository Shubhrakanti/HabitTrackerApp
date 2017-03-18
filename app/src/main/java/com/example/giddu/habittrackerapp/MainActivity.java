package com.example.giddu.habittrackerapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.giddu.habittrackerapp.HabitContract.HabitEntry;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void insertHabits() {
        HabitDbHelper mDbHelper = new HabitDbHelper(this);

        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(HabitEntry.COLUMN_CALORIES, 2000); // in kCal
        values.put(HabitEntry.COLUMN_DAY, 1); //in number of day since first started
        values.put(HabitEntry.COLUMN_SLEEP, 8); // in hours
        values.put(HabitEntry.COLUMN_STEPS, 5092); //in steps
        values.put(HabitEntry.COLUMN_WALK_DOG_TIME, 30); //in mins
        values.put(HabitEntry.COLUMN_MOOD, "Happy"); //string for mood

        long newRowId = db.insert(HabitEntry.TABLE_NAME, null, values);

    }

    private Cursor fetchHabits(){

        HabitDbHelper mDbHelper = new HabitDbHelper(this);

        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        String[] projection = {
                HabitEntry._ID,
                HabitEntry.COLUMN_CALORIES,
                HabitEntry.COLUMN_DAY,
                HabitEntry.COLUMN_SLEEP,
                HabitEntry.COLUMN_STEPS,
                HabitEntry.COLUMN_WALK_DOG_TIME,
                HabitEntry.COLUMN_MOOD,
        };

        Cursor cursor = db.query(HabitEntry.TABLE_NAME, projection, null, null, null, null, null);

        return cursor;


    }
}
