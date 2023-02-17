package sm.randomnumber;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RangeFinding {

    private int bounty = 5;

    public int getBounty() {
        return bounty;
    }

    void selectingBounty() {
        Scanner scanner = new Scanner(System.in);

        boolean stop = true;

        do {
            try {
                System.out.print("Specify the range of drawing numbers: ");
                int bounty = scanner.nextInt();
                if ((bounty < 5) || (bounty > 100)) throw new InvalidParameterException();


                this.bounty = bounty;
                stop = false;

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