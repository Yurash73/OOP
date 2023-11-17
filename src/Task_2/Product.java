package Task_2;

public class Product {
    private String name;
    private int price;
    private int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString () {
        String text = "";
        text += "Название: " + this.name;
        text += ", Цена: " + this.price;
        text += ", Рейтинг: " + this.rating;
        return  text;

    }
}
