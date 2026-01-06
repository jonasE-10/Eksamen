void main(String[] args) {
    TamagotchiCenter tamagotchiCenter = new TamagotchiCenter();
    tamagotchiCenter.addPet("Jens");
    tamagotchiCenter.addPet("Bob");
    tamagotchiCenter.addPet("Jon");
    tamagotchiCenter.printStatusReport();
    tamagotchiCenter.removePet("Jon");
    // 1 = sleep, 2 = eat, 3 = play, 4 = work
    tamagotchiCenter.performActivityOnPet("Bob",3,5);
    tamagotchiCenter.performActivityOnPet("Jens",4,5);
    tamagotchiCenter.performActivityOnPet("Jens",2,5);
    tamagotchiCenter.performActivityOnPet("Jens",1,5);
    tamagotchiCenter.printStatusReport();
    tamagotchiCenter.getHappiestPet();
    tamagotchiCenter.getMostHungryPet();
    tamagotchiCenter.getAverageHappiness();
}