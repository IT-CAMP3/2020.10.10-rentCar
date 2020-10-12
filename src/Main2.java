public class Main2 {

    static double PI = 3.14;

    public static void main(String[] args) {
        /*Pies p1 = new Pies();
        Pies p2 = new Pies();
        Pies p3 = new Pies();

        Pies.name = "Reksio";

        p1.szczekaj();

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);

        new A();*/

        final int a = 5;
        final Pies pies = new Pies();

        System.out.println(a);
        System.out.println(pies.race);

        pies.race = "Reksio";

        System.out.println(pies.race);
    }
}
