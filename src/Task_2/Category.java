package Task_2;

import java.util.List;

public class Category {
    private String  name;
    private List<Product> listOfProduct;

    public Category(String name, List<Product> listOfProduct) {
        this.name = name;
        this.listOfProduct = listOfProduct;
    }
}
