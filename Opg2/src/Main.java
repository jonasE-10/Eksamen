void main(String[] args) {
    SaunaVillage saunaVillage = new SaunaVillage();
    saunaVillage.loadFromCSV("Opg2/Resources/Saunaer.csv");
    saunaVillage.printReport();
}