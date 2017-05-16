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
}
