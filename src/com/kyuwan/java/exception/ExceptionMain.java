package com.kyuwan.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		
		int array[] = new int[6];

		// java.lang.ArrayIndexOutOfBoundsException ��
		try {

			array[0] = 5;
			array[5] = 10;
			// ������ �߻��ϴ��� ������� �����ؾ��Ѵ�
			array[6] = 11;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			// Try-catch �� ���� ������ ���ܵ� �ϴ��� ������ ���Ѷ�
			System.out.println("�ټ���°���� : " + array[5]);
		}
		System.out.print("�ý����� �Ϸ�Ǿ����ϴ�");
	}

}
