import java.util.Random;

public class Zwerg extends Charakter {

    public Zwerg(String name) {
        super(name);
    }

    public void angreifen(Charakter gegner) {
        Random random = new Random();
        int zufallsStärke = random.nextInt(15, 26);

        if (super.spezialFähigkeitAktiv()) {
            zufallsStärke *= 2;
        }

        gegner.schadenNehmen(zufallsStärke);
    }

    public void spezialFähigkeitAktivieren() {
        Random rand = new Random();
        int wahrscheinlichkeit = rand.nextInt(1, 101);
        boolean geglueckt;
        if (!super.spezialFähigkeitAktiv() && super.getLebenspunkte() < 50) {
            // Lebenspunkte <= 50 und Wahrscheinlichkeit 30%
            if (super.getLebenspunkte() <= 50 && wahrscheinlichkeit > 0 && wahrscheinlichkeit <= 30) {
                super.spezialFähigkeitAktivieren();
                geglueckt = true;
                // Lebenspunkte <= 20 und Wahrscheinlichkeit 50%
            } else if (super.getLebenspunkte() <= 20 && wahrscheinlichkeit > 0 && wahrscheinlichkeit <= 50) {
                super.spezialFähigkeitAktivieren();
                geglueckt = true;
            } else if (super.getLebenspunkte() <= 10 && wahrscheinlichkeit > 0 && wahrscheinlichkeit <= 70) {
                // Lebenspunkte <= 20 und Wahrscheinlichkeit 70%
                super.spezialFähigkeitAktivieren();
                geglueckt = true;
            }
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
