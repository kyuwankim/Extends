package com.kyuwan.java.hospital;

import com.kyuwan.java.design.People;

public class Doctor extends People {

	public void diagnosis(Patient patient){
		System.out.println(patient.getName() + "환자를 진료합니다");
	}

}
