package sm.randomnumber.randomnumgame;

import sm.randomnumber.menu.AppFunction;
import sm.randomnumber.menu.Menu;

import javax.net.ssl.SSLContext;
import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomNumberGameMenu {


    public void gameMenuWriter(){
        System.out.println("Typing '-exit' in the console will take you back to the menu" + System.lineSeparator()
                + "1) Play Game" + System.lineSeparator()
                + "2) Game Instructions" + System.lineSeparator());

    }
    public int gameMenuChoose(){
        boolean stop = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select options: ");
        do {
                String chooseScanner = scanner.next().toLowerCase();
                if (chooseScanner.isEmpty()) throw new InvalidParameterException();

                if (chooseScanner.equals(AppFunction.EXIT)) {
                    Menu menu = new Menu();
                    menu.menuWriter();
                    stop = false;
                }else{
                    try {
                        int choose = Integer.parseInt(chooseScanner);
                            if((choose > 2) || (choose < 0 )) throw new InvalidParameterException();

                        stop = false;
                        return choose;
                    }catch (InputMismatchException e){
                        System.out.println("Provide a legitimate option: ");
                    }catch (InvalidParameterException e){
                        System.out.println("Provide a legitimate option: ");
                    }finally {
                        scanner.nextLine();
                    }
                }
        }while(stop);
        scanner.close();
        return 0;
    }

    public void runGameOptionMethod(int choose){

        switch (choose){
            case 1 ->
        }



    }

}
