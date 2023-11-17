package Task_1;

public class Animal {
    protected   String food;
    protected   String  location;


    public  void makeNoise () {
        System.out.println("Животное издает звук.");
    }

    public void   eat () {
        System.out.println("Животное питается.");
    }

    public void  sleep () {
        System.out.println("Животное спит.");
    }


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
