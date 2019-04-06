package com.example.androidcalculator3;

import java.lang.Math;

import android.util.Log;

public class Calculator {
	float input_number_1;
	float input_number_2;
	float transmission;
	float outcome;
	String str;
	int count = 0;
	

	
	public void add_digit(int input){
			if(count == 0){
				input_number_1 = input_number_1 * 10 + input;
				str = Float.toString(input_number_1);	
			}else{
				input_number_1 = (float)(input_number_1 + (input / Math.pow(10, count)));
				count++;
				str = Float.toString(input_number_1);
				System.out.print(input_number_1);
				
			}	
	}
	
	public void addition(){
		input_number_2 = input_number_1;
		clear();
		transmission = 1;
	}
	
	public void multiply(){
		input_number_2 = input_number_1;
		clear();
		transmission = 2;
	}
	
	public void substract(){
		input_number_2 = input_number_1;
		clear();
		transmission = 3;
	}
	
	public void divide(){
		input_number_2 = input_number_1;
		clear();
		transmission = 4;
	}
	
	public void clear(){
		input_number_1 = 0;
		str = null;
		count = 0;
	}
	
	public void clear_all(){
		input_number_1 = 0;
		input_number_2 = 0;
		str = null;
	}
	
	public void operation(){
		if(transmission == 1){
			outcome = input_number_1 + input_number_2;
		}else if(transmission == 2){
			outcome = input_number_1 - input_number_2; 
		}else if(transmission == 3){
			outcome = input_number_1 * input_number_2;
		}else if(transmission == 4){
			outcome = input_number_1 / input_number_2;
		}
		clear_all();
		str = Float.toString(outcome);
	}
	
	public void floatpoint(){
		count++;
	}
}
