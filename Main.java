import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Start game = new Start();
        while (true) {

            System.out.println("================ HELLO DARK WORLD! ================");

            try {

                System.out.println("MENU");
                System.out.println("1. Start");
                System.out.println("2. Exit");
                System.out.print("Choose option: ");

                int menuOption = scan.nextInt();

                if (menuOption == 1) {
                    game.startGame();
                }
                else if (menuOption == 2) {

                    System.out.println("Exiting game...");
                    break;

                }
                else {

                    System.out.println("Invalid menu option!");
                }

            }
            catch (Exception e) {

                System.out.println("Invalid input! Numbers only.");

                scan.nextLine();
            }
        }
        System.out.println("THANK YOU FOR TRAVELING DARK WORLD!");
        scan.close();
    }
}