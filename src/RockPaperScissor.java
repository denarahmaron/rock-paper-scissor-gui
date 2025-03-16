// backend

import java.util.Random;

public class RockPaperScissor {
    // all of the choice that  a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    // store the computer choice so that we can retrieve the value and display it tho the frontend
    private String computerChoice;

    // store the scores so that we can retrieve the values and display it tho the frontend
    private int computerScore, playerScore;

    // use to generate a random number to randomly choose an option for the computer
    Random random;

    // contructor - to initialize random obj
    public RockPaperScissor(){
        random = new Random();
    }

    // call this method to begin playing rock paper scissor
    // playerChoice - is the choice made by the player (i.e rock, paper, or scissors)
    // this method will return the result of the game (i.e computer win, player win, draw)
    public String playRockPaperScissor(String playerChoice){
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // will contain the returning message indicating the result of the game
        String result;

        // evaluate the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Scissor")) {
                result = "Computer Win";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")) {
            if(playerChoice.equals("Scissor")){
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Win";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else {
            // computer chooses scissors
            if(playerChoice.equals("Rock")){
                result = "Player Wins";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "Computer Win";
                computerScore++;
            } else {
                result = "Draw";
            }
        }
        return result;
    }
}
