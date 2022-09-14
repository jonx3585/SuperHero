import java.util.ArrayList;

public class DataBase {
    private String searchName;
    private ArrayList<SuperHero> database = new ArrayList();
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

    public void searchSuperHero(String searchName) {
        this.searchName = searchName;
        boolean found = false;
        System.out.println("Helt søgt efter" + searchName);
        for (SuperHero hero : database) {
        if(hero.getSuperHeroName().contains(searchName)){
            System.out.println("Helt fundet" + hero);
            found = true;
            }
        }
        if(!found)
            System.out.println("Helten kunne ikke findes");
    }
}
