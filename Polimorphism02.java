package javapackage;

public class Polimorphism02{
	int b=10;
	final int c=20;
	final void add() {
		b=200;
		//c=100;
		System.out.println("final method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polimorphism02 p1=new Polimorphism02();
		p1.add();
		
	}
}
