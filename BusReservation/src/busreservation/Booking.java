package busreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Booking {
		// TODO Auto-generated method stub
		String p_name;
		int B_no;
		Date date;
		Scanner sc=new Scanner(System.in);
		Booking() throws ParseExceptio
		n{
		System.out.println("Enter passenger name ");
		p_name=sc.next();
		System.out.println("Enter Bus no ");
		B_no=sc.nextInt();
		System.out.println("Enter Date dd-mm-yyyy");
		String dateinput = sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		date=dateformat.parse(dateinput);
		public boolean isAvailable( )
		}

}
