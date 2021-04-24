package main.java.jatekmenet.ember.tamadkiratas;

import main.java.jatekmenet.ember.MitTamadhatEmber;
import main.java.jatekmenet.ember.Tamade;

public class MitTamadEmberTamadas extends MitTamadhatEmber {
   public MitTamadEmberTamadas(int tamadase, int honanX, int honanY, int honanZ){
       int hovaX=0, hovaY=0, hovaZ = 0;
       switch (tamadase){
           case 1:
               hovaX = palyaTipus[honanX][honanY][honanZ].szomszedok[0].szomszedN;
               hovaY = palyaTipus[honanX][honanY][honanZ].szomszedok[0].szomszedM;
               hovaZ = palyaTipus[honanX][honanY][honanZ].szomszedok[0].szomszedX;
               break;
           case 2:
               hovaX = palyaTipus[honanX][honanY][honanZ].szomszedok[1].szomszedN;
               hovaY = palyaTipus[honanX][honanY][honanZ].szomszedok[1].szomszedM;
               hovaZ = palyaTipus[honanX][honanY][honanZ].szomszedok[1].szomszedX;
               break;
           case 3:
               hovaX = palyaTipus[honanX][honanY][honanZ].szomszedok[2].szomszedN;
               hovaY = palyaTipus[honanX][honanY][honanZ].szomszedok[2].szomszedM;
               hovaZ = palyaTipus[honanX][honanY][honanZ].szomszedok[2].szomszedX;
               break;
           case 4:
               hovaX = palyaTipus[honanX][honanY][honanZ].szomszedok[3].szomszedN;
               hovaY = palyaTipus[honanX][honanY][honanZ].szomszedok[3].szomszedM;
               hovaZ = palyaTipus[honanX][honanY][honanZ].szomszedok[3].szomszedX;
               break;
           case 5:
               hovaX = palyaTipus[honanX][honanY][honanZ].szomszedok[4].szomszedN;
               hovaY = palyaTipus[honanX][honanY][honanZ].szomszedok[4].szomszedM;
               hovaZ = palyaTipus[honanX][honanY][honanZ].szomszedok[4].szomszedX;
               break;
           case 6:
               hovaX = palyaTipus[honanX][honanY][honanZ].szomszedok[5].szomszedN;
               hovaY = palyaTipus[honanX][honanY][honanZ].szomszedok[5].szomszedM;
               hovaZ = palyaTipus[honanX][honanY][honanZ].szomszedok[5].szomszedX;
               break;
       }
       Tamade tamad = new Tamade();
       tamad.inditETamadast(tamadase, honanX, honanY, honanZ, hovaX, hovaY, hovaZ);
   }

}
