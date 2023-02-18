package sm.randomnumber.randomnumgame;

import sm.randomnumber.menu.AppFunction;
import sm.randomnumber.menu.Menu;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class NumberSelectionByUser {

    private int betNumber;

    public int getBetNumber() {
        return betNumber;
    }

    public void setBetNumber(int betNumber) {
        this.betNumber = betNumber;
    }

    void numberSelection(){
        RangeFinding rangeFinding = new RangeFinding();

        boolean stop = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select the bet number: " );
        do {
            try{
                String numberString = scanner.next().toLowerCase();

                if(numberString.isEmpty()) throw new InvalidParameterException();

                if (numberString.equals(AppFunction.EXIT)) {
                    Menu menu = new Menu();
                    menu.menuWriter();
                    stop = false;
                }else if (numberString.equals(AppFunction.BACK)){
                    rangeFinding.selectingBounty();
                    stop = false;
                }else{
                    try{
                        int number = Integer.parseInt(numberString);
                            if((number > rangeFinding.getBounty() || (number < rangeFinding.getBounty())))
                                throw new InvalidParameterException();

                            stop = false;
                            setBetNumber(number);

                    }catch (InvalidParameterException e){
                        System.out.println("Your number must not exceed the range of the game: ");
                    }catch (InputMismatchException e){
                        System.out.println("Specify the correct parameter: ");
                    }finally {
                        scanner.nextLine();
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Enter the correct value: ");
            }catch (InvalidParameterException e){
                System.out.println("The field cannot be empty: ");
            }finally {
                scanner.nextLine();
            }
            scanner.close();
        }while (stop);
    }


}
