public class Tamagotchi {
    String name;
    int hunger,energy,happiness;
    int coins;

    public Tamagotchi(String name, int hunger,int energy,int happiness){
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
        this.happiness = happiness;
        coins = 0;

    }
    public void performActivity(int activity, int duration){
        switch (activity){
            case 1:
                System.out.println("Performing activity: Sleep for "+name);
                System.out.println("Increasing energy by 5 times "+duration);
                System.out.println("Increasing hunger by 2 times "+duration);
                energy += 5*duration;
                hunger += 2*duration;
                break;
            case 2:
                System.out.println("Performing activity: Eat for "+name);
                System.out.println("Decreasing hunger by 4 times "+duration);
                hunger -= 4*duration;
                break;
            case 3:
                System.out.println("Performing activity: Play for "+name);
                System.out.println("Increasing happiness by 5 times "+duration);
                System.out.println("Increasing hunger by 1 times "+duration);
                System.out.println("Decreasing energy by 3 times "+duration);
                happiness += 5*duration;
                energy -= 3*duration;
                break;
            case 4:
                System.out.println("Performing activity: Work for "+name);
                System.out.println("Increasing coins by 3 times "+duration);
                System.out.println("Increasing hunger by 1 times "+duration);
                System.out.println("Decreasing happiness by 2 times "+duration);
                coins += 3*duration;
                hunger += duration;
                happiness -= 2*duration;
                break;
        }
    }

    @Override
    public String toString(){
        String string = "--- "+name+" ---"+"\n"
                +"Hunger level: "+hunger+"\n"
                +"Energy level: "+energy+"\n"
                +"Happiness level: "+happiness+"\n"
                +"Amount of coins: "+coins;
        return string;
    }
}
