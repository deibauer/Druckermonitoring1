package Verwaltung;

import Database.Druckerrepository;

import java.util.ArrayList;

public class DruckerVerwaltung {

    public ArrayList getPrinterList(){
        Druckerrepository repo1 = new Druckerrepository();
        return repo1.getPrinterList();
    }

}
