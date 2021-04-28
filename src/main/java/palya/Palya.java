package main.java.palya;

import main.java.debugger.Debugger;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;


/**
 * Itt hivja megmelyik tipusú pálya generálodjon!
 * @author Koncsik Benedek (G7KJC7)
 */
public class Palya {
    public Palya(int palyaMeretN, int palyaMeretM, boolean palyaTipus){

       if (palyaTipus){
          new Negyszogracs(palyaMeretN, palyaMeretM);
       }else{
            new Hatszogracs(palyaMeretN, palyaMeretM);
       }
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("eloszottTerulet")){
                   new Debugger();
                }
            }
        }
    }

}
