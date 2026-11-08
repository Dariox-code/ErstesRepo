static double power(double x, int y) {
    double resultpower = 1;
    for (int i = 0; i < y; i++) {
        resultpower *= x;
    }
    return resultpower;
}

static double fac(int x) {
    double resultfac = 1;
    for (int i = 1; i <= x; i++) {
        resultfac *= i;
    }
    return resultfac;
}

static double cosinus(double x) {
    double cosresult = 1;
    int sign = -1;

    for (int j = 1; j <= 10; j++) {
        int exponent = j * 2;
        cosresult += sign * (power(x, exponent)/fac(exponent)); 
        sign *= -1;
    }
    return cosresult;
}


static void main() {

    double start, END;
    start = 0.0;
    END = 2*Math.PI;

    System.out.println(cosinus(start));
    System.out.println(cosinus(END));
}
