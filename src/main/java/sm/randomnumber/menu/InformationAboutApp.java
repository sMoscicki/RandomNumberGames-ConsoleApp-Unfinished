package sm.randomnumber.menu;

public class InformationAboutApp {

    private static final String AUTHOR = "Szymon Moscicki";

    private static final String APP_NAME = "Random Number Games";

    private String appVersion = "0.1V";


    void writeInformationAboutApp(){

        System.out.println("Author --> " + AUTHOR + System.lineSeparator()
                + "App Name --> " + APP_NAME + System.lineSeparator()
                +"Version --> " + appVersion);

    }

}
