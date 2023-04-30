public class Hogwarts {
    private String name;
    private int spellPower;
    private int apparitionDistance;
    private int sumSkillHogwarts;

    public Hogwarts(String name, int spellPower, int apparitionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.apparitionDistance = apparitionDistance;
        this.sumSkillHogwarts = spellPower + apparitionDistance;
    }

    public int getSumSkillHogwarts() {
        return sumSkillHogwarts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    public Hogwarts compareSkillHogwarts(Hogwarts hogwarts2) {
        if (this.getSumSkillHogwarts() > hogwarts2.getSumSkillHogwarts()) {
            return this;
        } else {
            return hogwarts2;
        }
    }
}