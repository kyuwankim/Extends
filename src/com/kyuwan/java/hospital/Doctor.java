package com.kyuwan.java.hospital;

import com.kyuwan.java.design.People;

public class Doctor extends People {

	public void diagnosis(Patient patient){
		System.out.println(patient.getName() + "ȯ�ڸ� �����մϴ�");
	}

}
