package sm.randomnumber.randomnumgame;

import sm.randomnumber.account.Account;

public class RandomNumberGame {

boolean numberGame(){

    Account account = new Account();
    //For testing balance --> 1000$
    account.setBalance(1000);
    //Display balance
    account.printBalance();
    //Display last round

    //Bet amount
    SetBetAmount setBetAmount = new SetBetAmount();
        setBetAmount.setBetAmountByUser();

    //Bounty selection by the user
    RangeFinding rangeFinding = new RangeFinding();
        rangeFinding.selectingBounty();

    //Multiplication setting
    Multiplication multiplication = new Multiplication();
    double multiplier = multiplication.multiplier(rangeFinding.getBounty());

    //Display of multiplier and expected probably winning
    multiplication.multiplierWriter(multiplier);
    double probablyWinning = probablyWinningValue(setBetAmount.getBetAmount(), multiplier);


    //Number selection by the user
    NumberSelectionByUser numSet = new NumberSelectionByUser();
        numSet.numberSelection();

    //Drawing a number
    RandomNumber randomNumber = new RandomNumber();
        int numberDrawn = randomNumber.numberDraw(rangeFinding.getBounty());

    //Main feature of the game
    if(numSet.getBetNumber() == numberDrawn){

        System.out.println("");
        return true;
    }else{
        return false;
    }




}

    public void resultInformation(boolean a, double b){
        if(a) {
            System.out.println("Your last result"  + b + " $");
        }else{
            System.out.println();
        }
    }

    double probablyWinningValue(double betValue, double multiplier){

        double probablyWinning = (betValue * 0.88) * multiplier;
            if(probablyWinning > 2280.00){
                probablyWinning *= 0.90;
            }
        System.out.println("The expected winnings are: " + probablyWinning);
            return probablyWinning;
    }

}
