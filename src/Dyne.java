public class Dyne {

    //objekts egenskaber
    double temperatur; //celsius
    byte temperaturÆndring; //hvor meget temperatur +/- ændring
    double locationTempt; // specifikt temp. et sted
    double temperaturAVG; //temperatur over hele dynen, gennemsnitlig

    private double minimunTempt = 18; //a+=18
    private double maximunTempt = 30; //a2-=30
    private boolean mereVarme; // om der skal mere varme til
    private boolean mindreVarme; // om der skal mindre varme til
    private boolean optimalTempt;

    // metoder
    void indstilDyne() {
        if (locationTempt < minimunTempt) { // funktion
            mereVarme = true;
        } else if (locationTempt > maximunTempt) {
            mindreVarme = true;
        }

        if (mindreVarme) {
            System.out.println("mindre Varme under dynen");
        } else if (mereVarme) {
            System.out.println("mere Varme under dynen");
        }

        if (!mereVarme && !mindreVarme) {
            System.out.println("Optimal Temperatur");
        }

        if (temperaturAVG > 45) {
            System.out.println("Omryst dyne for optimal tempt");
        }

        if (locationTempt > 80) {
            System.out.println("!!Alarm Brændfare!!");
        }
/*
        if () { //mellemrum for pænere udskrift
            System.out.print("  ");
        }
*/

}

}

