package main.java.jatekmenet;

import main.java.debugger.Debugger;
import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.jatekmenet.tamadas.TamadasGyoz;
import main.java.jatekmenet.tamadas.TamadasVeszit;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.Palya;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.palya.palyaelem.PalyaElem;

/**
 * Támadás!
 * @author Koncsik Benedek (G7KJC7)
 */
public class Tamadas {
    public Tamadas(){}
    protected  PalyaElem[][][] palyaTipus;

    /**
     * Támadás elvégzése dobokocka dobás nyertes kihirdetése.
     * @param honanX Ahonan indul a támadáas X kordinátája
     * @param honnanY Ahonan indul a támadáas Y kordinátája
     * @param honnanZ Ahonan indul a támadáas Z kordinátája ha négyszögrács a pálya akkor a Z kordináta 0-a ha hatszögrács akkor 2
     * @param hovaX Ahova indul a támadáas X kordinátája
     * @param hovaY Ahova indul a támadáas Y kordinátája
     * @param hovaZ Ahova indul a támadáas Z kordinátája ha négyszögrács a pálya akkor a Z kordináta 0-a ha hatszögrács akkor 2
     * @param negyszogracse boolean ha igaz akkor négyszögrács a pálya ha hamis akkor hatszögracs
     */
    public void tamdasIndul(int honanX, int honnanY, int honnanZ, int hovaX, int hovaY, int hovaZ, boolean negyszogracse){
        if (negyszogracse) palyaTipus = Negyszogracs.palya;
        else palyaTipus = Hatszogracs.palya;
        if (palyaTipus[hovaX][hovaY][hovaZ].kie == 0 && palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam > 1){
            new TamadasGyoz(honanX, honnanY, honnanZ,  hovaX, hovaY, hovaZ, palyaTipus);
        }else if (palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam > 1 && !(palyaTipus[hovaX][hovaY][hovaZ].kie == palyaTipus[honanX][honnanY][hovaZ].kie)){
            RandomSzamGenerator tamado = new RandomSzamGenerator(1,6);
            RandomSzamGenerator vedekezo = new RandomSzamGenerator(1,6);
            int tamadoDobas = tamado.randomSzamGenerator();
            int vedekezoDobas = vedekezo.randomSzamGenerator();
            System.out.println(new MentesAdatKezeles().MentesString("A támadó dobása: " + (tamadoDobas*palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam)));
            System.out.println(new MentesAdatKezeles().MentesString("A védekező dobása: " + (vedekezoDobas*palyaTipus[hovaX][hovaY][hovaZ].doboKockaSzam)));
            if ((tamadoDobas*palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam) > (vedekezoDobas*palyaTipus[hovaX][hovaY][hovaZ].doboKockaSzam)) new TamadasGyoz(honanX, honnanY, honnanZ, hovaX, hovaY, hovaZ, palyaTipus);
            else if ((tamadoDobas*palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam) < (vedekezoDobas*palyaTipus[hovaX][hovaY][hovaZ].doboKockaSzam)) new TamadasVeszit(honanX, honnanY, honnanZ, palyaTipus);
            else if ((tamadoDobas*palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam) == (vedekezoDobas*palyaTipus[hovaX][hovaY][hovaZ].doboKockaSzam)) new TamadasVeszit(honanX, honnanY, honnanZ, palyaTipus);
        }
        new AIEmberTeruletek();
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("palyaMegjelenites")) {
                    Debugger palyaDebug = new Debugger();
                    palyaDebug.negyzetracs(palyaTipus);
                }
            }
        }
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("kinenHanyadikTerulet")) {
                    Debugger ai1 = new Debugger();
                    System.out.println();
                }
            }
        }
        new JatekbanVanEllenorzes();
    }
}
