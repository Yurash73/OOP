package Task_1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();
        AnimalDoctor AyBolit = new AnimalDoctor();

        animals.add(new Dog("сахарная кость", "Местный рынок", "Дворняга"));
        animals.add(new Cat("Вискас", "улица Лизюкова", "Серый"));
        animals.add(new Horse("Овёс", "Конюшня мэра", 300));

        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).makeNoise();
            AyBolit.treatAnimal(animals.get(i));
        }
    }
}
