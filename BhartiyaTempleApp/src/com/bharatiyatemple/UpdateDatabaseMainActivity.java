package com.bharatiyatemple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.bharatiyatemple.database.MySQLiteEventsHelper;

public class UpdateDatabaseMainActivity extends Activity {

	private MySQLiteEventsHelper mySQLiteEventsHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_database);

		Button addEvent = (Button) findViewById(R.id.add_event);

		addEvent.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mySQLiteEventsHelper.getWritableDatabase();

				Intent addData = new Intent(
						UpdateDatabaseMainActivity.this,
						UpdateDatabaseDelegateActivity.class);
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.update_database, menu);
		return true;
	}

}
