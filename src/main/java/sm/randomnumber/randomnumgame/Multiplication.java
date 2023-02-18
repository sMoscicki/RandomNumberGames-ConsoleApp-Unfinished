package sm.randomnumber.randomnumgame;

import sm.randomnumber.randomnumgame.RandomNumber;

public class Multiplication {
    RandomNumber randomNumber = new RandomNumber();

    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    double multiplier(int r){

        if (r == 5)
            setRate(2.0);
        if ((r > 5 ) && (r <= 15))
            setRate(3.0);
        if ((r > 15) && (r <= 25))
            setRate(3.0);

        return getRate();
    }

    void multiplierWriter(double rate){
        System.out.println("The multiplier of your bet is: " + rate);
    }

}
