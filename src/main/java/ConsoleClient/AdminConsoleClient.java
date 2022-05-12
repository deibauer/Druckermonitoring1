package ConsoleClient;

public class AdminConsoleClient extends  ConsoleClient{

    @Override
    void run() {
        this.showMenu();
        processCommand();
    }

    @Override
    void showMenu() {
        System.out.println("Printer Monitoring - Menu");
        System.out.println("0) Beenden");
        System.out.println("1) Druckerliste ausgeben");
        System.out.println("2) Admin Menu verlassen");
    }

    @Override
    void processCommand() {
        System.out.println("Bitte geben Sie eine Nummer ein!");
        int input=scanner.nextInt();

        switch (input)
        {
            case  0:
                break;
            case  1:
                printPrinterList();
                break;
            case  2:
                break;
            case  3:;
                break;

        }
    }
}
