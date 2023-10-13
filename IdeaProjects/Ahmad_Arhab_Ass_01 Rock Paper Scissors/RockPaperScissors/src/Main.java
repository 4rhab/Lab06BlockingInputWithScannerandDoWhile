import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;
        String playerA = "";
        String playerB = "";

        do {
            boolean doneA = false;
            boolean doneB = false;
            do {
                System.out.println("Player A, make your move. (Must be either R, P or S, capitalization doesn't matter.");
                if (in.hasNext()) {
                    playerA = in.next();
                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                        doneA = true;
                    } else {
                        System.out.println("Not a valid input. Please choose R, P, or S.");
                    }
                }
            } while (!doneA);

            do {
                System.out.println("Player B, make your move. (Must be either R, P or S, capitalization doesn't matter.");
                if (in.hasNext()) {
                    playerB = in.next();
                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                        doneB = true;
                    } else {
                        System.out.println("Invalid input. Please choose R, P, or S.");
                    }
                }
            } while (!doneB);

            if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R"))) {
                System.out.println("Rock vs Rock, it's a Tie!");
            } else if ((playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P"))) {
                System.out.println("Paper vs Paper, it's a Tie!");
            }
            else if ((playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S"))) {
                System.out.println("Scissors vs Scissors, it's a Tie!");
            }
             else if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))) {
                System.out.println("Rock breaks Scissors. Player A Wins.");
            } else if ((playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))) {
                System.out.println("Scissor cuts Paper. Player A Wins.");
            } else if ((playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R"))) {
                System.out.println("Paper covers Rock. Player A Wins.");
            } else if ((playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S"))) {
                System.out.println("Rock breaks Scissors. Player B Wins.");
            } else if ((playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P"))) {
                System.out.println("Scissor cuts Paper. Player B Wins.");
            } else if ((playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R"))) {
                System.out.println("Paper covers Rock. Player B Wins.");
            }

            System.out.println("Would you like to play this again? [Y/N]: ");
            playAgain = in.next();
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}

