package com.kyuwan.java.obj;

public class Son extends Father{

	public String wife;
	public String girlfriend;
	
	@Override
	public void process9(){
		
	}
	@Override
	public void goDesti(){
		super.process9(); // �θ�Ŭ���� ȣ�� 
		process9();		// �ڱ��ڽ� ȣ�� 
		
	}
	
	public void process9(int aaa){
		
	}
	public void process9(String s){
		
	}
	public void process9(int a, String b){
		
	}
}
