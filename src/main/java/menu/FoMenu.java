package main.java.menu;

import main.java.gepiellenfel.AiBealitas;
import main.java.menu.beallitas.FoMenuBeallitas;
import java.util.Scanner;
/**
 *Játék fő menüje!
 * @author Koncsik Benedek (G7KJC7)
 */
public class FoMenu {
    /**
     * @see FoMenuBeallitas - ebben az osztályban állitodnak be az itt bevitt adatok <\ td>
     *     setterken keresztül
     */
    FoMenuBeallitas menu = new FoMenuBeallitas();
    Scanner scanf = new Scanner(System.in);
    public boolean autoBeallit = false;
    public static boolean  beVanAllitva = false;
    public FoMenu(String[] args){
        menu.setArgumantum(args);
    }
    public FoMenu(){}
    /**
     * Itt lehet kivalaszatani a különböző beállitásokat!
     */
    public void gepiEllenfelBealitas(){
        System.out.println("Kérem írjon be mennyi gépi ellenfele legyen (Minimum 1): ");
        int gepiEllenfel = scanf.nextInt();
        menu.setGepiEllenfel(gepiEllenfel);
        System.out.println("Gépi ellenfél testreszabása--> 1");
        System.out.println("(Ha nem állitja be akkor a gép beállit egy nehézésget.)");
        System.out.println("Vissza a beállitásokba--> 2");
        int valaszt = scanf.nextInt();
        if (valaszt == 1){
            gepiEllenfel(false);
            beVanAllitva = true;
        }
        else {
            autoBeallit = true;
            gepiEllenfel(true);
            beVanAllitva = true;
        }
    }
    /**
     * a pálya M értékét állitja
     */
    public void palyaMeret1(){
        System.out.println("Kérem adja meg a pálya méretét (méret * gepi ellenfél):");
        int palyaMeretM = scanf.nextInt();
        menu.setPalyaMeretM(palyaMeretM);
    }
    /**
     * a pálya N értékét állitja
     */
    public void palyaMeret2(){
        System.out.println("Kérem adja meg a pálya méretét (méret * gepi ellenfél):");
        int palyaMeretN = scanf.nextInt();
        menu.setPalyaMeretN(palyaMeretN);
    }

    /**
     * main.java.palya tipusát állitja a main.java.menu osztályban a setter átalakitja az n értékét igaz(true) ra a h értékét meg hamisra(false)
     */
    public void palyatipus(){
        System.out.println("Kérem adja meg a pálya típusát (n (negyzet)/ h (hatszog)): ");
        char palyaTipusString = scanf.next().charAt(0);
        menu.setPalyatipus(palyaTipusString);
    }

    /**
     * Játék kezdése ha nem mentek végig a beálitáson akkor default értékekkel indul a játék.
     * A main.java.menu osztály indit metodusát hivja meg
     */
    public void valaszt(){
        System.out.println("Új játék inditása -> 1");
        System.out.println("Játék betöltése -> 2");
        int valaszt = scanf.nextInt();
        menu.setValaszt(valaszt);
        menu.indit();
    }
    /**
     * @param autoBeallit ha igaz akkor a main.java.ai csomagban az AiBealitas osztály autoBeaálitása metodust hivja meg ha hamis akkor az elöbb emlitett clason belül az egyesevelBealit metodust hivja meg.
     * @see AiBealitas
     */
    public void gepiEllenfel(boolean autoBeallit){
        AiBealitas ai = new AiBealitas(autoBeallit);

    }
}
