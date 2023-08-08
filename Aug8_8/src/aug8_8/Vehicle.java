package aug8_8;

public class Vehicle {
	private int numOfDoors;

	private double price;

	private int maxSpeed;

	public Vehicle()

	{

		System.out.println("Creating Object with fixed values");

		numOfDoors = 4;

		price = 10000;

		maxSpeed = 280;

	}

	public Vehicle(int nd, double pr, int ms)

	{

		System.out.println("Creating Object with parameters values");

		numOfDoors = nd;

		price = pr;

		maxSpeed = ms;

	}

	public Vehicle(Vehicle vec)

	{

		System.out.println("Creating Object with copy constructor");

		numOfDoors = vec.numOfDoors;

		price = vec.price;

		maxSpeed = vec.maxSpeed;

	}

	public int getNumOfDoors()

	{

		return numOfDoors;

	}

	public void setNumOfDoors(int nd)

	{

		numOfDoors = nd;

	}

	public double getPrice()

	{

		return price;

	}

	public void setPrice(double pr)

	{

		price = pr;

	}

	public int getMaxSpeed()

	{

		return maxSpeed;

	}

	public void setMaxSpeed(int mx)

	{

		maxSpeed = mx;

	}

	public void showInfo() {

		System.out.println("The vehicle has " + numOfDoors + " doors, " +

				"maximum speed of " + maxSpeed + " KM/hr and its price is " + price + "$.");

	}

}
