package sm.randomnumber.randomnumgame;

import sm.randomnumber.menu.AppFunction;
import sm.randomnumber.menu.Menu;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeFinding {

    private int bounty;

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    void selectingBounty() {
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;

        System.out.print("Specify the range of drawing numbers: ");
        do {
            try {
                String bountyString = scanner.next().toLowerCase();
                if(bountyString.isEmpty()) throw new InvalidParameterException();

                if(bountyString.equals(AppFunction.EXIT)){
                    Menu menu = new Menu();
                    menu.menuWriter();
                    stop = false;
                }else if(bountyString.equals(AppFunction.BACK)){
                    SetBetAmount setBetAmount = new SetBetAmount();
                        setBetAmount.setBetAmountByUser();
                        stop = false;
                }else{
                    try {

                        int bounty = Integer.parseInt(bountyString);
                        if ((bounty < 5) || (bounty > 100)) throw new InvalidParameterException();

                    }catch (InvalidParameterException e){
                        System.out.println("Give a number in the given range: ");
                    }catch (InputMismatchException e){
                        System.out.println("Incorrect value: ");
                    }
                    stop = false;
                    setBounty(bounty);

                }
            } catch (InputMismatchException e) {
                System.out.println("Give the correct value: ");
            } catch (InvalidParameterException e) {
                System.out.println("Give a value greater than nothing 4: ");
            } finally {
                scanner.nextLine();
            }

        } while (stop);
    }
}