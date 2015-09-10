package roulette;


/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
<<<<<<< HEAD
public abstract class Bet {
=======
public class Bet {
>>>>>>> dcee03c2dac1db1a02e89ba5d5777b7d5dc6bbea
    private String myDescription;
    private int myOdds;

    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {
        myDescription = description;
        myOdds = odds;
    }

    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }
<<<<<<< HEAD
    
    public String getUserChoice()
    {
    	return "";
    }
    
    public boolean getResult(Wheel myWheel, String betChoice)
    {
    	 return false;
    }
=======
>>>>>>> dcee03c2dac1db1a02e89ba5d5777b7d5dc6bbea
}
