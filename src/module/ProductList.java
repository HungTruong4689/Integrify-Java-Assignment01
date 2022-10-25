package module;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> productItem;

    public ProductList() {
		this.productItem = new ArrayList<Product>();
	}

    public void addProduct(Product item) {
		this.productItem.add(item);
	}
	
    public void getAllProduct() {
        for (int i = 0; i < this.productItem.size(); i++) {
            System.out.println(this.productItem.get(i).toString());
        }
    }
    
    public void removeFromProductList(Product removeItem) {	
		for(int i =0; i< this.productItem.size();i++) {
			if(this.productItem.get(i).getName() == removeItem.getName()) {
				this.productItem.remove(removeItem);
			}
		}
	}
}
