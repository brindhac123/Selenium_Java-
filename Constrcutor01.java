package javapackage;

public class Constrcutor01 {

	Constrcutor01(){
		System.out.println("Default constructor");
	}
	String name;
	int roll,age;
	Constrcutor01(String n,int r){
		name=n;
		roll=r;
		System.out.println("Parameter: name "+name+" roll no "+roll);
	}Constrcutor01(String n,int r,int a){
		name=n;
		roll=r;
		age=a;
		System.out.println("Parameter: name "+name+" roll no "+roll+" age "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrcutor01 c1=new Constrcutor01();
		Constrcutor01 c2=new Constrcutor01("Brindha",001);
		Constrcutor01 c3=new Constrcutor01("Velu",002,28);
		
	}

}
