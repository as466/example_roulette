package roulette;

import util.ConsoleReader;

public class ThreeConsecutiveBet extends Bet{

	public ThreeConsecutiveBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getUserChoice()
	{
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
	}
	
	@Override
	public boolean getResult(Wheel myWheel, String betChoice)
	{
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
