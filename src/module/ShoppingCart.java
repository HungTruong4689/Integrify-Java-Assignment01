package module;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {

	private ArrayList<CartItem> cartItem;
	private double totalAmount;
	private double paymentAmount;
	private double discount;
	private double tax;
	private String coupon;

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
		ListIterator<CartItem> iterator = cartItem.listIterator();
		while (iterator.hasNext()) {
			CartItem item1 = iterator.next();
			System.out.println(item1);
		}
	}

	public void removeFromCart(CartItem removeItem) {
		ListIterator<CartItem> iterator1 = cartItem.listIterator();
		while (iterator1.hasNext()) {
			CartItem item2 = iterator1.next();
			if (item2.getProductName().equals(removeItem.getProductName())) {
				this.cartItem.remove(removeItem);
				break;
			}
		}

	}

	public double getTotalAmount() {
		ListIterator<CartItem> iterator2 = cartItem.listIterator();
		this.totalAmount = 0;
		while (iterator2.hasNext()) {
			CartItem item3 = iterator2.next();
			this.totalAmount = this.totalAmount + (item3.getUnitPrice() *
					item3.getQuantity());
		}
		return this.totalAmount;
	}

	public void applyCoupon(String coupon) {
		this.coupon = coupon;
		if (coupon == "COUPON") {
			this.discount = this.getTotalAmount() * (0.1);
			this.totalAmount = this.totalAmount - this.discount;
		}
	}

	public double getPaymentAmount() {
		this.paymentAmount = 0;
		this.tax = this.totalAmount * (0.05);
		this.paymentAmount = this.totalAmount + this.tax;
		return this.paymentAmount;
	}

	public void printPayment() {
		for (int i = 0; i < this.cartItem.size(); i++) {
			System.out.print(this.cartItem.get(i).getProductName() + "\t");
			System.out.print(this.cartItem.get(i).getQuantity() + "\t");
			System.out.print(this.cartItem.get(i).getUnitPrice() + "\t");
			System.out.println(this.cartItem.get(i).getUnitPrice() * this.cartItem.get(i).getQuantity());
		}
		System.out.println("\t\t\t" + "Total    : " + this.getTotalAmount());
		this.applyCoupon(this.coupon);
		System.out.println("\t\t\t" + "Discount : " + this.discount);
		this.getPaymentAmount();
		System.out.println("\t\t\t" + "Tax      : " + this.tax);
		System.out.println("\t\t\t" + "Total Payment   : " + this.getPaymentAmount());
	}

}
