package com.calc.ateeq.naren;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText txtN1;
	private EditText txtN2;
	private EditText txtAn;
	private Button Add, Sub, Div, Mul, Clear;
	double a = 0, b = 0, c = 0;
	private Button exit;
	
 @Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Add = (Button) findViewById(R.id.btnAdd);
		Sub = (Button) findViewById(R.id.btnSub);
		Div = (Button) findViewById(R.id.btnDiv);
		Mul = (Button) findViewById(R.id.btnMul);
	    Clear = (Button) findViewById(R.id.btnClr);
	    exit = (Button) findViewById(R.id.btnExt);
		txtN1 = (EditText) findViewById(R.id.txtNum1);
		txtN2 = (EditText) findViewById(R.id.txtNum2);
		txtAn = (EditText) findViewById(R.id.txtAns);
 
		
		Add.setOnClickListener(new View.OnClickListener() {	
		 @Override
			public void onClick(View arg0) {
			a = Double.parseDouble(txtN1.getText().toString());
			b = Double.parseDouble(txtN2.getText().toString());
			c = a + b;
			txtAn.setText(""+c);
			}
		});
		
        Sub.setOnClickListener(new View.OnClickListener() {
		 @Override
			public void onClick(View arg0) {
				a = Double.parseDouble(txtN1.getText().toString());
				b = Double.parseDouble(txtN2.getText().toString());
				c = a - b;
				txtAn.setText(""+c);
				}
		});
        
        Mul.setOnClickListener(new View.OnClickListener() {
		 @Override
			public void onClick(View arg0) {
				a = Double.parseDouble(txtN1.getText().toString());
				b = Double.parseDouble(txtN2.getText().toString());
				c = a * b;
				txtAn.setText(""+c);
				}
		});
        
        Div.setOnClickListener(new View.OnClickListener() {
		 @Override
			public void onClick(View arg0) {
				a = Double.parseDouble(txtN1.getText().toString());
				b = Double.parseDouble(txtN2.getText().toString());
				c = a / b;
				txtAn.setText(""+c);
				}
		});
	
 
        Clear.setOnClickListener(new View.OnClickListener() {
		 @Override
		 public void onClick(View arg0) {
			txtN1.setText("");
			txtN2.setText("");
			txtAn.setText("");
			
		 }
		 });
        
        exit.setOnClickListener(new View.OnClickListener() {
			
   		 @Override
   			public void onClick(View arg0) {
   				Intent intent = new Intent(Intent.ACTION_MAIN);
   				intent.addCategory(Intent.CATEGORY_HOME);
   				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
   				startActivity(intent);
   				}
   		});
       
        
 }
 
 @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
 }
 

