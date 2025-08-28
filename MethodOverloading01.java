package javapackage;

public class MethodOverloading01 {

	public void sum() {
		System.out.println("addition on empty");
		
	}
	public void sum(int a, int b) {
		System.out.println("addition of 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading01 m1=new MethodOverloading01();
		m1.sum();
		m1.sum(10,20);

	}

}
