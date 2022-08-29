import java.sql.SQLOutput;
import java.util.Scanner;

public class WelcomeScreen {

    public static void main(String[] args) {

        welcomeMessage();

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
