package ConsoleClient;

public class AdminConsoleClient extends  ConsoleClient{

    @Override
    void run() {
       showMenu();

    }

    @Override
    void showMenu() {

        System.out.println("Printer Monitoring -Admin Menu");
        System.out.println("0) Beenden");
        System.out.println("1) Druckerliste ausgeben");
        System.out.println("2) Admin Menu verlassen");



    }
}
