import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int answer;
        Scanner sc = new Scanner(System.in);
        DataBase db = new DataBase();
        do {
            System.out.println("Velkommen til SUPERHERO UNIVERSET \n 1. Opret superhelt \n 2. Vis liste \n 9. Afslut ");
            answer = sc.nextInt();
            sc.nextLine();
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

            } else if (answer == 9) {


                System.out.println("Goodbye");
                System.exit(0);
            }
        }
        while(answer != 9);

    }

}
