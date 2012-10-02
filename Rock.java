
/**
 * This program plays a game of rock, paper, scissors with the user.
 * 
 * Will Benoit 
 * 
 */

import java.util.*;

public class Rock
{
    public static void main(String[] args)
    {
        boolean tie = false, win = false, loss = false;
        String response = "y"; //Initial response that starts the play
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated integer that determines computerPlay
        
        int UserTies = 0, UserWins = 0, UserLosses = 0;
        
        Scoreboard ties = new Scoreboard(); //Instantiates a new object in the Scoreboard class
        Scoreboard wins = new Scoreboard(); //Instantiates a new object in the Scoreboard class
        Scoreboard losses = new Scoreboard(); //Instantiates a new object in the Scoreboard class
        Scanner scan = new Scanner(System.in); //Instantiates a new scanner object
        
        while (!response.equals("N"))
            {
             //Get the player's play
             System.out.println("Let's play a game of Rock, Paper, Scissors!");
             System.out.println("Enter either \"R,\" \"P\", \"S\"");
             personPlay = scan.next();
             
             //Make player's play uppercase
             personPlay = personPlay.toUpperCase();
        
             //Checks if the user entered a valid input
             while (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S"))
             {
                 System.out.println(""); //Places a blank line
                 System.out.println("Please enter a valid play."); //Prompts the user for a valid play
                 System.out.println("Enter either \"R,\" \"P\", \"S\""); //Reminds the user what to enter
                 personPlay = scan.next(); //Assigns the next string to personPlay

                 personPlay = personPlay.toUpperCase(); //Sets the string to uppercase
             }
       
                //Randomly generate computerPlay (0, 1, 2)
                computerInt = (int) (Math.random() * 2);
        
                //Translate the random number into a string
                if (computerInt == 0)
                    computerPlay = "R";
                else
                {
                    if (computerInt == 1)
                        computerPlay = "P";
                    else
                        computerPlay = "S";
                }
        
                //Prints computer's and person's play
                System.out.println(""); //Places a blank line
                System.out.println("Your play: " + personPlay); //Outputs the person's play
                System.out.println("Computer's play: " + computerPlay); //Outputs the computer's play
        
                //Find who won
                if (personPlay.equals(computerPlay)) //Checks if personPlay equals computerPlay
                {    System.out.println("It's a tie!"); //Prints out the result
                     tie = true;
                }
                else
                    if (personPlay.equals("R"))
                    {
                        if (computerPlay.equals("S"))
                        {    System.out.println("Rock crushes scissors. You win!");
                             win = true;
                        }     
                        else
                        {    System.out.println("Paper covers rock. You lose.");
                             loss = true;
                        }
                    }
                else
                {
                    if (personPlay.equals("P"))
                    {
                        if (computerPlay.equals("R"))
                        {    System.out.println("Paper covers rock. You win!");
                             win = true;
                        }     
                        else
                        {    System.out.println("Scissors cuts paper. You lose.");
                             loss = true;
                        }     
                    }
                    else
                    {
                        if (computerPlay.equals("P"))
                        {    System.out.println("Scissors cuts paper. You win!");
                             win = true;
                        }
                        else
                        {    System.out.println("Rock crushes scissors. You lose.");
                             loss = true;
                        }
                    }
                }
                UserTies = ties.UserTieCount(tie, UserTies); //Passes values to a method
                
                UserWins = wins.UserWinCount(win, UserWins); //Passes values to a method
                
                UserLosses = losses.UserLossCount(loss, UserLosses); //Passes values to a method
                
                
                System.out.println(""); //Places a blank line
                
                System.out.println("You've won " + UserWins + " game(s).");
                
                System.out.println("You've lost " + UserLosses + " game(s).");
                
                System.out.println("You've tied " + UserTies + " game(s).");
                
                System.out.println(""); //Places a blank line
                
                
                System.out.println("Do you want to play again (Y/N)?");
               
                
                response = scan.next();
                
                System.out.println(""); //Places a blank line
                
                response = response.toUpperCase();
                
                while (!response.equals("Y") && !response.equals("N"))
                {
                 System.out.println("I'm sorry, I didn't understand that.");
                 
                 System.out.println("Do you want to play again (Y/N)?");
  
                 
                 response = scan.next();
                 
                 System.out.println(""); //Places a blank line

                 
                 response = response.toUpperCase();
                }
            }
        }
}
