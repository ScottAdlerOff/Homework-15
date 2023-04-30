public class Hufflepuff extends Hogwarts {
    private int loyalty;
    private int diligence;
    private int honesty;
    private int sumSkillHufflepuff;

    public Hufflepuff(String name, int spellPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, spellPower, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.sumSkillHufflepuff = spellPower + apparitionDistance + diligence + loyalty + honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getSumSkillHufflepuff() {
        return sumSkillHufflepuff;
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

    public Hufflepuff compareSkillHufflepuff(Hufflepuff hufflepuff2) {
        if (this.getSumSkillHufflepuff() > hufflepuff2.getSumSkillHufflepuff()) {
            return this;
        } else {
            return hufflepuff2;
        }
    }
}
