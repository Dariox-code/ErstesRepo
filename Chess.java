static void main(){

    int n = 3;
    
    for (int i=0; i<n; i++) {
        for (int k=0; k<n; k++) {
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
