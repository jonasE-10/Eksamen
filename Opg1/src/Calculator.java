public class Calculator {
    String month;
    int numOfTrips;

    public Calculator(String month, int numOfTrips){
        this.month = month;
        this.numOfTrips = numOfTrips;
    }

    public int calculate(){
        int sum = 0;
        switch(month){
            case "November":
            case "December":
            case "Januar":
            case "Februar":
            case "Marts":
                sum = 15*numOfTrips;
                break;
            case "April":
            case "Maj":
            case "Juni":
            case "Juli":
            case "August":
            case "September":
            case "Oktober":
                sum = 10*numOfTrips;
                break;
        }
        if (numOfTrips >= 20){
            System.out.println("--- der blev lagt 50kr oveni ---");
            sum += 50;
        }
        return sum;
    }
    public int calculateCO2(int numOfTrips){
        int totalSaved = (int) (numOfTrips*2.6);
        return totalSaved;
    }
}
