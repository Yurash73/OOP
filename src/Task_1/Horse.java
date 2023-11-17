package Task_1;

public class Horse extends  Animal {

    private  int weight;

    public Horse(String food, String location,int weight ) {
        super(food, location);
        this.weight = weight;
    }

    @Override
    public void makeNoise () {
        System.out.println("Лошадь ржёт.");
    }

    @Override
    public void eat () {
        System.out.println("Лошадь жуёт " + this.food);
    }
    @Override public void sleep() {
        System.out.println("Лошадь спит.");
    }
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
