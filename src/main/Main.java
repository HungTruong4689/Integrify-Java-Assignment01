package main;

import module.CartItem;
import module.Product;
import module.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		
		String[] test = {"a","b","c"};
		
		CartItem i1 = new CartItem(new Product("apple airpod", "vip","photo1link",test,test,test,25.0), 3);
		CartItem i2 = new CartItem(new Product("samsung galaxy", "hightech","photo2link",test,test,test,75.50), 2);
		CartItem i3 = new CartItem(new Product("kindle aws", "easy to read","photo3link",test,test,test,149.50), 1);
		CartItem i4 = new CartItem(new Product("mac book pro", "coding fast","photo4link",test,test,test,1329.50), 50);
		CartItem i5 = new CartItem(new Product("ssd hard drive", "1 tb","photo5link",test,test,test,238.50), 2);
		
		
		ShoppingCart cart = new ShoppingCart();
		
		
		
		//add to cart
		cart.addToCart(i1);
	    cart.addToCart(i2);
	    cart.addToCart(i3);
	    cart.addToCart(i4);
	    cart.addToCart(i5);
	    
	    
	    //show cart
	    System.out.println("Show CART: \n");
	    cart.showCart();
	    
	    
	    // check removeItem of the cart
	    cart.removeFromCart(i4);
	    
	    //Print totalAmount
	    System.out.println("Total Amount: \t"+cart.getTotalAmount());

	    
	    
	  //Print paymentAmount
	    System.out.println("Payment Amount: \t"+cart.getPaymentAmount());

	    
	    cart.applyCoupon("TEST");
	    
	    //Print payable amount
	    System.out.println("USING THE WRONG COUPON");
	    System.out.println("Payment Invoice: ");
	    cart.printPayment();
	    
	    
	    //Test the right coupon
	    cart.applyCoupon("COUPON");
	    
	  //Print payable amount
	    System.out.println("USING THE RIGHT COUPON");
	    System.out.println("Payment Invoice: ");
	    cart.printPayment();
	    
		
	}

}
