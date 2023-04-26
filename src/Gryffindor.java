public class Gryffindor extends Hogwarts {

    private String name;
    private int nobility;
    private int honor;
    private int bravery;
    private int spellPower;
    private int apparitionDistance;

    public Gryffindor(String name, int spellPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, spellPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

}