package aug8_8;

public class Bus extends Vehicle {
	private int passengerCapacity;

	public Bus() {
		System.out.println("Creating Object with fixed values");
		passengerCapacity = 2;
	}

	public Bus(int pc) {
		System.out.println("Creating Object with parameters values");
		passengerCapacity = pc;
	}

	public Bus(Bus b)

	{

		System.out.println("Creating Object with copy constructor");

		passengerCapacity = b.passengerCapacity;

	}
	
//	public Bus(int nd, double pr, int ms, int pc) {
//		super(nd,pr, ms);
//		System.out.println("Creating Bus using father const  parameter");
//		passengerCapacity = pc;
//	}
	
	public Bus(int nd, double pr, int ms, int pc) {
		this(pc);
		System.out.println("Creating Bus using defailt ourself const  parameter");
		setPrice(pr);
		setNumOfDoors(nd);
		setMaxSpeed(ms);
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "Bus has of " + passengerCapacity + "capacity";
	}
	
	public void setPrice(double pr) {
		if(pr > 50000 && pr < 100000) {
			super.setPrice(pr);
			
		}else {
			System.out.println("Not possible");
		}
	}
}
