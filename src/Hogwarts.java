public class Hogwarts {
    private String name;
    private int spellPower;
    private int apparitionDistance;

    public Hogwarts(String name, int spellPower, int apparitionDistance){
        this.name = name;
        this.spellPower = spellPower;
        this.apparitionDistance = apparitionDistance;
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
}
