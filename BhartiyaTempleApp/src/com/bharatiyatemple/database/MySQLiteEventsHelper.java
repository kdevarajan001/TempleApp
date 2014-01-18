package com.bharatiyatemple.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteEventsHelper extends SQLiteOpenHelper {

	public static String TABLE_EVENTS = "events";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_EVENT_NAME = "name";
	public static final String COLUMN_EVENT_DESCRIPTION = "description";
	public static final String COLUMN_EVENT_DATE = "date";
	public static final String COLUMN_EVENT_TIME = "time";
	public static final String COLUMN_EVENT_REPEATS = "repeats";
	public static final String COLUMN_EVENT_REPEATS_DESCRIPTION = "repeats_description";

	private static final String DATABASE_NAME = "tbtdb.db";
	private static final int DATABASE_VERSION = 1;

	private static final String DATABASE_CREATE = "create table "
			+ TABLE_EVENTS + "(" + COLUMN_ID
			+ " integer primary key autoincrement, " + COLUMN_EVENT_NAME
			+ " text not null, " + COLUMN_EVENT_DESCRIPTION
			+ " text not null, " + COLUMN_EVENT_DATE
			+ "text not null, " + COLUMN_EVENT_TIME + 
			 "text not null "+ COLUMN_EVENT_REPEATS +
			"text ,"+ COLUMN_EVENT_REPEATS_DESCRIPTION + " text);";

	public MySQLiteEventsHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(MySQLiteEventsHelper.class.getName(),
		        "Upgrading database from version " + oldVersion + " to "
		            + newVersion + ", which will destroy all old data");
		    db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVENTS);
		    onCreate(db);
	}
}
