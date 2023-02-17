package sm.randomnumber;

import java.util.Random;

public class RandomNumber {

    int numberDraw(int b){

        Random randomNumber = new Random();
        int number = randomNumber.nextInt(b);

        return number;
    }

}
