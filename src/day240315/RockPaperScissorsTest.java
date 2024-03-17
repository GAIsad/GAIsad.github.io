package day240315;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsTest {
    public static void main(String[] args) {
        RockPaperScissors R=new RockPaperScissors();
        String userInput;
        while (true){
          userInput=R.getUserinput();

          if(Objects.equals(userInput, "Rock")|| Objects.equals(userInput, "Paper")|| Objects.equals(userInput, "Scissors"))
              break;;
        }
        String computerinput=R.getComputerinput();
        R.DecideWinner();


    }
}