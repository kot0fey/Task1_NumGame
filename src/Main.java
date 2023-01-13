import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.print("Choose difficulty:\n1)Easy (20 tries)\n2)Medium (12 tries)\n3)Hard (7 tries)\nDifficulty: ");
        Scanner input = new Scanner(System.in);
        int difficulty = input.nextInt();
        int tries;
        switch (difficulty){
            case 1:
                System.out.println("Easy");
                tries = 20;
                break;
            case 2:
                System.out.println("Medium");
                tries = 12;
                break;
            case 3:
                System.out.println("Hard");
                tries = 7;
                break;
            default:
                tries = 0;
                break;
        }
        Random rand = new Random();
        int randomNum = rand.nextInt(50 + 1);   //range from 0 to 50
        System.out.println("Guess the number!");
        int guessNumber;
        boolean winFlag = false;
        do{
            guessNumber = input.nextInt();
            if (guessNumber == randomNum){
                winFlag = true;
            } else {
                System.out.print("Guess again...");
                if (guessNumber > randomNum){
                    System.out.println("Your number is greater. Try less");
                }
                if (guessNumber < randomNum){
                    System.out.println("Your number is less. Try greater");
                }
            }
            System.out.println("You have " + --tries + " tries");
        }while(guessNumber != randomNum && tries > 0);
        if (winFlag){
            System.out.print("YOU WON!!! CONGRATS!!!");
        } else {
            System.out.print("YOU LOST...");
        }
    }
}