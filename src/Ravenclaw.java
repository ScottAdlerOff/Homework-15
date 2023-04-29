public class Ravenclaw extends Hogwarts{
    private int cleverness;
    private int wisdom;
    private int creativity;
    private int sumSkillRavenclaw;
    public Ravenclaw(String name, int spellPower, int apparitionDistance, int wisdom, int cleverness, int creativity){
        super(name,spellPower,apparitionDistance);
        this.wisdom = wisdom;
        this.cleverness = cleverness;
        this.creativity = creativity;
        this.sumSkillRavenclaw = spellPower + apparitionDistance + wisdom + cleverness + creativity;
    }

    public int getSumSkillRavenclaw() {
        return sumSkillRavenclaw;
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
    public static Ravenclaw compareSkillRavenclaw(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        if (ravenclaw1.getSumSkillRavenclaw() > ravenclaw2.getSumSkillRavenclaw()) {
            return ravenclaw1;
        } else {
            return ravenclaw2;
        }
    }
}
