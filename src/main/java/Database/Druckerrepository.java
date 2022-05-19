package Database;

import Verwaltung.Drucker;
import Verwaltung.DruckerVerwaltung;

import java.util.*;

public class Druckerrepository {

    public Druckerrepository(){
        int i = 1;
    }

    static final ArrayList<Drucker> druckerListe = new ArrayList<>();

    //statischer Bereich wird immer vor Konstruktor ausgeführt um für jede Instanz zu gelten
    {
        druckerListe.add(new Drucker(33,"testdrucker","10.10.10.10"));
    }
    void addDrucker(Drucker drucker){
        druckerListe.add(drucker);
    }

    public ArrayList getPrinterList(){
        return druckerListe;
    }
}
