package ConsoleClient;

import java.util.Scanner;

public class ConsoleClient {


    Scanner scanner=new Scanner(System.in);

    void showMenu() {
        System.out.println("Printer Monitoring - Menu");
        System.out.println("0) Beenden");
        System.out.println("1) Druckerliste ausgeben");
        System.out.println("2) Admin Menü öffnen");
    }

    void processCommand()
    {
        System.out.println("Bitte geben Sie eine Nummer ein!");
        int input=scanner.nextInt();

        switch (input)
        {
            case  1:
                printPrinterList();
            break;
            case  2:

            break;
            case  3:;
            break;

        }




    }





    void run(String in)
    {
        showMenu();
        processCommand();

    }
}