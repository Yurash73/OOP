package Task_4;

public class Task4 {
    public static void main(String[] args) {

        Human grandMaByMa = new Human("Клавдия Петровна", false, 70);
        Human grandPaByMa = new Human("Семён Иванович", true, 73);
        Human grandMaByPa = new Human("Екатерина Ивановна", false, 65);
        Human grandPaByPa = new Human("Иван Петрович", true, 70);
        Human Pa = new Human("Александр Иванович", true, 45,
                grandPaByPa,grandMaByPa);
        Human Ma = new Human("Елена Семёновна", false, 40,
                grandPaByMa,grandMaByMa);
        Human child1 = new Human("Александр", true, 12,Pa,Ma);
        Human child2 = new Human("Мария", false, 10,Pa,Ma);
        Human child3 = new Human("Светлана", false, 8,Pa,Ma);

        System.out.println(grandMaByMa);
        System.out.println(grandPaByMa);
        System.out.println(grandMaByPa);
        System.out.println(grandPaByPa);
        System.out.println(Pa);
        System.out.println(Ma);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }
}
