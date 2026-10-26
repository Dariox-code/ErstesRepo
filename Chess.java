static void main(){

    int n = 5;
    String lineOdd = "* * *";
    String lineEven = " * * ";

    for (int i=0; i<n; i++) {
        if (i%2 == 0) {
            System.out.println(lineOdd);
        } else {
            System.out.println(lineEven);
        } 
    }

}
