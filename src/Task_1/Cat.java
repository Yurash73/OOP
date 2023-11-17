package Task_1;

public class Cat extends Animal  {
      private String color;



    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise () {
        System.out.println("Кошка мяукает.");
    }

    @Override
    public void eat () {
        System.out.println("Кошка ест + " + this.food);
    }
    @Override public void sleep() {
        System.out.println("Кошка спит.");
    }
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
