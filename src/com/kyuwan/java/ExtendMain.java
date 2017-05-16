package com.kyuwan.java;

import com.kyuwan.java.city.Police;
import com.kyuwan.java.hospital.Hospital;
import com.kyuwan.java.obj.Father;

public class ExtendMain extends Father {

	public static void main(String[] args) {

	Father father = new Father();
	father.process();
	
	
	Police police = new Police();
	police.color = "blue";
	police.floor = "2F";
	
	Hospital hospital = new Hospital();
	
	
	}

}
