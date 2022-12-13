package FundamentalsWarmUp.RockPaperScissorsByMyagmardorj;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Choose [r]ock, [p]aper, [s]cissors: ");
            String playerMove = scanner.nextLine();
            switch (playerMove) {
                case "r", "rock" -> playerMove = ROCK;
                case "p", "paper" -> playerMove = PAPER;
                case "s", "scissors" -> playerMove = SCISSORS;
                default -> System.out.println("Invalid input. Try Again...");
            }
            Random random = new Random();
            int computerRandomNUmber = random.nextInt(3);
            String computerMove;
            if (computerRandomNUmber==0){
                computerMove = ROCK;
            }else if (computerRandomNUmber==1) {
                computerMove = PAPER;
            } else {
                computerMove = SCISSORS;
            }
            System.out.printf("The computer chose %s \n",computerMove);
            if((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) || (playerMove.equals(PAPER) && computerMove.equals(ROCK)) || (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))){
                System.out.println("You win.");
            } else if ((playerMove.equals(ROCK) && computerMove.equals(ROCK)) || (playerMove.equals(PAPER) && computerMove.equals(PAPER)) || (playerMove.equals(SCISSORS) && computerMove.equals(SCISSORS))) {
                System.out.println("Draw.");
            } else{
                System.out.println("Computer win.");
            }
    }
}
