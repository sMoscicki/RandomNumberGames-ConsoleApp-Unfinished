package sm.randomnumber;

public class Main {
    public static void main(String[] args) {

        RandomNumber number = new RandomNumber();
        Multiplication multi = new Multiplication();
        RangeFinding range = new RangeFinding();

        range.selectingBounty();

        int rate = number.numberDraw(range.getBounty());
        double multiplier = multi.multiplier(rate);

        System.out.println(multiplier);


    }
}