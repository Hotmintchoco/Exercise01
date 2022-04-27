package com.ezen;

import lombok.Getter;
import lombok.Setter;

public class CarTest {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
		se.setColor("Red");
		System.out.println(se.getColor());
		
		se.setPassenger(4);
		System.out.println(se.getPassenger() + "명");
		
		Sedan se2 = new Sedan("Bule", 2, 4, 3);
		System.out.println(se2.getPassenger() + "명");
		System.out.println(se2.getColor());
		
		Sports sp = new Sports();
		sp.setColor("red");
		System.out.println(sp.getColor());
		
		Sports sp2 = new Sports("yellow", 2, 4, 1, 5000);
		sp2.run();
	}

}
@Setter
@Getter
class Car {
	private int passenger;
	private int tire;
	private int seat;
	
	public Car(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	public Car() {}
	void run() {
		System.out.println("Drive!");
	}
	void stop() {}
}

@Setter
@Getter
class Sedan extends Car {
	private String color;
	
	public Sedan(String color, int passenger, int tire, int seat) {
		super(passenger, tire, seat);
		this.color = color;
	}
	
	public Sedan() {}
	
	void gas() {}
}

class Sports extends Sedan {
	int horsepower;
	
	public Sports() {}
	Sports(String color, int passenger, int tire, int seat, int horsepower) {
		super(color, passenger, tire, seat);
		this.horsepower = horsepower;
	}
	void run() {
		System.out.println("Drive!");
	}
}

class Bus extends Car {
	int passengerCount;
	void passengerLoad() {}
}

class Truck extends Car {
	int load;
	void objectLoad() {}
}
