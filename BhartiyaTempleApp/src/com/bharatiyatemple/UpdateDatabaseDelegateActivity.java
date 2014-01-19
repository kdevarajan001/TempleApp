package com.bharatiyatemple;

import org.w3c.dom.Text;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bharatiyatemple.database.EventsDataSource;
import com.bhartiyatemple.domain.Event;

public class UpdateDatabaseDelegateActivity extends Activity {

	private EventsDataSource datasource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_database_delegate);

		datasource = new EventsDataSource(this);

		// mySQLiteEventsHelper.getWritableDatabase();

		Button btnSubmit = (Button) findViewById(R.id.button1);

		btnSubmit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

//				Event savedEvent = datasource.createEvent(((Text) v
//						.findViewById(R.id.event_name)).getData(), ((Text) v
//						.findViewById(R.id.event_description)).getData(),
//						((Text) v.findViewById(R.id.event_date)).getData(),
//						((Text) v.findViewById(R.id.event_time)).getData(),
//						((Text) v.findViewById(R.id.event_repeat)).getData(),
//						((Text) v.findViewById(R.id.editText1)).getData());
//
//				Toast.makeText(UpdateDatabaseDelegateActivity.this, "ID: "
//						+ savedEvent.getId() + ",Date:" + savedEvent.getDate()
//						+ ",Time:" + savedEvent.getTime() + ",Description:"
//						+ savedEvent.getDescription() + ",Repeats:"
//						+ savedEvent.getRepeats() + ",Repeat DEscription:"
//						+ savedEvent.getRepeatDescription(), Toast.LENGTH_SHORT);
				
				Toast.makeText(UpdateDatabaseDelegateActivity.this, "submitted event", Toast.LENGTH_SHORT);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.update_database_delegate, menu);
		return true;
	}

}
