package Task_1;

public class AnimalDoctor {
    private Animal animal;

    public void treatAnimal(Animal animal) {

        System.out.println("Животное ест " + animal.getFood());
        System.out.println("Животное поступило из " + animal.getLocation());
    }


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
