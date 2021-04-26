package main.java.gepiellenfel.aibealitasa;

import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.gepiellenfel.AiBealitas;
import main.java.menu.beallitas.FoMenuBeallitas;

public class AutoBeallitas {
    protected int agreszvitas = 1;
    protected String[] menyireAgresziv = {"Etanol ", "Pájinka", "Fokos Hajós", "Campari keserű likőr", "Bakter Cherry", "Garrone Cherry", "Tojáslikőr", "Pezsgő", "Aperol", "Szóda"};
    /**
     * autoBeállit metodus automatikasan végig megy a gépi ellenfelek tömbön és main.java.random számot állit be nehézségre(1-10-es skálán)
     */
    public AutoBeallitas(){
        AiBealitas bealit = new AiBealitas();
        for (int i = 0; i < FoMenuBeallitas.getGepiEllenfel(); i++ ) {
            RandomSzamGenerator rn = new RandomSzamGenerator(1,10);
            int agreszv = rn.randomSzamGenerator();
            bealit.setAgreszvitas(agreszv);
            bealit.gepiEllenfel[i]= new main.java.gepiellenfel.Ai(agreszvitas, menyireAgresziv[agreszvitas-1], i);
        }
    }
}
