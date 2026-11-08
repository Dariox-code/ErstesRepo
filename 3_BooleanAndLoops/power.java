static void main() {

    int aktuellerExponent = 1;
    int result;

    do {

        result = (int)Math.pow(2, aktuellerExponent);
        System.out.println("Das Ergebnis ist: " + result);
        aktuellerExponent++;

    } while (aktuellerExponent <= 10);

}

//for(int i = 0 ; aktuellerExponent <= 10 ; aktuellerExponent++ ) später implementieren