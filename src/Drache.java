import java.util.Random;

public class Drache extends Charakter {

    public Drache(String name) {
        super(name);
    }

    public void angreifen(Charakter gegner) {
        Random random = new Random();
        int zufallsStärke = random.nextInt(20, 26);

        if (super.spezialFähigkeitAktiv()) {
            zufallsStärke -= random.nextInt(5, 11);
        }
        gegner.schadenNehmen(zufallsStärke);
    }

    public void spezialFähigkeitAktivieren() {
        if (!super.spezialFähigkeitAktiv()) {
            super.spezialFähigkeitAktivieren();
            spezialFähigkeitAktiv();
        }
    }

    public boolean spezialFähigkeitAktiv() {
        if (super.spezialFähigkeitAktiv()) {
            int lebenspunkte = getLebenspunkte() + 10;
            if (lebenspunkte > 100) {
                lebenspunkte = 100;
            }
            super.setLebenspunkte(lebenspunkte);
        }
        return super.spezialFähigkeitAktiv();
    }

}
