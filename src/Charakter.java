
public class Charakter {

    private String name; //Name des Charakters
    private int lebenspunkte; //Lebenspunkte (Start: 100, Tot: 0)
    private boolean spezialFähigkeit;

    public Charakter(String name){
        this.name = name;
        this.lebenspunkte = 100;
        this.spezialFähigkeit = false;
    }

    public void schadenNehmen(int punkte){
        this.lebenspunkte -= punkte;
    }

    public void angreifen(Charakter gegner){}

    public String getName(){
        return this.name;
    }

    public int getLebenspunkte(){
        return this.lebenspunkte;
    }

    public boolean spezialFähigkeitAktiv() {
        return spezialFähigkeit;
    }

    public void setLebenspunkte(int lebenspunkte){
        this.lebenspunkte = lebenspunkte;
    }

    public void spezialFähigkeitAktivieren(){
        this.spezialFähigkeit = true;
    }

}
