package busreservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
		// TODO Auto-generated method stub
		String p_name;
		int B_no;
		Date date;
		Scanner sc=new Scanner(System.in);
		Booking() throws ParseException{
		System.out.println("Enter passenger name ");
		p_name=sc.next();
		System.out.println("Enter Bus no ");
		B_no=sc.nextInt();
		System.out.println("Enter Date dd-mm-yyyy");
		String dateinput = sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		date=dateformat.parse(dateinput);}
		public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
			int capacity=0;
			for(Bus bus:buses) {
				if(bus.getB_no()==B_no) {
					capacity=bus.getB_no();
					}
			}
			int booked=0;
			for(Booking b: bookings) {
				if(b.B_no==B_no&&b.date.equals(date)) {
					booked++;
				}
			}
			return booked>capacity ? false:true;
			//return false;
			
		}

}
