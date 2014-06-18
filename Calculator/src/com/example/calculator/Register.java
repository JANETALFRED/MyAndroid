package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class Register extends Activity implements OnClickListener {
	// Declaration of values
			EditText etFirstname,etPassword,etIDNumber,Email;
			
			Button btnCancel,btnSubmit;

		
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		//Initialization of values
		btnCancel=(Button) findViewById(R.id.Cancel);
		btnCancel.setOnClickListener(this);
		
		
		btnSubmit=(Button) findViewById(R.id.Submit);
		btnSubmit.setOnClickListener(this);
		
		etFirstname=(EditText)findViewById(R.id.FirstName);
	etPassword=(EditText)findViewById(R.id.Password);
	etIDNumber=(EditText)findViewById(R.id.IDNumber);
    Email=(EditText)findViewById(R.id.Email);
    		
    
		
				
		
		
		
		
	}



	@Override
	public void onClick(View v) {
	switch (v.getId()){
	case R.id.Submit:
		startActivity(new Intent(getApplicationContext(),HomeScreen.class));
		
		break;
 
   case R.id.Cancel:
	   startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
		
	
	default:
		break;
	}
		
	}
	}

	
