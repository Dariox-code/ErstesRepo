static void main() {

    int diceFirstNumber = 6;
    int diceSecondNumber = 1;
    int diceSites;

    if (diceFirstNumber < diceSecondNumber) {
        diceSites = (diceSecondNumber + 1) - diceFirstNumber;
        int diceRoll = (int)(diceSites * Math.random() + diceFirstNumber);
        System.out.println(diceRoll); 
    } else {
        diceSites = (diceFirstNumber + 1) - diceSecondNumber;
        int diceRoll = (int)(diceSites * Math.random() + diceSecondNumber);
        System.out.println(diceRoll);
    }
}