package javapackage;

abstract class dog {
	abstract void animal();
	void print() {
		System.out.println("sound");
	}
}

public class Abstract02 extends dog{
	void animal() {
		System.out.println("DOg");
	}
	public static void main(String[] args) {
	dog d=new Abstract02();
	d.animal();
	d.print();
	}
	
}
