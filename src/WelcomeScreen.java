import java.sql.SQLOutput;
import java.util.Scanner;

public class WelcomeScreen {

    public static void main(String[] args) {
    // Call methods
        welcomeMessage();
        pickSide();
        yourHonor();


    // Juror instance variables
        JurorInformation jur1 = new JurorInformation(20220100, "Dev", 20,false);
        JurorInformation jur2 = new JurorInformation(20220200, "Srikkanth", 25,true);
        JurorInformation jur3 = new JurorInformation(20220300, "Gavaskar", 30,false);
        JurorInformation jur4 = new JurorInformation(20220400, "Amarnath", 35,true);
        JurorInformation jur5 = new JurorInformation(20220500, "Sharma", 40,false);
        JurorInformation jur6 = new JurorInformation(20220600, "Patil", 45,true);
        JurorInformation jur7 = new JurorInformation(20220700, "Azad", 50,false);
        JurorInformation jur8 = new JurorInformation(20220800, "Binny", 55,true);
        JurorInformation jur9 = new JurorInformation(20220900, "Lal", 60,false);
        JurorInformation jur10 = new JurorInformation(20221000, "Sandhu", 65,true);
        JurorInformation jur11 = new JurorInformation(20221100, "Shastri", 70,false);
        JurorInformation jur12 = new JurorInformation(20221200, "Valson", 75,true);

    // Juror methods from JurorInformation.java
        System.out.println("Now it's time to meet the Jury. \nRemember that in this game, voir-dire does not apply \nso you will have to work with the following jurors: \n");
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
    }

    public static void pickSide(){
        // Choose a side
        Scanner sc = new Scanner (System.in);
        System.out.println("You can either play as Defense [0] or Prosecution [1].");
        System.out.println("Please enter  [0]  or  [1]");
        int side = sc.nextInt();
        // Choose Defense team
        if (side == 0) {
            System.out.println("You chose DEFENSE, is that correct? [Y]  or  [N]");
            Scanner scan = new Scanner(System.in);
            String confirm = scan.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                System.out.println("Excellent, good luck!\n\n");
            } else {
                System.out.println("Okay, you can either type [0] for Defense or  [1] for Prosecution.");
                int side2 = scan.nextInt();
                if (side2 == 0) {
                    System.out.println("You chose DEFENSE, good luck!\n\n");
                } else if (side2 == 1) {
                    System.out.println("You chose PROSECUTION, good luck!\n\n");
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
                System.out.println("Excellent, good luck!\n\n");
            } else {
                System.out.println("Okay, you can either type [0] for Defense or  [1] for Prosecution.");
                int side2 = scan.nextInt();
                if (side2 == 0) {
                    System.out.println("You chose DEFENSE, good luck!\n\n");
                } else if (side2 == 1) {
                    System.out.println("You chose PROSECUTION, good luck!\n\n");
                } else {
                    System.out.println("NOT  A  VALID  INPUT");
                }
            }
            // Did not choose an option available
        } else {
            System.out.println("NOT  A  VALID  INPUT, goodbye.");
        }

    }

    public static void yourHonor() {
        System.out.println("Your judge will be ...... \nJustice A.P.S. Gill.\n\n");
    }

    public static void pickCase(){
        System.out.println("Okay, so you have a judge, jury, but what about your case?\n" +
                "We know that since we have a jury we are dealing with a criminal case,\n" +
                "but now you have to type in a number between 0 and 4 to decide your case.");

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter either 0, 1, 2, 3, or 4.");
        int caseNum = sc.nextInt();

        switch (caseNum) {
            case 0:
        }
    }
}


