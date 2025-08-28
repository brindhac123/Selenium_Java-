package javapackage;

public class DoWhle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do {
						i++;
			if(i==6) {
				System.out.println(i);
				continue;}
			if(i==8)
				break;
		}
		while(i<=10);
	}

}
