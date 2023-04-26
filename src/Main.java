public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 85, 66),
                new Hogwarts("Гермиона Грейнджер", 78, 72),
                new Hogwarts("Рон Уизли", 61, 76),
                new Hogwarts("Драко Малфой", 79, 64),
                new Hogwarts("Грэхэм Монтегю", 61, 65),
                new Hogwarts("Грегори Гойл", 68, 68),
                new Hogwarts("Захария Смит", 74, 79),
                new Hogwarts("Седрик Диггори", 82, 80),
                new Hogwarts("Джастин Финч-Флетчли", 72, 69),
                new Hogwarts("Чжоу Чанг", 67, 66),
                new Hogwarts("Падма Патил", 69, 68),
                new Hogwarts("Маркус Белби", 71, 72),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 85, 66, 84, 91, 95),
                new Gryffindor("Гермиона Грейнджер", 78, 72, 89, 81, 81),
                new Gryffindor("Рон Уизли", 61, 76, 74, 70, 75),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 79, 64, 78, 84, 92, 79, 95),
                new Slytherin("Грэхэм Монтегю", 61, 65, 71, 77, 68, 61, 80),
                new Slytherin("Грегори Гойл", 68, 68, 69, 78, 72, 60, 75),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 74, 79, 89, 81, 90),
                new Hufflepuff("Седрик Диггори", 82, 80, 81, 87, 80),
                new Hufflepuff("Джастин Финч-Флетчли", 72, 69, 82, 84, 81),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 67, 66, 75, 79, 71),
                new Ravenclaw("Падма Патил", 69, 68, 79, 74, 72),
                new Ravenclaw("Маркус Белби", 71, 72, 81, 77, 74),
        };

        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(gryffindors);
        printService.print(ravenclaws);
        printService.print(slytherins);
        printService.print(hufflepuffs);

    }

    public static int calculateParametersGryffindor() {
        int sum = 0;
        for (Gryffindor gryffindor : gryffindors) {
            sum += gryffindor.getApparitionDistance() + gryffindor.getSpellPower();
        }
        System.out.println(sum);
        return sum;
    }
}
