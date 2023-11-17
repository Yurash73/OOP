package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        List<Product> milksProducts = new ArrayList<>();
        List<Product> spicesProducts = new ArrayList<>();
        List<Product>  byedByUser = new ArrayList<>();

        Product milk = new Product("Молоко", 90,9);
        Product kefir = new Product("Кефир", 110, 8);
        Product yogurt = new Product("Йогурт", 120, 10);
        milksProducts.add(milk);
        milksProducts.add(kefir);
        milksProducts.add(yogurt);

        Product salt = new Product("Соль", 30,7);
        Product sugar = new Product("Сахар", 95,8);
        Product spices = new Product("Специи набор", 220, 10);
        spicesProducts.add(salt);
        spicesProducts.add(sugar);
        spicesProducts.add(spices);

        Category milkProd = new Category("Молочные продукты", milksProducts);
        Category spicesProd = new Category("Специи", spicesProducts);

        byedByUser.add(milk);
        byedByUser.add(sugar);
        byedByUser.add(yogurt);
        byedByUser.add(spices);

        Basket basket = new Basket(byedByUser);

        User byer = new User("Anonymous", "Password", basket);

       basket.getBasketWithProducts().stream()
                                     .forEach(System.out::println);


    }
}
