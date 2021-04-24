package main.java.beallitasok.jatekosertekek;
import main.java.debugger.Debugger;
import main.java.gepiellenfel.AiTerulete;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;
public class AIEmberTeruletek {
    public static AiTerulete[][] teruletei;
    public static int[] teruletekSzama;
    public void  aiteruletei(PalyaElem[][][] palya) {
        new Aiteruletei().aiteruletei(palya);

        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("kinenHanyadikTerulet")) {
                   new Debugger();
                }
            }
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("kinenHanyadikTeruletKicsi")) {
                    new Debugger();
                    System.out.println();
                }
            }
        }
    }
}