package sm.randomnumber;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

    private double balance = 0.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    boolean cashAddingMethod(int m){

        Scanner scanner = new Scanner(System.in);

        boolean stop = true;

        if(m == 1){
            System.out.println("Enter Blick Code");
            do {
                try {
                    int code = scanner.nextInt();
                        if ((code < 99999) || (code > 999999)) throw new InvalidParameterException();

                        if(code == )

                stop = false;
                }catch (InputMismatchException e){
                    System.out.println("Specify the range of drawing numbers: ");

                }catch (InvalidParameterException e){
                    System.out.println("Give the correct value: ");

                }finally {
                    scanner.nextLine();
                }


            }while(stop);

        }




        return true;
    }

    void cashAdding(){





    }

}
