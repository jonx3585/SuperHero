import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataBase db = new DataBase();

        System.out.println("Velkommen til superhelte Databasen");

        System.out.println("Indtast årstal for skabelse af helt");
        int creationYear = sc.nextInt();

        System.out.println("Indtast borgerligt navn for helt");
        String citizenName = sc.nextLine();

        System.out.println("Indtast superhelte navn for helt");
        String superHeroName = sc.nextLine();

        System.out.println("Indtast heltens superkraft");
        String power = sc.nextLine();

        System.out.println("Indtast styrkeniveau for helt");
        double strength = sc.nextDouble();

        System.out.println("Indtast om helt er menneske");
        boolean isHuman = sc.nextBoolean();

        db.makeHero(creationYear, citizenName, superHeroName, power, strength, isHuman);


    }

}
