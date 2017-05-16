package com.kyuwan.java.obj;

public abstract class Fix {

	public void process() {
		disassemble();
		for (int i = 0; i < 3; i++) {
			replacePart();
			clean();
			assemble();
		}
	}

	public abstract void disassemble();

	public abstract void replacePart();

	public abstract void clean();

	public abstract void assemble();

}
