package com.example.giddu.habittrackerapp;

import android.provider.BaseColumns;

/**
 * Created by giddu on 3/18/17.
 */

public class HabitContract {

    private  HabitContract(){}

    public static final class HabitEntry implements BaseColumns {

        public final static String TABLE_NAME = "actions";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_DAY = "weight";
        public final static String COLUMN_CALORIES = "name";
        public final static String COLUMN_STEPS = "breed";
        public final static String COLUMN_SLEEP = "gender";
        public final static String COLUMN_WALK_DOG_TIME = "weight";
        public final static String COLUMN_MOOD = "mood";



    }

}
