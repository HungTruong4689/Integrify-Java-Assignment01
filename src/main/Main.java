package main;

import module.CartItem;
import module.Product;
import module.ProductList;
import module.ShoppingCart;

public class Main {

	public static void main(String[] args) {

		String[] test = { "a", "b", "c" };

		Product p1 = new Product("apple airpod", "vip", "photo1link", test, test, test, 25.0);
		Product p2 = new Product("samsung galaxy", "hightech", "photo2link", test, test, test, 75.50);
		Product p3 = new Product("kindle aws", "easy to read", "photo3link", test, test, test, 149.50);
		Product p4 = new Product("mac book pro", "coding fast", "photo4link", test, test, test, 1329.50);
		Product p5 = new Product("ssd hard drive", "1 tb", "photo5link", test, test, test, 238.50);

		ProductList productList = new ProductList();
		productList.addProduct(p1);
		productList.addProduct(p2);
		productList.addProduct(p3);
		productList.addProduct(p4);
		productList.addProduct(p5);

		System.out.println("ALL PRODUCT");
		productList.getAllProduct();
		System.out.println("-----------------------------------------");

		System.out.println("REMOVE PRODUCT 4");
		productList.removeFromProductList(p4);
		System.out.println("ALL PRODUCT AGAIN");
		productList.getAllProduct();
		System.out.println("-----------------------------------------");

		CartItem i1 = new CartItem(p1, 3);
		CartItem i2 = new CartItem(p2, 2);
		CartItem i3 = new CartItem(p3, 1);
		CartItem i4 = new CartItem(p4, 50);
		CartItem i5 = new CartItem(p5, 2);

		ShoppingCart cart = new ShoppingCart();

		// add to cart
		cart.addToCart(i1);
		cart.addToCart(i2);
		cart.addToCart(i3);
		cart.addToCart(i4);
		cart.addToCart(i5);

		// show cart
		System.out.println("Show CART: ");
		cart.showCart();
		System.out.println("-----------------------------------------");

		// check removeItem of the cart
		cart.removeFromCart(i4);

		// Print totalAmount
		System.out.println("Total Amount:   \t" + cart.getTotalAmount());

		// Print paymentAmount
		System.out.println("Payment Amount: \t" + cart.getPaymentAmount());

		cart.applyCoupon("TEST");

		// Print payable amount
		System.out.println("USING THE WRONG COUPON");
		System.out.println("Payment Invoice: ");
		cart.printPayment();
		System.out.println("-----------------------------------------");

		// Test the right coupon
		cart.applyCoupon("COUPON");

		// Print payable amount
		System.out.println("USING THE RIGHT COUPON");
		System.out.println("Payment Invoice: ");
		cart.printPayment();

	}

}
