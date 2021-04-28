package main.java.mentesbetoltes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Mentés beolvasása!
 * @author Koncsik Benedek (G7KJC7)
 * soronként beolvassa a mentes.txt -böl az adatokat
 */
public class ReadFile {
    public List<String> Readfile(String fajlNev) throws IOException {
        ArrayList<String> beolvasott = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fajlNev));
        String sor = br.readLine();

        while (sor != null) {
            beolvasott.add(sor);
            sor = br.readLine();
        }

        br.close();
        return beolvasott;

    }
}
