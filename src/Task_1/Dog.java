package Task_1;

public class Dog extends  Animal{

    private String breed;


    public Dog(String food, String location,String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise () {
        System.out.println("Собака гавкает.");
    }

    @Override
    public void eat () {
        System.out.println("Собака ест " + this.food);
    }

    @Override public void sleep() {
        System.out.println("Собака спит.");
    }
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}
