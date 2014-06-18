package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity implements OnClickListener {
//Declaration of variables
	Button btnSubmit,btnCancel;
	EditText etEmail,etPassword;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		btnSubmit=(Button)findViewById(R.id.Submit);
		btnSubmit.setOnClickListener(this);
		btnCancel=(Button)findViewById(R.id.Cancel);
		btnCancel.setOnClickListener(this);
		etEmail=(EditText)findViewById(R.id.Email);
		etPassword=(EditText)findViewById(R.id.Password);
	}

	@Override                                                         
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
