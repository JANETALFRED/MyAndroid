package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class HomeScreen extends Activity implements OnClickListener {
	//Declaration of Variables
			EditText etNumber1,etNumber2,etResult;
			Button btnAdd,btnSubtraction,btnMultiplication,btnDivision;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
		//Initialization of Variables
		btnAdd=(Button)findViewById(R.id.Add);
		btnAdd.setOnClickListener(this);
        btnSubtraction=(Button)findViewById(R.id.subtraction);
		btnSubtraction.setOnClickListener(this);
		btnMultiplication=(Button)findViewById(R.id.Multiplication);
		btnMultiplication.setOnClickListener(this);
		btnDivision=(Button)findViewById(R.id.Divison);
		btnDivision.setOnClickListener(this);
		
		etNumber1=(EditText)findViewById(R.id.Number1);
		etNumber2=(EditText)findViewById(R.id.Number2);
		etResult=(EditText)findViewById(R.id.Result);
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.Add:
	startActivity(new Intent(getApplicationContext(),Login.class));
				
			break;
		case R.id.subtraction:
			startActivity(new Intent(getApplicationContext(),Login.class));
			break;
		case R.id.Divison:
			startActivity(new Intent(getApplicationContext(),Login.class));
			break;
		case R.id.Multiplication:
			startActivity(new Intent(getApplicationContext(),Login.class));
		default:
			break;
		}
		
	}

}
