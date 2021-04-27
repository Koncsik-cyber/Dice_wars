package main.java.jatekmenet.ember.tamadkiratas;

import main.java.jatekmenet.ember.Tamade;
import main.java.palya.palyaelem.PalyaElem;

public class MitTamadEmberTamadas {
   public MitTamadEmberTamadas(int tamadase, int honanX, int honanY, PalyaElem[][] palyaTipus){
       int hovaX=0, hovaY=0;
       switch (tamadase){
           case 1:
               hovaX = palyaTipus[honanX][honanY].szomszedok[0].szomszedN;
               hovaY = palyaTipus[honanX][honanY].szomszedok[0].szomszedM;
               break;
           case 2:
               hovaX = palyaTipus[honanX][honanY].szomszedok[1].szomszedN;
               hovaY = palyaTipus[honanX][honanY].szomszedok[1].szomszedM;
               break;
           case 3:
               hovaX = palyaTipus[honanX][honanY].szomszedok[2].szomszedN;
               hovaY = palyaTipus[honanX][honanY].szomszedok[2].szomszedM;
               break;
           case 4:
               hovaX = palyaTipus[honanX][honanY].szomszedok[3].szomszedN;
               hovaY = palyaTipus[honanX][honanY].szomszedok[3].szomszedM;
               break;
           case 5:
               hovaX = palyaTipus[honanX][honanY].szomszedok[4].szomszedN;
               hovaY = palyaTipus[honanX][honanY].szomszedok[4].szomszedM;
               break;
           case 6:
               hovaX = palyaTipus[honanX][honanY].szomszedok[5].szomszedN;
               hovaY = palyaTipus[honanX][honanY].szomszedok[5].szomszedM;
               break;
       }
       Tamade tamad = new Tamade();
       tamad.inditETamadast(tamadase, honanX, honanY,  hovaX, hovaY);
   }

}
