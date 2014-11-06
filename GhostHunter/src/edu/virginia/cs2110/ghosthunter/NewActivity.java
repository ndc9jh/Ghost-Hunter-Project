package edu.virginia.cs2110.ghosthunter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class NewActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    //Remove title bar
	    this.requestWindowFeature(Window.FEATURE_NO_TITLE);

	    //Remove notification bar
	    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);

	}
	
	//Up Button
	public void up(View v) {
		Toast.makeText(getApplicationContext(), "UP",
				   Toast.LENGTH_SHORT).show();
	}
	
	//Down Button
	public void down(View v) {
		Toast.makeText(getApplicationContext(), "DOWN",
				   Toast.LENGTH_SHORT).show();
	}
	
	//Left Button
	public void left(View v) {
		Toast.makeText(getApplicationContext(), "LEFT",
				   Toast.LENGTH_SHORT).show();
	}
	//Up Button
	public void right(View v) {
		Toast.makeText(getApplicationContext(), "RIGHT",
				   Toast.LENGTH_SHORT).show();
	}
	
	//A Button
	public void pressA(View v) {
		Toast.makeText(getApplicationContext(), "A",
				   Toast.LENGTH_SHORT).show();
	}
	
	//B Button
	public void pressB(View v) {
		Toast.makeText(getApplicationContext(), "B",
				   Toast.LENGTH_SHORT).show();
	}
	
}
