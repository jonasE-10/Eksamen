import util.TextUI;

public class Register {
    String month;
    int numOfTrips;
    int totalTrips;
    int sum;
    int totalSum;
    int totalCO2Saved;
    TextUI ui = new TextUI();


    public void RegisterTrips(){
        this.month = ui.inputMonth("Indtast Måned: ");
        this.numOfTrips = ui.inputNum("Antal cykelture: ");
        Calculator calc = new Calculator(month,numOfTrips);
        sum = calc.calculate();
        totalTrips += numOfTrips;
        totalSum += sum;
        ui.dspMessage("Klimarabat for "+month+": "+sum+"kr");
        boolean x = ui.inputYN("Fortsæt registrering?");
        if (x) {
            RegisterTrips();
        }
        totalCO2Saved = calc.calculateCO2(totalTrips);
        EndSession();
    }
    public void EndSession(){
        ui.dspMessage("Flot arbejde! Du har sparet "+totalCO2Saved+"kg CO2 " +
                "(svarende til "+(totalCO2Saved/20)+" træers årlige absorption)");
        ui.dspMessage("Din klimarabat: "+totalSum+"kr overføres til din Nemkonto");

    }
}
