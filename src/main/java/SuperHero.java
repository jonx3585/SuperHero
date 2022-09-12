public class SuperHero {
    private int creationYear;
    private String name;
    private String power;

    public SuperHero(int creationYear, String name, String power)
    {
        this.creationYear = creationYear;
        this.name = name;
        this.power = power;

    }

    public int getCreationYear() {
        return creationYear;
    }
    public String getName() {
        return name;
    }
    private String getPower(){
        return power;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
