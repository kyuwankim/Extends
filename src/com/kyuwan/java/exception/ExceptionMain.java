package com.kyuwan.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {

		// java.lang.ArrayIndexOutOfBoundsException �� 
		try{
		int array[] = new int[6];
		
		array[5] = 10;
		array[6] = 11;
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		// Try-catch �� ���� ������ ���ܵ� �ϴ��� ������ ���Ѷ� 
		System.out.println("�ý����� �Ϸ�Ǿ����ϴ�" );
	}

}
