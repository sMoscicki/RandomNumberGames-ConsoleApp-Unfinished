package sm.randomnumber.menu;

import sm.randomnumber.account.AddingMethods;
import sm.randomnumber.randomnumgame.RandomNumberGameMenu;

import java.util.Scanner;

public class OptionSelection{

    void invokingOptions(int x){
        ComingSoon comingSoon = new ComingSoon();
        AddingMethods addingMethods = new AddingMethods();
        RandomNumberGameMenu randomNumberGameMenu = new RandomNumberGameMenu();

        switch (x){
            case 1 -> comingSoon.printComingSoon();
            case 2 ->{
                double balanceValue = addingMethods.setCashValue();
                boolean accept = addingMethods.cashAddingMethodBlik();
                addingMethods.cashAdding(accept, balanceValue);
            }
            case 3 ->{
                randomNumberGameMenu.gameMenuWriter();
                int choose = randomNumberGameMenu.gameMenuChoose();
                randomNumberGameMenu.runGameOptionMethod(choose);

            }
        }


    }

    int optionChoosing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the options: ");
       return scanner.nextInt();
    }


}
