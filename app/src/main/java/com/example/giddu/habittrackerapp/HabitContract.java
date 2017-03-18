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
        public final static String COLUMN_DAY = "day";
        public final static String COLUMN_CALORIES = "calories";
        public final static String COLUMN_STEPS = "steps";
        public final static String COLUMN_SLEEP = "sleep";
        public final static String COLUMN_WALK_DOG_TIME = "dogWalk";
        public final static String COLUMN_MOOD = "mood";



    }

}
