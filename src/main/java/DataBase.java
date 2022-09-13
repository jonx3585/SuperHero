public class DataBase {
    private SuperHero[] heroes = new SuperHero[5];
    private int numOfHeroes;
    public DataBase()
    {

    }

    public void makeHero(int creationYear, String citizenName,String superHeroName, String power, double strength, boolean isHuman){

        SuperHero hero = new SuperHero();
        hero.setCreationYear(creationYear);
        hero.setCitizenName(citizenName);
        hero.setSuperHeroName(superHeroName);
        hero.setPower(power);
        hero.setStrength(strength);
        hero.setIsHuman(isHuman);

        heroes[numOfHeroes++] = hero;

    }
}
