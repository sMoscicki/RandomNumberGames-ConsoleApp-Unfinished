package sm.randomnumber.account;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance(){

        System.out.println("Your credits: " + getBalance() + " $" + System.lineSeparator());

    }


}
