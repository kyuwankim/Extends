package com.kyuwan.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {

		// java.lang.ArrayIndexOutOfBoundsException 예 
		try{
		int array[] = new int[6];
		
		array[5] = 10;
		array[6] = 11;
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		// Try-catch 를 통해 문제가 생겨도 일단은 진행을 시켜라 
		System.out.println("시스템이 완료되었습니다" );
	}

}
