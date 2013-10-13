package com.bharatiyatemple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class SplashScreen extends Activity {

	private static final int SPLASH_DISPLAY_TIME = 3000; // splash screen delay
															// time

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		 Thread splashThread = new Thread() {
		 @Override
		 public void run() {
		 try {
		 int waited = 0;
		 while (waited < SPLASH_DISPLAY_TIME) {
		 sleep(20);
		 waited += 40;
		 }
		 } catch (InterruptedException e) {
		 // do nothing
		 } finally {
		 finish();
		 Intent i = new Intent();
		 i.setClassName("com.bharatiyatemple",
		 "com.bharatiyatemple.MainActivity");
		 startActivity(i);
		 }
		 }
		 };
		 splashThread.start();
		

//		new Handler().postDelayed(new Runnable() {
//			public void run() {
//
//				Intent intent = new Intent();
//				intent.setClass(SplashScreen.this, MainActivity.class);
//
//				SplashScreen.this.startActivity(intent);
//				SplashScreen.this.finish();
//
//				// transition from splash to main menu
//				overridePendingTransition(R.animate.activityfadein,
//						R.animate.splashfadeout);
//
//			}
//		}, SPLASH_DISPLAY_TIME);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}

}
