package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet{
	
	public SingleNumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getUserChoice()
	{
		return "" + ConsoleReader.promptInt("Please bet a number between 1 and 35: ");
	}
	
	@Override
	public boolean getResult(Wheel myWheel, String betChoice)
	{
		return (("" + myWheel.getNumber()).equals(betChoice));
	}

}
