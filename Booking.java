package BusReservationsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
  String passengerName;
  int busno;
 Date date;

 Booking()
{
	 Scanner sobj=new Scanner(System.in);
	 System.out.println("Enter the passengername");
	 passengerName=sobj.next();
	 System.out.println("Enter the bus no");
	 busno=sobj.nextInt();
	 System.out.println("Enter the date dd-mm-yyyy");
  String dateInput= sobj.next();
  SimpleDateFormat dateFormat= new SimpleDateFormat("dd-mm-yyyy");
  try {
	date=dateFormat.parse(dateInput);
} catch (ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	 
}

public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
	// TODO Auto-generated method stub
	int  capacity =0;
	for(Bus bus:buses) {
		if(bus.getbusno()== busno);
		capacity = bus.getcapacity();
		
	}
	int booked=0;
	for(Booking b:bookings) {
		if(b.busno == busno && b.date.equals(date)) {
			booked++;
		}
	}
	return booked<capacity?true:false;
}
}
