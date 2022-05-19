package Verwaltung;

import Database.Druckerrepository;

import java.util.ArrayList;

public class DruckerVerwaltung {
    Druckerrepository repo1 = new Druckerrepository();
    public ArrayList getPrinterList(){

        return repo1.getPrinterList();
    }

}
