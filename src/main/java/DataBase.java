import java.util.ArrayList;

public class DataBase {
    //private SuperHero[] heroes = new SuperHero[5];
    private ArrayList<SuperHero> database = new ArrayList();
    //private int numOfHeroes;
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

        //heroes[numOfHeroes++] = hero;
        database.add(hero);

    }

    public void findSuperHero(){
        for (SuperHero hero : database)
        {
            System.out.print("Creation year " + hero.getCreationYear() +"\n" + "Citizen name " + hero.getCitizenName() +
                    "\n" + "Super Hero name " +  hero.getSuperHeroName() +
                    "\n" + "Power " + hero.getPower() +"\n"+ "Strength " + hero.getStrength() + "\n" + "Human " + hero.getIsHuman() +
                    "\n");
        }

    }
}
