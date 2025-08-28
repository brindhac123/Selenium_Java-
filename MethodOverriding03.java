package javapackage;

public class MethodOverriding03 extends MethodOverriding01 {
	public void eat() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding01 m1= new MethodOverriding01();
		m1.eat();
		MethodOverriding03 m2=new MethodOverriding03();
				m2.eat();
				
	}

}
