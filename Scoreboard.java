
/**
 * Computes the wins and losses of the user.
 * 
 * Will Benoit 
 * 
 */
public class Scoreboard
{
    public int UserTieCount(boolean tie, int UserTies) //Creates a new method
    {
        if (tie == true) //Checks a condition
            UserTies = UserTies + 1; //Adds one to the variable
        return UserTies;
    }
    
    public int UserWinCount(boolean win, int UserWins) //Creates a new method
    {
        if (win == true) //Checks a condition
            UserWins = UserWins + 1; //Adds one to the variable
        return UserWins;
    }
    
    public int UserLossCount(boolean loss, int UserLosses) //Creates a new method
    {
        if (loss == true) //Checks a condition
            UserLosses = UserLosses + 1; //Adds one to the variable
        return UserLosses;
    }
}
