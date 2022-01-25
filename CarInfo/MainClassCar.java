public class MainClassCar {

	public static void main(String[] args) {

		CarInfo obj = new CarInfo();
		String CarName = "";
		double CarNumber = 0;
		// update car name
		CarName = "Honda";
		obj.setName("Toyota");
		System.out.println("Car Name is:" + CarName);

		CarName = obj.getName();

		System.out.println("updated car name is:" + CarName);
		CarNumber = 222;

		obj.setNumber(666);
		System.out.println("car number is:" + CarNumber);
		CarNumber = obj.getNumber();
		System.out.println("updated car number is:" + CarNumber);

	}
}
