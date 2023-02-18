package sm.randomnumber.randomnumgame;

import sm.randomnumber.account.Account;
import sm.randomnumber.menu.AppFunction;
import sm.randomnumber.menu.Menu;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SetBetAmount {

    private double betAmount;

    public double getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(double betAmount) {
        this.betAmount = betAmount;
    }

    void setBetAmountByUser(){
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;

        System.out.print("Minimum bet value 2 $" + System.lineSeparator()
                + "Specify the size of the bet: ");
        do{
            try {
                String betSize = scanner.next().toLowerCase();
                    if(betSize.isEmpty()) throw new InvalidParameterException();

                    if(betSize.equals(AppFunction.EXIT)){
                        Menu menu = new Menu();
                        menu.menuWriter();
                        stop = false;
                    }else{
                        try {
                            Account account = new Account();
                            int amount = Integer.parseInt(betSize);
                                if ((amount > account.getBalance()) || (amount < 2))
                                    throw new InvalidParameterException();

                                stop = false;
                                setBetAmount(amount);

                        }catch (InvalidParameterException e){
                            System.out.println("Failed to place a bet try again: ");
                        }catch (InputMismatchException e){
                            System.out.println("Incorrect value: ");
                        }
                    }
            }catch (InvalidParameterException e){
                System.out.println("The value cannot be empty: ");
            }finally {
                scanner.nextLine();
            }
        }while (stop);
    }

}
