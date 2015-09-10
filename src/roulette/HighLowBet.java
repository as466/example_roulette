package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet{
	
	public HighLowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getUserChoice()
	{
		return ConsoleReader.promptOneOf("Please bet", "high", "low");
	}
	
	@Override
	public boolean getResult(Wheel myWheel, String betChoice)
	{
		return (myWheel.getNumber() < 19 && betChoice.equals("low")) ||
                (myWheel.getNumber() >= 19 && betChoice.equals("high"));
	}

}
