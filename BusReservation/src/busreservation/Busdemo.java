package busreservation;

import java.text.ParseException;
import java.util.*;

public class Busdemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 45));
		buses.add(new Bus(3, true, 40));
		int ch = 1;
		Scanner sc = new Scanner(System.in);
		for (Bus b : buses) {
			b.displayBusInfo();
		}
		// System.out.println("Enter 1 to book 2 to exit");
		while (ch == 1) {
			System.out.println("Enter 1 to book 2 to exit");
			ch = sc.nextInt();
			if (ch == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Booking confirmed");
				} else {
					System.out.println("sorry. Bus is full");
				}
			} else {
				System.out.println("Exit");
			}
		}
	}

}
