package com.kyuwan.java.obj;

public class Son extends Father{

	public String wife;
	public String girlfriend;
	
	@Override
	public void process9(){
		
	}
	@Override
	public void goDesti(){
		super.process9(); // 부모클래스 호출 
		process9();		// 자기자신 호출 
		
	}
	
	public void process9(int aaa){
		
	}
	public void process9(String s){
		
	}
	public void process9(int a, String b){
		
	}
}
