package com.kyuwan.java.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
			
		Son son = new Son();
		
		son.setName("junior");
		son.setAge(11);
		
		System.out.println(son.getName());
		System.out.println(son.getAge());
		
	}

}
