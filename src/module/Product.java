package module;


public class Product {

	private String name;
	private String description;
	private String photo;
	private String[] category;
	private String[] variant;
	private String[] sizes;
	double price;
	//Date createdDate;

	public String toString() {
		String s = this.name + "\t";
		s = s + this.description + "\t";
		s = s + this.price  + "\t";
		return s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String name, String description, String photo, String[] category, String[] variant, String[] sizes,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.photo = photo;
		this.category = category;
		this.variant = variant;
		this.sizes = sizes;
		this.price = price;
	}
}
