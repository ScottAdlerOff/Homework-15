public class PrintService {
    public static void print(Hogwarts[] students){
        for (int i = 0; i < students.length; i++){
            Hogwarts hogwarts = students[i];
            System.out.println("Имя студента: " + hogwarts.getName() + "; Сила магии: " + hogwarts.getSpellPower() + "; Расстояние трансгрессии: " + hogwarts.getApparitionDistance());
        }
    }

    public static void print(Gryffindor[] gryffindors){
        System.out.println("Факультет Гриффиндор: ");
        for (int i = 0; i < gryffindors.length; i++){
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя студента: " + gryffindor.getName() + "; Сила магии: " + gryffindor.getSpellPower() + "; Расстояние трансгрессии: " + gryffindor.getApparitionDistance() + "; Уровень благородства: " + gryffindor.getNobility() + "; Уровень чести: " + gryffindor.getHonor() + "; Уровень храбрости: " + gryffindor.getHonor());
        }
    }

    public static void print(Ravenclaw[] ravenclaws){
        System.out.println("Факультет Когтевран: ");
        for (int i = 0; i < ravenclaws.length; i++){
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя студента: " + ravenclaw.getName() + "; Сила магии: " + ravenclaw.getSpellPower() + "; Расстояние трансгрессии: " + ravenclaw.getApparitionDistance() + "; Уровень мудрости: " + ravenclaw.getWisdom() + "; Уровень ума: " + ravenclaw.getCleverness() + "; Уровень творчества: " + ravenclaw.getCreativity());
        }
    }
    public static void print(Slytherin[] slytherins){
        System.out.println("Факультет Слизерин: ");
        for (int i = 0; i < slytherins.length; i++){
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя студента: " + slytherin.getName() + "; Сила магии: " + slytherin.getSpellPower() + "; Расстояние трансгрессии: " + slytherin.getApparitionDistance() + "; Уровень хитрости: " + slytherin.getCunning() + "; Уровень решительности: " + slytherin.getDetermination() + "; Уровень амбициозности: " + slytherin.getAmbition() + "; Уровень находчивости: " + slytherin.getResourcefulness() + "; Уровень жажды власти: " + slytherin.getLustForPower());
        }
    }
    public static void print(Hufflepuff[] hufflepuffs){
        System.out.println("Факультет Пуффендуй: ");
        for (int i = 0; i < hufflepuffs.length; i++){
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя студента: " + hufflepuff.getName() + "; Сила магии: " + hufflepuff.getSpellPower() + "; Расстояние трансгрессии: " + hufflepuff.getApparitionDistance() + "; Уровень трудолюбия: " + hufflepuff.getDiligence() + "; Уровень чести: " + hufflepuff.getHonesty() + "; Уровень верности: " + hufflepuff.getLoyalty());
        }
    }
}
