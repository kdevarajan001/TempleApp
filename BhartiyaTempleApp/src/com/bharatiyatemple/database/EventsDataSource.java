package com.bharatiyatemple.database;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.bhartiyatemple.domain.Event;

public class EventsDataSource {

	private MySQLiteEventsHelper dbHelper;
	private SQLiteDatabase sqLiteDatabase;
	
	private String[] allColumns = { MySQLiteEventsHelper.COLUMN_ID,
			MySQLiteEventsHelper.COLUMN_EVENT_NAME, MySQLiteEventsHelper.COLUMN_EVENT_DESCRIPTION,
			 MySQLiteEventsHelper.COLUMN_EVENT_DATE,MySQLiteEventsHelper.COLUMN_EVENT_TIME,
			 MySQLiteEventsHelper.COLUMN_EVENT_REPEATS,MySQLiteEventsHelper.COLUMN_EVENT_REPEATS_DESCRIPTION};
	
	public EventsDataSource(Context context) {
		dbHelper = new MySQLiteEventsHelper(context);
	}
	
	public void open(){
		sqLiteDatabase = dbHelper.getWritableDatabase();
	}
	
	public void close(){
		dbHelper.close();
	}
	
	public Event createEvent(String name,String description,String date,String time,String repeats, String repeatDescription){
		ContentValues values = new ContentValues();
		values.put(MySQLiteEventsHelper.COLUMN_EVENT_NAME, name);
		values.put(MySQLiteEventsHelper.COLUMN_EVENT_DESCRIPTION,description);
		values.put(MySQLiteEventsHelper.COLUMN_EVENT_DATE, date);
		values.put(MySQLiteEventsHelper.COLUMN_EVENT_TIME, time);
		values.put(MySQLiteEventsHelper.COLUMN_EVENT_REPEATS, repeats);
		values.put(MySQLiteEventsHelper.COLUMN_EVENT_REPEATS_DESCRIPTION, repeatDescription);
		
		long insertId = sqLiteDatabase.insert(MySQLiteEventsHelper.TABLE_EVENTS, null, values);
		
		Cursor cursor = sqLiteDatabase.query(MySQLiteEventsHelper.TABLE_EVENTS, allColumns, null, null, null, null, null);
		
		cursor.moveToFirst();
		
		return cursorToEvent(cursor);
	
	}
	
	private Event cursorToEvent(Cursor cursor){
		Event event = new Event();
		event.setId(cursor.getLong(0));
		event.setName(cursor.getString(1));
		event.setDescription(cursor.getString(2));
		event.setTime(cursor.getString(3));
		event.setRepeats(cursor.getString(4));
		event.setRepeatDescription(cursor.getString(5));
		
		return event;
	}
}
