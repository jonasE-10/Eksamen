import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SaunaVillage {
    ArrayList<Sauna> saunas;

    public void loadFromCSV(String filename){
        try {
            saunas = new ArrayList<>();
            File file = new File(filename);
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while (scan.hasNextLine()){
                boolean tempAdded = false;
                String line = scan.nextLine();
                String[] array = line.split(",");
                // 0 = hour, 1 = temp, 2 = name, 3 = type
                if (!saunas.isEmpty()) {
                    for (Sauna sauna : saunas) {
                        if (sauna.getName().equals(array[2])) {
                            sauna.addTemperature(Integer.parseInt(array[1]));
                            tempAdded = true;
                        }
                    }
                }
                if (!tempAdded && array[3].equals("wood")) {
                        WoodSauna woodSauna = new WoodSauna(array[2]);
                        woodSauna.temperatures.add(Integer.parseInt(array[1]));
                        saunas.add(woodSauna);
                        tempAdded = true;
                }
                if (!tempAdded && array[3].equals("electric")) {
                        ElectricSauna electricSauna = new ElectricSauna(array[2]);
                        electricSauna.temperatures.add(Integer.parseInt(array[1]));
                        saunas.add(electricSauna);
                        tempAdded = true;
                }
                if (tempAdded) {
                    tempAdded = false;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void printReport(){
        System.out.println("--- All saunas ---");
        for (Sauna sauna : saunas){
            System.out.println(sauna.getName());
            System.out.println(sauna.calculateDailyCost());
            System.out.println();
        }
        System.out.println("--- Most expensive ---");
        System.out.println(getMostExpensive().getName());
        System.out.println(getMostExpensive().calculateDailyCost());
        System.out.println();
        System.out.println("--- Cheapest ---");
        System.out.println(getCheapest().getName());
        System.out.println(getCheapest().calculateDailyCost());
    }
    public double getAverageCost(String type){
        return 0;
    }
    public Sauna getMostExpensive(){
        Sauna mostexpensive = null;
        double higehstcost = 0;
        for (Sauna s : saunas){
            if (higehstcost == 0) {
                higehstcost = s.calculateDailyCost();
                mostexpensive = s;
            }
            if (s.calculateDailyCost() > higehstcost){
                higehstcost = s.calculateDailyCost();
                mostexpensive = s;
            }
        }
        return mostexpensive;
    }
    public Sauna getCheapest(){
        Sauna leastExpensive = null;
        double lowestCost = 0;
        for (Sauna s : saunas){
            if (lowestCost == 0) {
                lowestCost = s.calculateDailyCost();
                leastExpensive = s;
            }
            if (s.calculateDailyCost() < lowestCost){
                lowestCost = s.calculateDailyCost();
                leastExpensive = s;
            }
        }
        return leastExpensive;
    }
}
