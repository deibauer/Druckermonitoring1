package ConsoleClient;

import Verwaltung.Drucker;
import Verwaltung.DruckerVerwaltung;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleClient {

    DruckerVerwaltung verwaltung = new DruckerVerwaltung();
    Scanner scanner=new Scanner(System.in);

    void showMenu() {
        System.out.println("Printer Monitoring - Menu");
        System.out.println("0) Beenden");
        System.out.println("1) Druckerliste ausgeben");
        System.out.println("2) Admin Menü öffnen");
    }

    void printPrinterList(){
        ArrayList<Drucker>Druckers =verwaltung.getPrinterList();

        System.out.println("#Druckername\tRaumNr\tIpAddresse");
        for (Drucker d:Druckers) {
            System.out.println("#"+d.getDruckername()+"\t\t"+d.getRaumNr()+"\t\t"+d.getIpAddresse()+"#");
        }
    }

    void processCommand()
    {
        System.out.println("Bitte geben Sie eine Nummer ein!");
        int input = scanner.nextInt();

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





    void run()
    {
        showMenu();
        processCommand();

    }


}
