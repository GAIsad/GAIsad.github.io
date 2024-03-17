package day240315;


import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    String user;
    String Computer;
    public static String[] choices = {"Rock", "Scissors", "Paper"};
     String getUserinput(){
        System.out.println("请在Rock，Paper,Scissors中选择一项");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextLine();
        return user;
    }
    String getComputerinput(){
        Random random = new Random();
        Computer= choices[random.nextInt(choices.length)];
        return Computer;
    }
      String DecideWinner() {
        System.out.println("你的选择是：" + user);
        System.out.println("计算机的选择是：" +Computer);

        if (Objects.equals(user, Computer)) {
            System.out.println("平局");
            return "平局";
        }
        if ((Objects.equals(user, "Rock") && Objects.equals(Computer, " AiScissors")) ||
                (Objects.equals(user, "Scissors") && Objects.equals(Computer, "Paper")) ||
                (Objects.equals(user, "Paper") && Objects.equals(Computer, "Rock"))) {
            System.out.println("win");
            return "win";
        } else {
            System.out.println("lose");
            return "lose";
        }


    }

}

