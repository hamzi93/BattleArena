import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleArena {

    Charakter[] spieler;

    public BattleArena(Charakter spieler1, Charakter spieler2){
        spieler = new Charakter[2];
        battle(spieler1, spieler2);
    }

    private void battle(Charakter spieler1, Charakter spieler2) {
        coinFlip(spieler1,spieler2);
        System.out.println("Der Münzwurf hat entschieden Spieler " + spieler[0] + " fängt an!");

        while(spieler[0].getLebenspunkte() > 0 || spieler[1].getLebenspunkte() > 0){
            
        }
    }

    private void coinFlip(Charakter spieler1, Charakter spieler2) {
        Random random = new Random();
        int zufallszahl = random.nextInt(0,2);
        if(zufallszahl == 0){
            spieler[0] = spieler1;
            spieler[1] = spieler2;
        }else {
            spieler[0] = spieler2;
            spieler[1] = spieler1;
        }
    }


}
