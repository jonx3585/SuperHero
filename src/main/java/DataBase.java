import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {

    private ArrayList<SuperHero> database = new ArrayList();

    public DataBase() {

    }

    public void makeHero(int creationYear, String citizenName, String superHeroName, String power, double strength, boolean isHuman) {

        SuperHero hero = new SuperHero();
        hero.setCreationYear(creationYear);
        hero.setCitizenName(citizenName);
        hero.setSuperHeroName(superHeroName);
        hero.setPower(power);
        hero.setStrength(strength);
        hero.setIsHuman(isHuman);

        database.add(hero);

    }

    public void findSuperHero() {
        for (SuperHero hero : database) {
            System.out.print("Creation year " + hero.getCreationYear() + "\n" + "Citizen name " + hero.getCitizenName() +
                    "\n" + "Super Hero name " + hero.getSuperHeroName() +
                    "\n" + "Power " + hero.getPower() + "\n" + "Strength " + hero.getStrength() + "\n" + "Human " + hero.getIsHuman() +
                    "\n");
        }

    }

    public void searchSuperHero(String searchName) {
        String searching = searchName;
        boolean found = false;
        System.out.println("Helt søgt efter " + searching);
        for (SuperHero hero : database) {
            if (hero.getSuperHeroName().contains(searching)) {
                System.out.println("Helt fundet " + hero.getSuperHeroName());
                found = true;
            }
        }
        if (!found)
            System.out.println("Helten kunne ikke findes");
    }

    public void editHero(String searchName) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String searching = searchName;
        ArrayList<SuperHero> searchedHeroes = new ArrayList<SuperHero>();
        boolean found = false;
        System.out.println("Helt søgt efter " + searching);
        for (SuperHero hero : database) {
            if (hero.getSuperHeroName().contains(searching)) {
                searchedHeroes.add(hero);
                found = true;
            }
            if (!searchedHeroes.isEmpty()){
                System.out.println("Her er heltene vi fandt");
                for(SuperHero h: searchedHeroes)
                System.out.println(count + " "+ h.getSuperHeroName());
                count++;
            }
            System.out.println("Vil du redigere en helt tast da nr.");

            int heroNum = 0;
            heroNum = readNumber();
            SuperHero tempHero = searchedHeroes.get(heroNum-1);

            System.out.println("Indtast årstal for skabelse af helt");
            int creationYear = readNumber();
            tempHero.setCreationYear(creationYear);
            sc.nextLine();


            System.out.println("Indtast borgerligt navn for helt");
            String citizenName = readString();
            tempHero.setCitizenName(citizenName);

            System.out.println("Indtast superhelte navn for helt");
            String superHeroName = readString();
            tempHero.setSuperHeroName(superHeroName);

            System.out.println("Indtast heltens superkraft");
            String power = readString();
            tempHero.setPower(power);

            System.out.println("Indtast styrkeniveau for helt");
            double strength = readDoubleNumber();
            tempHero.setStrength(strength);

            System.out.println("Indtast om helt er menneske");
            String humanQuest = readString();
            if(humanQuest.equalsIgnoreCase("ja"))
            tempHero.setIsHuman(true);
            else {
                tempHero.setIsHuman(false);
            }

            break;


        }
        if (!found)
            System.out.println("Helten kunne ikke findes");



    }

    public int readNumber(){
        Scanner sc2 = new Scanner(System.in);
        while(!sc2.hasNextInt()){
            String text = sc2.next();
            System.out.println("Du må ikke indtaste " + text + " det skal være et tal");
        }
        int result = sc2.nextInt();
        return result;
    }

    public String readString(){
        Scanner sc2 = new Scanner(System.in);
        while(!sc2.hasNextLine()){
            int tal = sc2.nextInt();
            System.out.println("Du må ikke indtaste " + tal + " det skal være text");
        }
        String result = sc2.nextLine();
        return result;
    }

    public double readDoubleNumber(){
        Scanner sc2 = new Scanner(System.in);
        while (!sc2.hasNextDouble()) {
            String text = sc2.nextLine();
            System.out.println("Du må ikke indtaste " + text + " det skal være et tal");
        }
        double result = sc2.nextDouble();
        return result;
    }


}

