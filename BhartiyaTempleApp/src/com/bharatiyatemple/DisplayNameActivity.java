package com.bharatiyatemple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DisplayNameActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
//        // Get the message from the intent
//
//        Intent intent = getIntent();
//        String strDispMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        // Create the text view
//        TextView textView = new TextView(this);
//        textView.setTextSize(40);
//        textView.setText(strDispMessage);
//
//        // Set the text view as the activity layout
//        setContentView(textView);
        setContentView(R.layout.activity_display_name);
        final Button btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast.makeText(DisplayNameActivity.this, "Clicked on Home", Toast.LENGTH_SHORT).show();
                System.out.println("Testing home click");
            }
        });        
        
        final Button btnEvents = (Button) findViewById(R.id.btnEvents);
        btnEvents.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast.makeText(DisplayNameActivity.this, "Clicked on Events", Toast.LENGTH_SHORT).show();
            	Intent intentUpdateDBMainActivity = new Intent(DisplayNameActivity.this, UpdateDatabaseMainActivity.class);
            	startActivity(intentUpdateDBMainActivity);
            }
        });        
        
    }

  
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
