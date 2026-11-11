static int[] fiveRandomNumbers() {
    int[] NumberOfFive = new int[5];
    for (int i = 0; i <= NumberOfFive.length - 1; i++) {
        int RandomNumber = (int)((6 * Math.random()) + 1);
        NumberOfFive[i] = RandomNumber;
    }
    return NumberOfFive;
}

static void main() {
    
}
