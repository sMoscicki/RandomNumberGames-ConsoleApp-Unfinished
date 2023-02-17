package sm.randomnumber;

public class Multiplication {
    RandomNumber randomNumber = new RandomNumber();

    private double rate = 1.00;

    public double getRate() {
        return rate;
    }

    double multiplier(int r){

        if (r == 5){
            this.rate = 2.0;
        }
        if ((r > 5 ) && (r <= 15)){
            this.rate = 3.0;
        }
        if ((r > 15) && (r <= 25)){
            this.rate = 4.0;
        }
        return getRate();
    }

}
