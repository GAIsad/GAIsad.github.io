package day240111;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println("randomNumber = " + randomNumber);

        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        System.out.println("next = " + next);

        if (randomNumber==next)
        {
            System.out.println("你猜对了！");
        }else if(randomNumber > next)
        {
            System.out.println("too small");
        }else if (randomNumber < next)
        {
            System.out.println("too big");
        }

    }
}
