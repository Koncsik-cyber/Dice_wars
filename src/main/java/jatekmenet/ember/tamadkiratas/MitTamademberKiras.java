package main.java.jatekmenet.ember.tamadkiratas;

import main.java.jatekmenet.ember.MitTamadhatEmber;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.palya.palyaelem.Szomszedok;

public class MitTamademberKiras extends MitTamadhatEmber {
    public MitTamademberKiras(int i, int honanX, int honanY, int honanZ) {
        Szomszedok szomszed = palyaTipus[honanX][honanY][honanZ].szomszedok[i];
        if (palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie != 1) {
            switch (i) {
                case 0:
                    System.out.println(new MentesAdatKezeles().MentesString((palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie == 0)
                            ? "A 1. irányban lévő területett szabadon elfoglalhatja. " : "A 1. irányban lévő mező: "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie + ". ellenfélé és "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].doboKockaSzam + " dobokockája van."));
                    break;
                case 1:
                    System.out.println(new MentesAdatKezeles().MentesString((palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie == 0)
                            ? "A 2. irányban lévő területett szabadon elfoglalhatja." : "A 2. irányban lévő mező: "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie + ". ellenfélé és "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].doboKockaSzam + " dobokockája van."));
                    break;
                case 2:
                    System.out.println(new MentesAdatKezeles().MentesString((palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie == 0)
                            ? "A 3. irányban lévő területett szabadon elfoglalhatja. " : "A 3. irányban lévő mező: "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie + ". ellenfélé és "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].doboKockaSzam + " dobokockája van."));
                    break;
                case 3:
                    System.out.println(new MentesAdatKezeles().MentesString((palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie == 0)
                            ? "A 4. irányban lévő területett szabadon elfoglalhatja. " : "A lent 4. irányban mező: "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie + ". ellenfélé és "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].doboKockaSzam + " dobokockája van."));
                    break;
                case 4:
                    System.out.println(new MentesAdatKezeles().MentesString((palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie == 0)
                            ? "A 5. irányban lévő területett szabadon elfoglalhatja. " : "A 5. irányban lévő mező: "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie + ". ellenfélé és "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].doboKockaSzam + " dobokockája van."));
                    break;
                case 5:

                    System.out.println(new MentesAdatKezeles().MentesString((palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie == 0)
                            ? "A 6. irányban lévő területett szabadon elfoglalhatja. " : "A 6. irányban lévő mező: "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].kie + ". ellenfélé és "
                            + palyaTipus[szomszed.szomszedN][szomszed.szomszedM][szomszed.szomszedX].doboKockaSzam + " dobokockája van."));
                    break;

            }

        }
    }
}