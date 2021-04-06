import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        final int CHANCES = 5;
        int ranNumber = (int)(Math.random() * 100);
        boolean guessed = false;

        Scanner scan = new Scanner(System.in);

        for (int chance = 0; chance < CHANCES; chance++){
            System.out.print("Guess a number between 1-100: ");

            if (isNumWithinRange(scan.nextInt(), ranNumber)){
                System.out.println("The number is " + ranNumber);
                guessed = true;
                break;
            }
            System.out.println("Incorrect. Keep trying.");
        }

        if (!guessed){
            System.out.println("Sorry. " + ranNumber);
        }
    }

    public static boolean isNumWithinRange(int value, int ranNumber){
        if((ranNumber + 10) >= value && value >= (ranNumber - 10)){
            return true;
        }
        return false;
    }
}
