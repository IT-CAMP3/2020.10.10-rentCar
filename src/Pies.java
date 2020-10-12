public final class Pies {

    static {
        System.out.println("Siema !! tu statyczny blok kodu !!");
    }

    public String race;
    public static String name;

    public final void szczekaj() {
        System.out.println("Szczekam !!");
    }

    public static void cosTam() {
        System.out.println("Coś się dzieje !!");

        int a = 5;
        System.out.println(a + 4);

        //Main2.PI;

        Main2.PI = 5.0;
    }
}
