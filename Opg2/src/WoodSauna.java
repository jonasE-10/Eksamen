import java.util.ArrayList;

public class WoodSauna implements Sauna {
    String name;
    ArrayList<Integer> temperatures;

    public WoodSauna(String name){
        this.name = name;
        temperatures = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addTemperature(int degrees) {
        temperatures.add(degrees);

    }

    @Override
    public double calculateDailyCost() {
        double sum = 0;
        for (int temperature : temperatures){
            if (temperature > 50){
                sum += 12;
            }
        }
        return sum;
    }
}
