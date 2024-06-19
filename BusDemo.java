package BusReservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
public static void main(String[]args) {
	ArrayList <Bus>buses= new ArrayList<Bus>();
	ArrayList <Booking>bookings= new ArrayList<Booking>();
	
	buses.add(new Bus(1,true,45));
	buses.add(new Bus(2,false,34));
	buses.add(new Bus(3,true,23));
	
	int useroption=1;
	Scanner sobj= new Scanner(System.in);
	
	for(Bus b: buses) {  //for  interger  i present  in the array, for  bus object present  in the list
		b.displaydetail();
	}
	while(useroption==1) {
	System.out.println("Enter 1 to book and 2 to exit");
	useroption=sobj.nextInt();
	if(useroption==1) {
Booking books= new Booking();
if(books.isAvailable(bookings,buses)) {
	bookings.add(books);
	System.out.println("your booking is connfirmed");
}
else
	System.out.println("sorry bus is full try another bus or date");
	
	}
	}
	
	
	
	
}
}
