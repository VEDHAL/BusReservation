package BusReservationsystem;

public class Bus {
	private  int busno;
	private  Boolean ac;
	 private int capacity; //get and set method
	  
Bus(int busno, Boolean ac, int capacity){
	this.busno=busno;
	this.ac=ac;
	this.capacity=capacity;
}

public int getcapacity()//accessor method
{
return capacity;	
}

public void setcapacity()//muttator method
{
	capacity= capacity;
	
	}

public int getbusno() {
	return busno;
}
public void setbusno()
{
	busno= busno;
}

public boolean getac() {
	return ac;
}

public void setac() {
	ac=ac;
}

void displaydetail() {
	System.out.println("busno"+ busno +"ac"+ ac+ "capacity"+ capacity);
}


}
