import java.util.Arrays;

static int RandomNumber(int m) {
    return (int)((m * Math.random()) + 1);
}

static int[] ziehung(int n, int m) {
    int IterateRandLotto = m;
    int zufallszahl;
    int[] lotto = new int[n];
    int[] randomlotto = new int[m];

    //create second array with all possible numbers
    for (int i = randomlotto.length - 1; i >= 0; i--) {
        randomlotto[i] = IterateRandLotto;
        IterateRandLotto -= 1;
    }

    //create the array that will be displayed
    for (int k = lotto.length - 1; k >= 0; k--) {
        do {
            zufallszahl = RandomNumber(m);
        } while (randomlotto[zufallszahl - 1] == 0);
        lotto[k] = zufallszahl;
        randomlotto[zufallszahl - 1] = 0;
    }
    return lotto;
}

static void main() {
    int AmountDraw = 6;
    int SizeDraw = 49;

    int[] LottoDraw = ziehung(AmountDraw, SizeDraw);
    Arrays.sort(LottoDraw); //sorting array in ascending order
    System.out.print("[");
    for (int zahlen: LottoDraw) {
        System.out.print(zahlen);
        if (zahlen != LottoDraw[AmountDraw - 1]) {
            System.out.print(", ");
        } else {
            continue;
        }
    }
    System.out.println("]");
}