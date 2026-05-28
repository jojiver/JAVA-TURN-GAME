import java.util.Scanner;

public class Start {

    Scanner scan = new Scanner(System.in);

    Tank tank = new Tank("Spykar", 120);

    Knight knight = new Knight("Jhoelar", 100);

    Archer archer = new Archer("Axelor", 90);

    Mage mage = new Mage("Jonivar", 80);

    public void startGame() {

        System.out.println("==================== TWO PLAYER RPG ====================");

        Character player1 = null;
        Character player2 = null;

        while (true) {

            try {

                System.out.println("\n==========PLAYER 1 - Choose Character==========");
                System.out.println("1. " + tank.getName() + " (Tank)");
                System.out.println("2. " + knight.getName() + " (Knight)");
                System.out.println("3. " + archer.getName() + " (Archer)");
                System.out.println("4. " + mage.getName() + " (Mage)");

                System.out.print("Enter choice: ");
                int choice = scan.nextInt();

                if (choice == 1) {
                    player1 = tank;
                    System.out.println("Player 1: "+ tank.getName());
                }
                else if (choice == 2) {
                    player1 = knight;
                    System.out.println("Player 1: "+ knight.getName());
                }
                else if (choice == 3) {
                    player1 = archer;
                    System.out.println("Player 1: "+ archer.getName());
                }
                else if (choice == 4) {
                    player1 = mage;
                    System.out.println("Player 1: "+ mage.getName());
                }
                else {
                    System.out.println("==========Invalid choice!==========");
                    continue;
                }
                
                break;

            }
            catch (Exception e) {

                System.out.println("==========Numbers only!==========");
                scan.nextLine();
            }
        }

        while (true) {

            try {

                System.out.println("\nPLAYER 2 - Choose Character");
                System.out.println("1. " + tank.getName() + " (Tank)");
                System.out.println("2. " + knight.getName() + " (Knight)");
                System.out.println("3. " + archer.getName() + " (Archer)");
                System.out.println("4. " + mage.getName() + " (Mage)");

                System.out.print("Enter choice: ");
                int choice = scan.nextInt();

                if (choice == 1) {
                    player2 = tank;
                    System.out.println("Player 1: "+ tank.getName());
                }
                else if (choice == 2) {
                    player2 = knight;
                    System.out.println("Player 1: "+ knight.getName());
                }
                else if (choice == 3) {
                    player2 = archer;
                    System.out.println("Player 1: "+ archer.getName());
                }
                else if (choice == 4) {
                    player2 = mage;
                    System.out.println("Player 1: "+ mage.getName());
                }
                else {
                    System.out.println("==========Invalid choice!==========");
                    continue;
                }

                if (player2 == player1) {
                    System.out.println("==========Character already selected!==========");
                    continue;
                }

                break;

            }
            catch (Exception e) {

                System.out.println("==========Numbers only!==========");
                scan.nextLine();
            }
        }

        System.out.println("\n=================================");
        System.out.println("PLAYER 1: " + player1.getName());
        System.out.println("PLAYER 2: " + player2.getName());
        System.out.println("=================================");

        // GAME LOOP
        while (player1.getHp() > 0 && player2.getHp() > 0) {

            System.out.println("\n==================== PLAYER 1 TURN ====================");
            System.out.println(player1.getName() + " HP: " + player1.getHp());
            System.out.println(player2.getName() + " HP: " + player2.getHp());

            try {

                System.out.println("\nChoose Skill");
                System.out.println("1. Skill 1");
                System.out.println("2. Skill 2");

                System.out.print("Enter skill: ");
                int skill = scan.nextInt();

                if (skill == 1) {
                    player1.skill1(player2);
                    
                }
                else if (skill == 2) {
                    player1.skill2(player2);
                }
                else {
                    System.out.println("==========Invalid skill!==========");
                    continue;
                }

            }
            catch (Exception e) {

                System.out.println("==========Numbers only!==========");
                scan.nextLine();
                continue;
            }

            if (player2.getHp() <= 0) {

                System.out.println("\n" + player2.getName() + " was defeated!");
                System.out.println(player1.getName() + " WINS!");
                break;
            }

            // PLAYER 2 TURN
            System.out.println("\n========== PLAYER 2 TURN ==========");
            System.out.println(player1.getName() + " HP: " + player1.getHp());
            System.out.println(player2.getName() + " HP: " + player2.getHp());

            try {

                System.out.println("\nChoose Skill");
                System.out.println("1. Skill 1");
                System.out.println("2. Skill 2");

                System.out.print("Enter skill: ");
                int skill = scan.nextInt();

                if (skill == 1) {
                    player2.skill1(player1);
                }
                else if (skill == 2) {
                    player2.skill2(player1);
                }
                else {
                    System.out.println("==========Invalid skill!==========");
                    continue;
                }

            }
            catch (Exception e) {

                System.out.println("==========Numbers only!==========");
                scan.nextLine();
                continue;
            }

            if (player1.getHp() <= 0) {

                System.out.println("\n" + player1.getName() + " was defeated!");
                System.out.println(player2.getName() + " WINS!");
                break;
            }
        }
    } 
    public void rematch(){
        while (true) {
            
        try {
            System.out.println("==================== Menu ====================");
            System.out.println("1. AGAIN");
            System.out.println("2. QUIT");
            int menuChoice = scan.nextInt();

        if (menuChoice == 1) {
            startGame();
        }
        else if(menuChoice == 2){
            return;
        }
        else {
            System.out.println("==================== Invalid input bro ====================");
        }
        } catch (Exception e) {
            System.out.println("==================== Numbers only!! ====================");
        }
    }
    }
}