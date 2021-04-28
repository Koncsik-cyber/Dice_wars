package main.java.mentesbetoltes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ez az osztály végzi a fájba írást mentésnél!
 * @author Koncsik Benedek (G7KJC7)
 * A metéshez a soroket egy listában tárolodik és a lista elemek a külön sorok
 */
public class WriteFile {
    public WriteFile(String fajlNev) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fajlNev));


        for (int i = 0; i <MentesAdatKezeles.mentesAdat.size(); i++) {
            bw.write(MentesAdatKezeles.mentesAdat.get(i)+"\n");
        }
            bw.write("A mentés vége!\n------------------------------<==========================================>------------------------------");
        bw.close();

    }
}
