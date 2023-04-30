public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private int sumSkillSlytherin;
    public Slytherin(String name, int spellPower, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower){
        super(name,spellPower,apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.sumSkillSlytherin = spellPower + apparitionDistance + cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public int getSumSkillSlytherin() {
        return sumSkillSlytherin;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public Slytherin compareSkillSlytherin(Slytherin slytherin2) {
        if (this.getSumSkillSlytherin() > slytherin2.getSumSkillSlytherin()) {
            return this;
        } else {
            return slytherin2;
        }
    }
}