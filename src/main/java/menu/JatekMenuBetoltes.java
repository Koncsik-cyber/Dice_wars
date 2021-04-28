package main.java.menu;

import main.java.Main;
import main.java.mentesbetoltes.ReadFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ez az osztály végzi a mentett játék ujra játszását
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekMenuBetoltes {
    private ArrayList<String> kiras = new ArrayList<>();
    public JatekMenuBetoltes(){
        System.out.println("Enter billetyűvel lehet vissza játszani!");
        try {
            ReadFile rd = new ReadFile();
            kiras = (ArrayList<String>) rd.Readfile("mentes.txt");
        } catch (IOException e) {
            System.err.println("Nem sikerült beolvasni a fájlt!\n Létezik a mentes.txt? \n Jó helyen van?\nKérlek ellenőrizd :)");
            //e.printStackTrace(); //Nem íratom ki alapból
        }

        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
            try {
                System.out.print(kiras.get(i));
            }catch (IndexOutOfBoundsException e){
                System.err.println("A mentes.txt-nek van tartalma?\nVagy esetleg üres?\nKérlek ellenőrizd :)");
                //e.printStackTrace(); //Nem íratom ki alapból
            }

            i++;
            sc.nextLine();
        }while (i < kiras.size());
        System.out.println();
        Main.beallitas();
    }
}