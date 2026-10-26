static void main() {
    // Größe des Schachfeldes
    // Wenn Sie Ihren Code vom automatischen Testsystem prüfen lassen wollen, muss hier für die Abgabe der Wert 15 eingetragen sein!
    // Zum Testen auf Ihrem eigenen Rechner sollten Sie verschiedene, positive Werte durchprobieren.
    int size = 10;
    
    // nach diesem Kommentar Ihren weiteren Code einfügen:
    for (int i=0; i<size; i++) {
        for (int k=0; k<size; k++) {
            if (i%2 == 0) {
                if (k%2 == 0) {
                    System.out.print("*");
                } else if (k%2 == 1) {
                    System.out.print(" ");
                }
            } else if (i%2 == 1) {
                if (k%2 == 0) {
                    System.out.print(" ");
                } else if (k%2 == 1) {
                    System.out.print("*");
                }
            }
        }

        System.out.println("");

    }
}
