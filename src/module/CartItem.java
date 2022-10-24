package module;

public class CartItem {
	
	private Product product;
	private int quantity;
	private double unitPrice;

	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		this.unitPrice = this.product.getPrice();
	}
	
	public String toString() {
		String s = this.product.getName() + ":";
		s = s+ "\t" + this.product.getPrice() ;
		s = s+ "\t" + this.quantity + "\n";
		return s;
	}

	
	public String getProductName() {
		return this.product.getName();
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getUnitPrice() {
		return this.unitPrice;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	
}
