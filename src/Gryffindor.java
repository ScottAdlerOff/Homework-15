public class Gryffindor extends Hogwarts {

    private String name;
    private int nobility;
    private int honor;
    private int bravery;
    private int spellPower;
    private int apparitionDistance;
    private int sumSkillGryffindor;

    public Gryffindor(String name, int spellPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, spellPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.sumSkillGryffindor = spellPower + apparitionDistance + nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getSumSkillGryffindor() {
        return sumSkillGryffindor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public static Gryffindor compareSkillGryffindor(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        if (gryffindor1.getSumSkillGryffindor() > gryffindor2.getSumSkillGryffindor()) {
            return gryffindor1;
        } else {
            return gryffindor2;
        }
    }
}