package aug8_8;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myarray = new int[5];
		Vehicle[] inventory = new Vehicle[5];
		Vehicle v1 = new Vehicle(5,2500,260),
				v2 = new Vehicle(3,10000,260),
				v3 = new Vehicle(4,7000,230),
				v4 = new Vehicle(v1),
				v5 = new Vehicle(v3);
		
		inventory[0] =v1;
		inventory[1] =v2;
		inventory[2] =v3;
		inventory[3] =v4;
		inventory[4] =v5;
		
		System.out.println("show all the info inside inventory");
		
		for (int i = 0; i < inventory.length; i++) {
		System.out.println("show info of vehicle number "+ (i+1));
		System.out.println("======");
		inventory[i].showInfo();
		System.out.println("======");
			
		}
		
	}

}
