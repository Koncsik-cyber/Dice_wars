package main.java.menu.beallitas;
import main.java.Main;
/**
     *Ebben az osztályban tárolodik az alap értékek és innen indul a tényleges játék
     * @author Koncsik Benedek (G7KJC7)
     */
    public class FoMenuBeallitas {
       //Default értékek
        protected static int gepiEllenfel = 1;
    protected static int palyaMeretM = 5;
    protected static int palyaMeretN = 5;
    protected static boolean palyaTipus = true; // Ha igaz akkor négyszőgrács ha hamis akkor hatszögrács
    protected char palyaTipusString = ' ';
    protected int valaszt;
        public static String[] argumantum = Main.argumentum();
        public FoMenuBeallitas(){
            setGepiEllenfel(gepiEllenfel);
            setPalyaMeretN(palyaMeretN);
            setPalyaMeretM(palyaMeretM);
            setPalyatipus(palyaTipusString);
            setValaszt(valaszt);
        }
        /**
         * indit metodus
         * A játék elinditását végzi
         * Meghivja a static TeruletElosztás osztály eloszthatoterulet metodusát ami kiszámitja menyi területett lehet elosztani a játékosok között.
         */
        public void indit(){
           new Indit(valaszt, palyaMeretN, palyaMeretM, palyaTipus);
        }
        public void setGepiEllenfel(int gepiEllenfel) {
            if (gepiEllenfel > 0) this.gepiEllenfel = gepiEllenfel;
            else System.err.println("Nem lehet 1 nél kevesebb gépi ellenfeled!");
        }
        public void setPalyaMeretN(int palyaMeretN) {
            if (palyaMeretN >= 5) this.palyaMeretN = palyaMeretN*gepiEllenfel;
            else System.err.println("Nem lehet 5 nél kisebb a pálya méret!");
        }
        public void setPalyaMeretM(int palyaMeretM) {
            if (palyaMeretM >= 5) this.palyaMeretM = palyaMeretM*gepiEllenfel;
            else System.err.println("Nem lehet 5 nél kisebb a pálya méret!");
        }
        public void setValaszt(int valaszt) {
            if (valaszt == 1 | valaszt == 2 | valaszt == 0 | valaszt == 3){
                this.valaszt = valaszt;
            }else {
                System.err.println("1-es vagy 2-es vagy 3-mas számot írjon be!");
                System.out.println("Kérem adja meg a pálya típusát (n (negyzet)/ h (hatszog)): ");
            }
        }
        public void setPalyatipus(char palyaTipus) {
            if(palyaTipus == 'n') this.palyaTipus = true;
            else if (palyaTipus == 'h') this.palyaTipus = false;
            else if (palyaTipus == ' ');
            else System.err.println("Kérem n/h írjon be!");
        }
        public void setArgumantum(String[] argumantum){
            this.argumantum = argumantum;
        }
        public static int getGepiEllenfel() {
            return gepiEllenfel;
        }
        public static int getPalyaMeretM() {
            return palyaMeretM;
        }
        public static int getPalyaMeretN() {
            return palyaMeretN;
        }
        public static boolean isPalyaTipus() {
            return palyaTipus;
        }
    }
