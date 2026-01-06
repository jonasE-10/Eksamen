import java.util.ArrayList;

public class TamagotchiCenter {
    ArrayList<Tamagotchi> allTamagotchi;

    public TamagotchiCenter(){
        allTamagotchi = new ArrayList<>();
    }
    public void addPet(String name){
        Tamagotchi tamagotchi = new Tamagotchi(name,50,50,50);
        allTamagotchi.add(tamagotchi);
    }
    public void removePet(String name){
        System.out.println();
        System.out.println("--- Removing pet "+name+" ---");
        allTamagotchi.remove(getPet(name));
    }
    public Tamagotchi getPet(String name){
        Tamagotchi tamagotchi = null;
        if (!allTamagotchi.isEmpty()){
            for (Tamagotchi t : allTamagotchi){
                if (t.name == name){
                    tamagotchi = t;
                }
            }
        }
        return tamagotchi;
    }
    public void performActivityOnPet(String name, int activity,int duration){
        System.out.println();
        getPet(name).performActivity(activity,duration);
    }
    public void printStatusReport(){
        System.out.println();
        System.out.println("--- Status report ---");
        if (!allTamagotchi.isEmpty()){
            for (Tamagotchi t : allTamagotchi){
                System.out.println();
                System.out.println(t.toString());
            }
        }
        System.out.println();
        System.out.println("--- Report done ---");
    }
    public void getHappiestPet(){
        System.out.println();
        Tamagotchi pet = null;
        int highestHappiness = 0;
        if (!allTamagotchi.isEmpty()){
            for (Tamagotchi t : allTamagotchi){
                if (highestHappiness == 0 && pet == null){
                    pet = t;
                    highestHappiness = t.happiness;
                }
                if (t.happiness > highestHappiness) {
                    pet = t;
                    highestHappiness = t.happiness;
                }
            }
        }
        System.out.println("--- Happiest Pet is "+pet.name+" ---");
        System.out.println("--- With a happiness of "+highestHappiness+" ---");
    }
    public void getMostHungryPet(){
        System.out.println();
        Tamagotchi pet = null;
        int highestHunger = 0;
        if (!allTamagotchi.isEmpty()){
            for (Tamagotchi t : allTamagotchi){
                if (highestHunger == 0 && pet == null){
                    pet = t;
                    highestHunger = t.hunger;
                }
                if (t.hunger > highestHunger) {
                    pet = t;
                    highestHunger = t.hunger;
                }
            }
        }
        System.out.println("--- Most hungry Pet is "+pet.name+" ---");
        System.out.println("--- With a hunger level of "+ highestHunger +" ---");
    }
    public void getAverageHappiness(){
        System.out.println();
        int averageHappiness = 0;
        int amountOfTamagotchi = allTamagotchi.size();
        if (!allTamagotchi.isEmpty()){
            for (Tamagotchi t : allTamagotchi){
                averageHappiness += t.happiness;
            }
        }
        averageHappiness = averageHappiness/amountOfTamagotchi;
        System.out.println("--- Average happiness of all Tamagotchi ---");
        System.out.println("--- Is "+averageHappiness+" ---");
    }
}
