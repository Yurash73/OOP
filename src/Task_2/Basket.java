package Task_2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private  List <Product> basketWithProducts;

    public Basket(List<Product> basketWithProducts) {
        this.basketWithProducts = basketWithProducts;
    }

    public List<Product> getBasketWithProducts() {
        return basketWithProducts;
    }
}
