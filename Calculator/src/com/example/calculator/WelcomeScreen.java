package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeScreen extends Activity implements OnClickListener {

   //declaration of values
	Button btnWelcome_Register,btnWelcome_Login;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weclome);
		
		// initialization of values
		btnWelcome_Register=(Button) findViewById(R.id.Welcome_Register);
		btnWelcome_Register.setOnClickListener(this);
		btnWelcome_Login=(Button) findViewById(R.id.welome_Login);
		btnWelcome_Login.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId ()) {
		case R.id.Welcome_Register:
			startActivity(new Intent(getApplicationContext(),Login.class));
			
			break;
			
      case R.id.welome_Login:
    	  
    	  startActivity(new Intent(getApplicationContext(),WelcomeScreen.class));
			
		default:
			break;
		}
		
	}	
}
