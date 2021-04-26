package main.java.gepiellenfel.aibealitasa;

import main.java.gepiellenfel.AiBealitas;
import main.java.menu.beallitas.FoMenuBeallitas;

import java.util.Scanner;

public class EgyesevelBeallitas {
    protected int agreszvitas = 1;
    protected String[] menyireAgresziv = {"Etanol ", "Pájinka", "Fokos Hajós", "Campari keserű likőr", "Bakter Cherry", "Garrone Cherry", "Tojáslikőr", "Pezsgő", "Aperol", "Szóda"};
    /**
     * Egyesével beállit ez a metodus megy végig a gépi ellenfeleken és be lehet állitani egy 1/10-es skálán, hogy menyire legenek agreszívak 1 nem agresziv (soha nem támad) 10 nagyon agresziv (mindig támad)
     * A gépi ellenfeleknehézségének vannak különbőző nevei, a könyebb megjegyezhetőség kedvéért mégpedig az alapján, hogy kb hány százalék esélyel támadnak (minden név egy alkoholos ital neve és az alkohol százalék mutatja menyire támadékony :) )
     * Meg forditom a számokat mert az oszthatóság alapján támad (1 és 100 között ha osztahtó a szám akkor támad) ezért mindik kivonom 11-ből igy kapom meg a gép által használt agreszivitást
     * (Azért nem alaból igy kérem a felhaszbálótól mert könyebben ál rá az ember agya forditva.)
     * @see main.java.gepiellenfel.Ai -nevü class-ban tárolom a gépi elenfelek agreszivitását és a agreszivitás nevét
     */
    public EgyesevelBeallitas(){
        AiBealitas bealit = new AiBealitas();
        Scanner scanf = new Scanner(System.in);
        System.out.println("Gépi ellenfél beálitása: ");
        for (int i = 0; i < FoMenuBeallitas.getGepiEllenfel(); i++ ) {
            System.out.println("A(z) " + (i+1) + ". ellenfél nehézségi szintj (1-10 skálán (1 a könnyű-10 a nehéz)): ");
            int agreszv = scanf.nextInt();
            bealit.setAgreszvitas(agreszv);
            bealit.gepiEllenfel[i]= new main.java.gepiellenfel.Ai(agreszvitas, menyireAgresziv[agreszvitas-1],i);
            System.out.println("A beálított érték : " + (11-agreszvitas) + "--> " +menyireAgresziv[agreszvitas-1]);
        }
        System.out.println();
    }
}
