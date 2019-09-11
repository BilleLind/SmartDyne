public class Main {
    public static void main(String[] args) {

        Dyne projekt1 = new Dyne(); //skabelsen af projekt1 (hænger det sammen med variabler fra Dyne)
        Dyne projekt2 = new Dyne();
        Dyne projekt3 = new Dyne();
        Dyne projekt4 = new Dyne();

        System.out.println("Projekt 1");
        projekt1.temperaturAVG = 20;
        projekt1.locationTempt = 25;
        projekt1.indstilDyne();

        System.out.println("Projekt 2");
        projekt2.temperaturAVG = 50;
        projekt2.locationTempt = 15;
        projekt2.indstilDyne();

        System.out.println("Projekt 3");
        projekt3.temperaturAVG = 15;
        projekt3.locationTempt = 30;
        projekt3.indstilDyne();

        System.out.println("Projekt 4");
        projekt4.temperaturAVG =20;
        projekt4.locationTempt =100;
        projekt4.indstilDyne();






    }

}

