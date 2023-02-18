package sm.randomnumber.account;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddingMethods {

    private int blikCode = 123456;

    public int getBlikCode() {
        return blikCode;
    }

    Scanner scanner = new Scanner(System.in);
    Account account = new Account();

    public double setCashValue(){
        System.out.print("Maximum deposit amount is 1000" + System.lineSeparator()
                + "Specify the amount to be paid: ");
        return scanner.nextDouble();
    }


    public boolean cashAddingMethodBlik(){

        boolean stop = true;

            System.out.print("Enter Blick Code");
            do {
                try {
                    int code = scanner.nextInt();
                        if ((code < 99999) || (code > 999999)) throw new InvalidParameterException();

                        if(code == getBlikCode()){
                            System.out.print("The transaction was successful");
                            return true;
                        }

                    stop = false;
                }catch (InputMismatchException e){
                    System.out.print("Specify the range of drawing numbers: ");

                }catch (InvalidParameterException e){
                    System.out.print("Give the correct value: ");

                }finally {
                    scanner.nextLine();
                }
            }while(stop);

      return false;
    }

    boolean cashAddingMethodsCreditCard(){
        boolean stop = true;

        System.out.println();
        do {
            try {


            }catch(InputMismatchException e) {
                System.out.print("Specify the range of drawing numbers: ");
            }catch (InvalidParameterException e) {
                System.out.print("Give the correct value: ");
            }finally {
                scanner.nextLine();
            }
        }while (stop);

        return false;
    }

    public void cashAdding(boolean a, double b){
        if (a){
            account.setBalance(account.getBalance() + b);
        }else{
            System.out.println("Funds have not been added");
        }
    }
    public boolean cashAddingAfterGame(boolean a, double b){
        if(a){
            account.setBalance(account.getBalance() + b);
            System.out.println("Congrats on the win: " + b);
            return true;
        }else{
            account.setBalance(account.getBalance() - b);
            System.out.println("I'm sorry you lost: ");
            return false;
        }

    }

}
