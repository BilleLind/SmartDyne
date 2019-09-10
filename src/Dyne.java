public class Dyne {

    //objekts egenskaber
    double temperatur; //celsius
    byte temperaturÆndring; //hvor meget temperatur +/- ændring
    double locationTempt; // specifikt temp. et sted
    double temperaturAVG; //temperatur over hele dynen, gennemsnitlig

    double minimunTempt = 18; //a+=18
    double maximunTempt = 30; //a2-=30
    boolean mereVarme; // om der skal mere varme til
    boolean mindreVarme; // om der skal mindre varme til

    // metoder
    void indstilDyne() {
        if (locationTempt < minimunTempt) {
            mereVarme = true;
        }
        if (locationTempt > maximunTempt) {
            mindreVarme = true;

        }
        if (mindreVarme == true) {
            System.out.println("mindre Varme under dynen");
        }

        if (mereVarme == true) {
            System.out.println("mere Varme under dynen");
        }
    }

}

