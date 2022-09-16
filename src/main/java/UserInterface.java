import java.util.Scanner;

public class UserInterface {

public void startProgram() {
    Scanner sc = new Scanner(System.in);
    DataBase db = new DataBase();
    int answer;
    do
    {
        System.out.println("Velkommen til superhelte Databasen ");
        System.out.print(" Tast 1 for ny helt \n Tast 2 for liste \n Tast 3 for at søge \n Tast 9 for at afbryde");
        answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("Indtast årstal for skabelse af helt");
            int creationYear = sc.nextInt();
            sc.nextLine();

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


        } else if (answer == 2) {

            db.findSuperHero();

        } else if (answer == 3) {
            System.out.println("Indtast søgeord");
            String search = sc.next();
            db.searchSuperHero(search);

        } else if (answer == 9) {
            System.out.println("Farvel");
            System.exit(0);
        }

    }while(answer != 9);

}
}
