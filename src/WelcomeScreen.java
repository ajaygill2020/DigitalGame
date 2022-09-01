import java.sql.SQLOutput;
import java.util.Scanner;

public class WelcomeScreen {

    public static void main(String[] args) {

        welcomeMessage();

    // Juror instance variables
        JurorInformation jur1 = new JurorInformation();
        JurorInformation jur2 = new JurorInformation();
        JurorInformation jur3 = new JurorInformation();
        JurorInformation jur4 = new JurorInformation();
        JurorInformation jur5 = new JurorInformation();
        JurorInformation jur6 = new JurorInformation();
        JurorInformation jur7 = new JurorInformation();
        JurorInformation jur8 = new JurorInformation();
        JurorInformation jur9 = new JurorInformation();
        JurorInformation jur10 = new JurorInformation();
        JurorInformation jur11 = new JurorInformation();
        JurorInformation jur12 = new JurorInformation();

    // Juror methods from JurorInformation.java
        jur1.presentJuryInfo();
        jur2.presentJuryInfo();
        jur3.presentJuryInfo();
        jur4.presentJuryInfo();
        jur5.presentJuryInfo();
        jur6.presentJuryInfo();
        jur7.presentJuryInfo();
        jur8.presentJuryInfo();
        jur9.presentJuryInfo();
        jur10.presentJuryInfo();
        jur11.presentJuryInfo();
        jur12.presentJuryInfo();


    // Invoke assignRandomCards() method

    }

    public static void welcomeMessage() {
        // Welcome message
        System.out.println("\n\nWelcome to Lawyer Up: Digital Edition");
        System.out.println("\nTo start the game, please enter your name: \n\n\n\n");

        // Enter name
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();

        System.out.println("You entered:  " + name);

        // Choose a side
        System.out.println("You can either play as Defense [0] or Prosecution [1].");
        System.out.println("Please enter  [0]  or  [1]");
        int side = sc.nextInt();
            // Choose Defense team
        if (side == 0) {
            System.out.println("You chose DEFENSE, is that correct? [Y]  or  [N]");
            Scanner scan = new Scanner(System.in);
            String confirm = scan.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                System.out.println("Excellent, good luck!");
            } else {
                System.out.println("Okay, you can either type [0] for Defense or  [1] for Prosecution.");
                int side2 = scan.nextInt();
                if (side2 == 0) {
                    System.out.println("You chose DEFENSE, good luck!");
                } else if (side2 == 1) {
                    System.out.println("You chose PROSECUTION, good luck!");
                } else {
                    System.out.println("NOT  A  VALID  INPUT");
                }
            }
            // Choose Prosecution team
        } else if (side == 1) {
            System.out.println("You chose PROSECUTION, is that correct? [Y]  or  [N]");
            Scanner scan = new Scanner(System.in);
            String confirm = scan.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                System.out.println("Excellent, good luck!");
            } else {
                System.out.println("Okay, you can either type [0] for Defense or  [1] for Prosecution.");
                int side2 = scan.nextInt();
                if (side2 == 0) {
                    System.out.println("You chose DEFENSE, good luck!");
                } else if (side2 == 1) {
                    System.out.println("You chose PROSECUTION, good luck!");
                } else {
                    System.out.println("NOT  A  VALID  INPUT");
                }
            }
            // Did not choose an option available
        } else {
            System.out.println("NOT  A  VALID  INPUT, goodbye.");
        }

    }
}


