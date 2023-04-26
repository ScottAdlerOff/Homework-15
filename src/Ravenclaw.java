public class Ravenclaw extends Hogwarts{
    private String name;
    private int cleverness;
    private int wisdom;
    private int creativity;
    private int spellPower;
    private int apparitionDistance;
    public Ravenclaw(String name, int spellPower, int apparitionDistance, int wisdom, int cleverness, int creativity){
        super(name,spellPower,apparitionDistance);
        this.wisdom = wisdom;
        this.cleverness = cleverness;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
