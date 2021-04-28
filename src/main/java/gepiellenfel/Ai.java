package main.java.gepiellenfel;
/**
 *A gépi ellenfél modora/személyisége!
 * @author Koncsik Benedek (G7KJC7)
 */
public class Ai {
    public int nehezseg;
    public String nehezssegNeve;
    public int hanyadik;
    /**
     * Ez az osztály tárolja a gépi ellenfél adatait
     * param nehezseg gépi ellenfél nehézségi szintje
     * param neve nehézségi szint neve
     */
    public Ai(){}
    public Ai(int nehezseg, String neve, int hanyadik) {
        this.nehezseg = nehezseg;
        nehezssegNeve = neve;
        this.hanyadik = hanyadik;

    }
}