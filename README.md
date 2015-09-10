# example_roulette
Program to refactor that plays a game of roulette
Arthur Schweitzer (as466), Emanuele Macchi (em186)

1. After refactoring the code there was no need for any if statements, to check which type of Bet is placed. Instead, we made 6 subclasses of the Bet superclass, which have a getUserChoice() method to return the type of Bet placed. This allows us to have a list of different types of Bets, which we can access and utilize accordingly. 

2. In terms of design, we implemented inheritance for our Bet class, which helped simplify the structure, however this was theoretically more complex in nature than using a bunch of if statements. 

3. Didn't really have to make any trade-offs, since we managed to retain all functionality while making it cleaner.

4. We prefer our refactored code, because it's more flexible and it's easier to add new features such as a new type of Bet.