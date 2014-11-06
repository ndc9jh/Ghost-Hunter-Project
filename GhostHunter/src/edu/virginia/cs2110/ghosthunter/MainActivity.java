package edu.virginia.cs2110.ghosthunter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
	
	Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById (R.id.buttonStart);
    }


	@Override
	public void onClick(View v) {
		Intent intent = new Intent (this, NewActivity.class);
		startActivity(intent);
		
	}
}
