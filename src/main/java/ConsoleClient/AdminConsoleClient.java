package ConsoleClient;

import Database.Druckerrepository;
import Verwaltung.AdminDruckerVerwaltung;
import Verwaltung.Drucker;

public class AdminConsoleClient extends  ConsoleClient{
    AdminDruckerVerwaltung ad=new AdminDruckerVerwaltung();
    int x=0;
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
        System.out.println("2) Drucker hinzufügen");
        System.out.println("3) Admin Menu verlassen");
    }

    void addDrucker(){
        System.out.println("Bitte geben sie den Raumnamen des Druckers an");
        int raumNr = scanner.nextInt();
        System.out.println("Bitte geben sie den IP-Addresse des Druckers an");
        String ipAddresse = scanner.next();
        System.out.println("Bitte geben sie den Namen des Druckers an");
        String druckername = scanner.next();
        Drucker drucker = new Drucker(raumNr,druckername,ipAddresse);
        ad.addDrucker(drucker);

    }

    @Override
    void processCommand() {

        System.out.println("Bitte geben Sie eine Nummer ein!");
        int input=scanner.nextInt();



        switch (input) {
            case 0:x=1;
                break;
            case 1:
                printPrinterList();
                break;
            case 2:
                addDrucker();
                break;
            case 3:


                break;

        }

        //while Schleife um Programm nach einem Kommando weiterlaufen zu lassen
        while (x==0)

        {  run();}



    }
}
