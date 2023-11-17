package Task_3;

public class Task3 {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 22);

        person1.move();
        person1.talk();

        person1.setAge(55);
        person1.setFullName("Петр Петрович");
        person1.move();
        person1.talk();

        person2.talk();
        person2.move();
    }
}
