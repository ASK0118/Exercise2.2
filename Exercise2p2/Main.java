package Exercise2p2;

public class Main {

	public static void main(String[] args) {
		Landvehicles motorcycle = new Landvehicles();
		Landvehicles car = new Landvehicles();
		Landvehicles bike = new Landvehicles();
		Landvehicles van = new Landvehicles();
		
		System.out.println("Motorcycle Information");
		System.out.println("----------------------");
		motorcycle.printInfo("Yamaha", "Silver", "YZ450F", 5000);
		motorcycle.calcprice(5000, 3, "Yamaha");
		motorcycle.calBalance(20000);
		motorcycle.calcdepreciate(5000, 3, 10, 8);
		System.out.println("===================================");
		System.out.println("");
		
		System.out.println("Car Information");
		System.out.println("----------------------");
		car.printInfo("Toyota", "White", "Vios", 78000);
		car.calcprice(78000, 6, "Toyota");
		car.calBalance(500000);
		car.calcdepreciate(78000, 6, 7, 3);
		System.out.println("===================================");
		System.out.println("");
		
		System.out.println("Bike Information");
		System.out.println("----------------------");
		bike.printInfo("Scott", "Red", "Spark RC", 3000);
		bike.calcprice(3000, 10, "Scott");
		bike.calBalance(51000);
		bike.calcdepreciate(3000, 10, 15, 6);
		System.out.println("===================================");
		System.out.println("");
		
		System.out.println("Van Information");
		System.out.println("----------------------");
		van.printInfo("Nissan", "Black", "NV200", 80000);
		van.calcprice(80000, 2, "Nissan");
		van.calBalance(200000);
		van.calcdepreciate(80000, 2, 12, 4);
		System.out.println("===================================");
		System.out.println("");
		
		
	}

}
