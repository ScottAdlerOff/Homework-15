public class PrintService {
        public static void print(Gryffindor[] gryffindors){
        System.out.println("Факультет Гриффиндор: ");
        for (int i = 0; i < gryffindors.length; i++){
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя студента: " + gryffindor.getName() + "; Сила магии: " + gryffindor.getSpellPower() + "; Расстояние трансгрессии: " + gryffindor.getApparitionDistance() + "; Уровень благородства: " + gryffindor.getNobility() + "; Уровень чести: " + gryffindor.getHonor() + "; Уровень храбрости: " + gryffindor.getBravery() + "; Общий уровень навыков: " + gryffindor.getSumSkillGryffindor());
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
    public static int calculateParametersGryffindor(Gryffindor[] gryffindors) {
        int sum = 0;
        for (Gryffindor gryffindor : gryffindors) {
            sum += gryffindor.getApparitionDistance() + gryffindor.getSpellPower() + gryffindor.getHonor() + gryffindor.getNobility() + gryffindor.getBravery();
        }
        System.out.println(sum);
        return sum;
    }
    public static int calculateParametersSlytherin(Slytherin[] slytherins) {
        int sum = 0;
        for (Slytherin slytherin : slytherins) {
            sum += slytherin.getApparitionDistance() + slytherin.getSpellPower() + slytherin.getLustForPower() + slytherin.getCunning() + slytherin.getResourcefulness() + slytherin.getAmbition() + slytherin.getDetermination();
        }
        System.out.println(sum);
        return sum;
    }
    public static int calculateParametersHufflepuff(Hufflepuff[] hufflepuffs) {
        int sum = 0;
        for (Hufflepuff hufflepuff : hufflepuffs) {
            sum += hufflepuff.getApparitionDistance() + hufflepuff.getSpellPower() + hufflepuff.getLoyalty() + hufflepuff.getHonesty() + hufflepuff.getDiligence();
        }
        System.out.println(sum);
        return sum;
    }
    public static int calculateParametersRavenclaw(Ravenclaw[] ravenclaws) {
        int sum = 0;
        for (Ravenclaw ravenclaw : ravenclaws) {
            sum += ravenclaw.getApparitionDistance() + ravenclaw.getSpellPower() + ravenclaw.getCreativity() + ravenclaw.getCleverness() + ravenclaw.getWisdom();
        }
        System.out.println(sum);
        return sum;
    }

}
