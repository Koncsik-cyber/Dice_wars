package main.java.mentesbetoltes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
