import java.util.*;

public class Pig{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        Random rg = new Random();    
        Die die1 = new Die();
        Die die2 = new Die();

        int playerScore = 0;
        int compScore = 0;
        boolean readTheRules = true;
        boolean isPlayerTurn = true;
        boolean gameOver = false;
        boolean keepPlaying = true;
        do{
            readRules();
            int rereadRules = kb.nextInt();
            if(rereadRules != 1){
                readTheRules = false;
            }
        }while(readTheRules);

        do{
            playerScore = 0;
            compScore = 0;
            gameOver = false;
            do{
                System.out.println("\nThe player score is: "+playerScore+" and the computer score is "+compScore+"\n");
                if(isPlayerTurn){
                    //Player Turn
                    int turnScore = 0;
                    boolean isTurnValid = true;
                    do{
                        int decision;
                        System.out.println("Turn Score: "+ turnScore);
                        System.out.println("Press 1 to roll again, or 0 to end your turn");
                        decision = kb.nextInt();
                        if(decision == 1){
                            //Rolling
                            int roll1 = die1.roll();
                            int roll2 = die2.roll();
                            System.out.println("You rolled: "+roll1+ " & "+roll2);
                            if(roll1 == 1 && roll2 == 1 ){
                                playerScore = 0;
                                isTurnValid = false;
                            }
                            else if(roll1 == 1 || roll2 == 1){
                                isTurnValid = false;
                            }
                            else{
                                turnScore += (roll1 + roll2);
                            }
                        } 
                        else if(decision == 0){
                            //Keep score
                            playerScore += turnScore;
                            if(playerScore>=50){
                                gameOver = true;
                            }
                            isTurnValid = false;
                        }

                    }while(isTurnValid);

                    isPlayerTurn = false;
                } else{
                    //Computer turn
                    int turnScore = 0;
                    boolean isTurnValid = true;
                    
                    do{
                        int decision = rg.nextInt(2);
                        System.out.println("Computer Turn Score: "+turnScore);
                        if(decision == 1){
                            System.out.println("Computer is rolling...");
                            int roll1 = die1.roll();
                            int roll2 = die2.roll();
                            System.out.println("The Computer rolled a "+roll1+" and a "+roll2);
                            if(roll1 == 1 && roll2 == 1){
                                compScore = 0;
                                isTurnValid=false;
                            } 
                            else if(roll1 ==1 || roll2 == 1){
                                isTurnValid = false;
                            }
                            else{
                                turnScore += (roll1+roll2);
                            }

                        }else{
                            compScore += turnScore;
                            if(compScore>=50){
                                gameOver = true;
                            }
                            isTurnValid = false;
                        }
                    }while(isTurnValid);
                    System.out.println("Computer is done rolling. Your turn!");
                    isPlayerTurn = true;
                }
            }while(!gameOver);
            System.out.println("The final Score: ");
            System.out.println("Player Score: " + playerScore);
            System.out.println("Computer Score: "+ compScore);
            System.out.println("Press 1 to play again");
            int playAgain=kb.nextInt();
            keepPlaying = (playAgain==1)?(true):(false);
        }while(keepPlaying);


    }
    public static void readRules(){
        System.out.println("On a player's turn, they roll 2 six-sided dice.");
        System.out.println("If neither die is a 1, the total is added to their turn score.");
        System.out.println("The player can choose to continue rolling, or end their turn, and add their turn score to the total score.");
        System.out.println("On a roll, if either die is a 1, that player's turn is over, and their turn score is not added to their total.");
        System.out.println("If both die are 1, the player's entire score is lost, and their turn ends.");
        System.out.println("If you want to read the rules again, press 1");
    }
}