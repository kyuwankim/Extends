package com.kyuwan.java.design;

public class People {
	
	private String name;
	private String gender;
	private int age;
	private String skinColor;
	private String hairColor;
	private int height;
	private int weight;
	
	public void move(String direction){
		System.out.println(direction +" 방향으로 움직인다");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String value){
		name = value;
	}
}
