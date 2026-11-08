static double func(double x) {
    return Math.sin(x) + 5;
}

static void funktionstabelle() {
    for(int i = -10; i <= 10; i++) {
        System.out.println(i + " --> " + func(i));
    }
}

static void main() {

    double a = 10;

    double resultsin = func(a);
    System.out.println(resultsin);

    funktionstabelle();
    

}