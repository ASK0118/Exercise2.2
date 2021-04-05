package Exercise2p2;

public class Landvehicles {
	String brand;
	int price;
	String color;
	int totprice;
	
	void printInfo(String b, String c, String m, int p) {
		
		System.out.println("Brand: "+ b);
		System.out.println("Color: "+ c);
		System.out.println("Model: "+ m);
		System.out.println("Price: "+ "RM " + p);
	}
	
	void calcprice(int p, int q,String b) {
	
		totprice= p*q;
		System.out.println("Total price of "+q+" " + b + " is " + "RM "+ totprice);
	}
	
	void calBalance(int p) {
		
		int b= p-totprice;
		System.out.println("Payment: RM "+ p);
		System.out.println("Balance: RM "+ b);
	}
	
	void calcdepreciate(int p, int q, int y, int yuse) {
		
		int depValue= p*q/y*yuse;
		int aftDep= p*q-depValue;
		System.out.println("Life expectancy: "+ y + " years");
		System.out.println("Years used: "+ yuse);
		System.out.println("Depreciation value: RM "+ depValue );
		System.out.println("Value after "+ y + " years: " + "RM " + aftDep);
	}
	
}
