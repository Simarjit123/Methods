public class ProductClass1 {
	// no sysout in main class
	public static void main(String[] args) {

		ProductDetails1 obj = new ProductDetails1();// Object of ProductDetails Class
		// using object to call method
		obj.getProductName();
		obj.getProductDescription();
		obj.getPrice();
	}
}
