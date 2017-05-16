package com.kyuwan.java;

import com.kyuwan.java.obj.Father;
import com.kyuwan.java.obj.Son;

public class ExtendMain extends Father {

	public static void main(String[] args) {

		Father fa = new Father();
		fa.lastname = "Doe";
		fa.name = "John";
		fa.car = "Car";
		fa.money = 1000000000;
		
		Son son = new Son();
		son.girlfriend = "Scott";

		son.goDesti();
	

	}

}
