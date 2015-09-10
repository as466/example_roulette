package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet {

	public ColorBet(String description, int odds) {
		super(description, odds);
		
	}
	
	@Override
	public String getUserChoice()
	{
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	@Override
	public boolean getResult(Wheel myWheel, String betChoice)
	{
		 return myWheel.getColor().equals(betChoice);
	}

}
