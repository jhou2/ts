package com.example.cascadia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class Welcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		Spinner spinner_project = (Spinner) findViewById(R.id.spinner_project);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter_project = ArrayAdapter.createFromResource(this,
		        R.array.projects_array, android.R.layout.simple_spinner_item);  // use CursorAdapter if database
		// Specify the layout to use when the list of choices appears  
		adapter_project.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner_project.setAdapter(adapter_project);
		
		
		
		Spinner spinner_wp = (Spinner) findViewById(R.id.spinner_wp);	
		ArrayAdapter<CharSequence> adapter_wp = ArrayAdapter.createFromResource(this,
		        R.array.wp_array, android.R.layout.simple_spinner_item);	// use CursorAdapter if database
		adapter_wp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner_wp.setAdapter(adapter_wp);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}
	
	
	public class SpinnerActivity extends Activity implements OnItemSelectedListener {
	    
		Spinner spinner_project = (Spinner) findViewById(R.id.spinner_project);
		
		
	    public void onItemSelected(AdapterView<?> parent, View view, 
	            int pos, long id) {
	        // An item was selected. You can retrieve the selected item using
	        // parent.getItemAtPosition(pos)
	    }

	    public void onNothingSelected(AdapterView<?> parent) {
	        // Another interface callback
	    }
	    
	    
	}
	
	public void sendTimesheet(View view) {
		Intent intent = new Intent(this, Timesheet.class);
		startActivity(intent);
	}
	

}
