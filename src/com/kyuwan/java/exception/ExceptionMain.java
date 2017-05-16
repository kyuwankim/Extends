package com.kyuwan.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		
		int array[] = new int[6];

		// java.lang.ArrayIndexOutOfBoundsException 예
		try {

			array[0] = 5;
			array[5] = 10;
			// 에러가 발생하더라도 결과값을 리턴해야한다
			array[6] = 11;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			// Try-catch 를 통해 문제가 생겨도 일단은 진행을 시켜라
			System.out.println("다섯번째값은 : " + array[5]);
		}
		System.out.print("시스템이 완료되었습니다");
	}

}
