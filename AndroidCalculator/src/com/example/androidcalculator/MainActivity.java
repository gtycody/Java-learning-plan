package com.example.androidcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	TextView textview_1 = (TextView)findViewById(R.id.textView2);
	EditText edit_text_1 = (EditText)this.findViewById(R.id.editText_1); 
	EditText edit_text_2 = (EditText)this.findViewById(R.id.editText_2); 
	Button botton_1 = (Button)findViewById(R.id.button_1);
	Button botton_2 = (Button)findViewById(R.id.button_2);
	Button botton_3 = (Button)findViewById(R.id.button_3);
	Button botton_4 = (Button)findViewById(R.id.button_4);
	Button botton_5 = (Button)findViewById(R.id.button_5);
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edit_text_1.setOnClickListener(new OnEditorActionListener(){
			
		});
	}

}
