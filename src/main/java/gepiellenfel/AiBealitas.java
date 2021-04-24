package main.java.gepiellenfel;
import main.java.gepiellenfel.aibealitasa.AutoBeallitas;
import main.java.gepiellenfel.aibealitasa.EgyesevelBeallitas;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;

/**
 *Gépi ellenfél beálitása!
 * @author Koncsik Benedek (G7KJC7)
 */
public class AiBealitas {
    protected int agreszvitas = 1;
    protected String[] menyireAgresziv = {"Etanol ", "Pájinka", "Fokos Hajós", "Campari keserű likőr", "Bakter Cherry", "Garrone Cherry", "Tojáslikőr", "Pezsgő", "Aperol", "Szóda"};

     public static main.java.gepiellenfel.Ai[] gepiEllenfel;
    public AiBealitas() {}
    /**
     * Létre hoz egy Ai tipuso static tömböt melynek a mérete a gépi ellenfelek száma
     * @param automatikus ha igaz(true) akkor az autoBealit metodust meghivja ha hamis(false) akkor a egyesevelBealit metodu fut le.
     */
    public AiBealitas(boolean automatikus){
        gepiEllenfel = new main.java.gepiellenfel.Ai[FoMenuBeallitas.getGepiEllenfel()];
        if (automatikus) new AutoBeallitas();
        else new EgyesevelBeallitas();
    }

    public void setAgreszvitas(int agreszvitas) {
        if (agreszvitas > 0 && agreszvitas < 11) {
            this.agreszvitas = 11-agreszvitas;
        }
        else System.err.println("Kérem 1 és 10 közötti számot adjon meg!");
    }
    public int getAgreszvitas() {
        return agreszvitas;
    }
    public main.java.gepiellenfel.Ai[] getGepiEllenfel() {
        return gepiEllenfel;
    }
}