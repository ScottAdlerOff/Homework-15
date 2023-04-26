public class Hufflepuff extends Hogwarts{
    private String name;
    private int loyalty;
    private int diligence;
    private int honesty;
    private int spellPower;
    private int apparitionDistance;
    public Hufflepuff(String name, int spellPower, int apparitionDistance, int diligence, int loyalty, int honesty){
        super(name,spellPower,apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
