import java.util.ArrayList;

public class ElectricSauna implements Sauna{
    String name;
    ArrayList<Integer> temperatures;

    public ElectricSauna(String name){
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
        for (int tempereture : temperatures){
            if (tempereture > 50){
                sum += 8;
                if (tempereture > 70){
                    sum += (2*(tempereture-70));
                }
            }
        }
        return sum;
    }
}
