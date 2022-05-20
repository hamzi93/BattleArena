public class Main {

    public static void main(String[] args) {

        Charakter drache = new Drache("armin");
        Charakter drache1 = new Drache("Hans");

        drache.angreifen(drache1);
        drache.spezialFähigkeitAktivieren();
        System.out.println(drache1.getLebenspunkte());
        drache1.spezialFähigkeitAktivieren();
        System.out.println(drache1.getLebenspunkte());
        System.out.println(drache.getLebenspunkte());
        drache1.angreifen(drache);
        System.out.println(drache.getLebenspunkte());
        drache.spezialFähigkeitAktiv();
        System.out.println(drache.getLebenspunkte());



    }
}
