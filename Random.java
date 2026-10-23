static void main() {

    int diceMin = 6;
    int diceMax = 20;
    int diceSites = (diceMax + 1) - diceMin;

    int diceRoll = (int)(diceSites * Math.random() + diceMin);

    while (diceRoll < 20) {
        diceRoll = (int)(diceSites * Math.random() + diceMin);
    
        System.out.println(diceRoll);
    }

    System.out.println("Geschafft!");
}
