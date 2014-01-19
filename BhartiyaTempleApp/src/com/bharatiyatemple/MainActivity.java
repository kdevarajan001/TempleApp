package com.bharatiyatemple;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

/**
 * The main activity class is the first class to be launched when
 * the application is started for the first time. */

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.bharatiyatemple.strDispName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_display_name);
    }
    
    /** Called when user clicks on the Save button */
//    public void saveDispName(View view){
//    	Intent intentDispName = new Intent(this, DisplayNameActivity.class);
//    	EditText txtDispName = (EditText)findViewById(R.id.txtDispName);
//    	String strDispName = txtDispName.getText().toString();
//    	intentDispName.putExtra(EXTRA_MESSAGE, strDispName);
//    	startActivity(intentDispName);
//    	
//    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
