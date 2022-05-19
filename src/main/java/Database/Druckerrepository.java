package Database;

import Verwaltung.Drucker;
import Verwaltung.DruckerVerwaltung;

import java.util.*;

public class Druckerrepository {

    public Druckerrepository(){
        int i = 1;
    }

    static final ArrayList<Drucker> druckerListe = new ArrayList<>();


   public static void addDrucker(Drucker drucker){
        druckerListe.add(drucker);
    }

    public  ArrayList getPrinterList(){
        return druckerListe;
    }
}
