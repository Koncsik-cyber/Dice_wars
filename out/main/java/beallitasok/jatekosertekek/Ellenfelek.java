package main.java.beallitasok.jatekosertekek;

import main.java.menu.beallitas.FoMenuBeallitas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ellenfelek {
    public static List<Integer> ellenfelekTomb;

    public Ellenfelek(){
        ellenfelekTomb = new LinkedList<>();
        for (int i = 1; i < FoMenuBeallitas.getGepiEllenfel() + 2; i++){
             ellenfelekTomb.add(AIEmberTeruletek.teruletekSzama[i]);
        }
    }
}
