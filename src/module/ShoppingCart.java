package module;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {
	
	ArrayList<CartItem> cartItem;
	double totalAmount;
	double paymentAmount;
	double discount;
	double tax;
	String coupon;

	public ShoppingCart() {
		
		this.cartItem = new ArrayList<CartItem>();
		this.coupon = "";
		this.totalAmount = 0;
		this.paymentAmount = 0;
		this.discount = 0;
		this.tax = 0;
	}
	
	public void addToCart(CartItem item) {
		this.cartItem.add(item);
	}

	public void showCart() {
		
		//this.cartItem.forEach(System.out::println);
		for(int i =0; i< this.cartItem.size();i++) {
			System.out.println(this.cartItem.get(i).toString());
		}
//		ListIterator<CartItem> iterator = cartItem.listIterator();
//		while(iterator.hasNext()) {
//			CartItem item1 = iterator.next();
//			System.out.println(item1);
//		}
	}
	public void removeFromCart(CartItem removeItem) {
		
		for(int i =0; i< this.cartItem.size();i++) {
			if(this.cartItem.get(i).getProductName() == removeItem.getProductName()) {
				this.cartItem.remove(removeItem);
			}
		}
		// ListIterator<CartItem> iterator1 = cartItem.listIterator();
		// while(iterator1.hasNext()) {
		// 	CartItem item2 = iterator1.next();
		// 	if (item2.getProductName().equals(removeItem.getProductName())) {
		// 		this.cartItem.remove(removeItem);
		// 		break;
		// 	}
		// }
	}
	public double getTotalAmount() {
		this.totalAmount = 0;
		for(int i =0; i< this.cartItem.size();i++) {
			this.totalAmount += this.cartItem.get(i).getUnitPrice()*this.cartItem.get(i).getQuantity();
		}
		
		return this.totalAmount;
		
		// ListIterator<CartItem> iterator2 = cartItem.listIterator();
		// this.totalAmount = 0;
		// while(iterator2.hasNext()) {
		// 	CartItem item3 = iterator2.next();
		// 	this.totalAmount = this.totalAmount + (item3.getUnitPrice() * item3.getQuantity());
		// }
		// return this.totalAmount;
	}
	public void applyCoupon(String coupon) {
		this.coupon = coupon;
		if (coupon == "COUPON") {
			this.discount = this.getTotalAmount() * (0.1);
			this.totalAmount = this.totalAmount - this.discount;
		}
		// } else {
		// 	this.totalAmount = this.totalAmount;
		// }
	}
	public double getPaymentAmount() {
		this.paymentAmount = 0;
		this.tax = this.totalAmount * (0.05);
		this.paymentAmount = this.totalAmount + this.tax;
		return this.paymentAmount;
	}
	public void printPayment() {
		
		for(int i =0; i< this.cartItem.size();i++) {

			System.out.print(this.cartItem.get(i).getProductName() + "\t");
			System.out.print(this.cartItem.get(i).getQuantity() + "\t");
			System.out.print(this.cartItem.get(i).getUnitPrice() + "\t");
			System.out.println(this.cartItem.get(i).getUnitPrice()*this.cartItem.get(i).getQuantity());
		}
		
		// ListIterator<CartItem> iterator3 = cartItem.listIterator();
		// while(iterator3.hasNext()) {
		// 	CartItem item4 = iterator3.next();
		// 	System.out.print(item4.getProductName() + "\t");
		// 	System.out.print(item4.getQuantity() + "\t");
		// 	System.out.print(item4.getUnitPrice() + "\t");
		// 	System.out.println(item4.getUnitPrice() * item4.getQuantity());
		// }
		System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());
		this.applyCoupon(this.coupon);
		System.out.println("\t\t\t" + "Discount : " + this.discount);
		this.getPaymentAmount();
		System.out.println("\t\t\t" + "Tax      : " + this.tax);
		System.out.println("\t\t\t" + "Total Payment   : " + this.getPaymentAmount());
	}

}
