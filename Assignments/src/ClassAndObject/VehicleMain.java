package ClassAndObject;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.name = "Ford";
		v.model = "Mustang";
		v.price = 9000000;
		v.getDetails();
		
		System.out.println();
		
		Vehicle v1 = new Vehicle();
		v1.name = "Tata";
		v1.model = "Altroz";
		v1.price = 90000;
		v1.getDetails();
	}

}
