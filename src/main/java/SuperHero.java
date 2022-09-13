public class SuperHero {
    private int creationYear;
    private String citizenName;
    private String superHeroName;
    private String power;
    private double strength;
    boolean isHuman = true;

    public SuperHero(int creationYear, String citizenName, String superHeroName, String power, double strength, boolean isHuman) {
        this.creationYear = creationYear;
        this.citizenName = citizenName;
        this.superHeroName = superHeroName;
        this.power = power;
        this.strength = strength;
        this.isHuman = isHuman;
    }

    public SuperHero() {

    }

    public double getStrength() {
        return strength;
    }

    public int getCreationYear() {
        return creationYear;
    }
    public String getCitizenName() {
        return citizenName;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public String getPower(){
        return power;
    }
    public boolean getIsHuman()
    {
        return isHuman;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setName(String citizenName) {
        this.citizenName = citizenName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setIsHuman(boolean isHuman) {
        isHuman = isHuman;
    }
}
