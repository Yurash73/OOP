package Task_3;

public class Person {
    private  String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }


    public void move (){

        System.out.println(this.fullName + " гуляет для моциона! ");
    }

    public void talk () {
        System.out.println(this.fullName + " говорит, что ему " +
                this.getAge() + " годиков.");

    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
