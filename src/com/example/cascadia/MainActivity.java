package com.example.cascadia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

	private String token;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	public void attemptLogin(View view) {
		sendLogin();
	}

	public void sendLogin() {

		EditText username = (EditText) findViewById(R.id.editText_username_login);
		// EditText password = (EditText)
		// findViewById(R.id.editText_password_login);

		token = username.getText().toString();

		Intent intent = new Intent(this, Welcome.class);

		intent.putExtra("token", token);
		startActivity(intent);
	}

}
