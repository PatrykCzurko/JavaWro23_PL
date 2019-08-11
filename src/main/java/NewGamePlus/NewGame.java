package NewGamePlus;

import java.util.Random;
import java.util.Scanner;


public class NewGame {
    private static final int upperBound = 100;
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(upperBound);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++){
            int playerNumber = scanner.nextInt();
            if (playerNumber == number){
                System.out.println("Gz");
                break;

            }
            if (playerNumber <number)
                System.out.println("za mało");
                else
                System.out.println("za dużo");
            }
        System.out.println(random);
        }

    }





