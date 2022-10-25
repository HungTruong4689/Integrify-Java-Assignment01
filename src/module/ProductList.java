package module;

import java.util.ArrayList;
import java.util.ListIterator;

public class ProductList {
    private ArrayList<Product> productItem;

    public ProductList() {
        this.productItem = new ArrayList<Product>();
    }

    public void addProduct(Product item) {
        this.productItem.add(item);
    }

    public void getAllProduct() {
        ListIterator<Product> iterator = productItem.listIterator();
        while (iterator.hasNext()) {
            Product item1 = iterator.next();
            System.out.println(item1);
        }
    }

    public void removeFromProductList(Product removeItem) {
        ListIterator<Product> iterator1 = productItem.listIterator();
        while (iterator1.hasNext()) {
            Product item2 = iterator1.next();
            if (item2.getName().equals(removeItem.getName())) {
                this.productItem.remove(removeItem);
                break;
            }
        }
    }
}
