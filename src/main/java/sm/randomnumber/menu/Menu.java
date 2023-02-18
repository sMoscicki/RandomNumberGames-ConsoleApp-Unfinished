package sm.randomnumber.menu;



public class Menu {

    InformationAboutApp info = new InformationAboutApp();

    public void menuWriter(){

        //Information about App and Author in progress
        info.writeInformationAboutApp();

        //Main menu
        System.out.println("Menu: " + System.lineSeparator()
                + "1) Information about Account" + System.lineSeparator()
                + "2) Add Credits" + System.lineSeparator()
                + "3) Random Numbers Game" + System.lineSeparator()
                + "4) Another game IN PROGRESS" + System.lineSeparator()
                + "5) Another game IN PROGRESS" + System.lineSeparator()
                + "6) Check your game histories" + System.lineSeparator()
                + "7) Export game results to txt file" + System.lineSeparator()
                + "8) Help and useful information" + System.lineSeparator());

    }

}
