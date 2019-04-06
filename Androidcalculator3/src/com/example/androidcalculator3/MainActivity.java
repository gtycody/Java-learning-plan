package com.example.androidcalculator3;

import com.example.androidcalculator3.R;
import com.example.androidcalculator3.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Calculator cal = new Calculator();
	
	TextView text_view;
	TextView text_view_2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button_1 = (Button)findViewById(R.id.button_1);
		Button button_2 = (Button)findViewById(R.id.button_2);
		Button button_3 = (Button)findViewById(R.id.button_3);
		Button button_4 = (Button)findViewById(R.id.button_4);
		Button button_5 = (Button)findViewById(R.id.button_5);
		Button button_6 = (Button)findViewById(R.id.button_6);
		Button button_7 = (Button)findViewById(R.id.button_7);
		Button button_8 = (Button)findViewById(R.id.button_8);
		Button button_9 = (Button)findViewById(R.id.button_9);
		Button button_0 = (Button)findViewById(R.id.button_0);
		Button button_ac= (Button)findViewById(R.id.button_ac);
		Button button_a = (Button)findViewById(R.id.button_a);
		Button button_b = (Button)findViewById(R.id.button_b);
		Button button_c = (Button)findViewById(R.id.button_c);
		Button button_d = (Button)findViewById(R.id.button_d);
		Button button_e = (Button)findViewById(R.id.button_e);
		Button button_f = (Button)findViewById(R.id.button_f);
		
		text_view = (TextView)findViewById(R.id.text_view);
		text_view_2 = (TextView)findViewById(R.id.text_view_2);
			
		button_1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(1);
				text_view.setText(cal.str);
			}
		});
		
		button_2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(2);
				text_view.setText(cal.str);
			}
		});
		
		button_3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(3);
				text_view.setText(cal.str);
			}
		});
		
		button_4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(4);
				text_view.setText(cal.str);
			}
		});
		
		button_5.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(5);
				text_view.setText(cal.str);
			}
		});
		
		button_6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(6);
				text_view.setText(cal.str);
			}
		});
		
		button_7.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(7);
				text_view.setText(cal.str);
			}
		});
		
		button_8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(8);
				text_view.setText(cal.str);
			}
		});
		
		button_9.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(9);
				text_view.setText(cal.str);
			}
		});
		
		button_0.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.add_digit(0);
				text_view.setText(cal.str);
			}
		});
		
		button_ac.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.clear();
				text_view.setText(cal.str);
				text_view_2.setText(cal.str);
			}
		});
		
		button_a.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				text_view_2.setText(cal.str + "+");
				cal.addition();
				text_view.setText(cal.str);
				
			}
		});
		
		button_b.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				text_view_2.setText(cal.str + "*");
				cal.substract();
				text_view.setText(cal.str);
			}
		});
		
		button_c.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				text_view_2.setText(cal.str + "-");
				cal.multiply();
				text_view.setText(cal.str);
			}
		});
		
		button_d.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				text_view_2.setText(cal.str + "/");
				cal.divide();
				text_view.setText(cal.str);
			}
		});	
		
		button_e.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.operation();
				text_view.setText(cal.str);
			}
		});	
		
		button_f.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				cal.floatpoint();
				text_view.setText(cal.str);
			}
		});	
	}
}