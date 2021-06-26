/*
 * Using_Static_Variables_And_Methods.java
 * this is an example and won't run: these would be in two separate
 *     classes ie: Reservation and TestReservation
 * 
 * UML diagrams
 * 
 * reservation program
 * 
 * instance methods can: 
 *     invoke a static method
 *     access a static data field
 *     invoke an instance method
 *     Access an instance data field
 * 
 * static methods can:
 *     invoke a static method
 *     access a static data field
 * 
 */

public class Using_Static_Variables_And_Methods {
	
	String room;
	int day;
	static int nReservations = 0;
	
	//constructor
	Reservation(String newRoom, int newDay) {
		room = newRoom;
		day = newDay;
		nReservations++;
	}
	
	void show() {
		System.out.printf("Room %s reserved on day %d.\n", room, 
				day);
	}
	
	// not an isntance method
	static void showNReservations() {
		System.out.printf("Number of reservations created is: "
				+ " %d.\n", nReservations);
	}
	
	// instance method
	void good() {
		System.out.println(nReservations);
		showNReservations();
	}
	
	
	
	
	public static void main(String[] args) {
		
		Reservation1 r1 = new Reservation("SA114", 0);
		Reservation1 r2 = new Reservation("RF241", 3);
		
		r1.show();
		r2.show();
		
		Reservation.showNReservations();
		
	}

}
