static void main() {

    double GRAVITY = 9.81;

    double x0 = 2;
    double v0 = 10;
    double t = 1.5;

    double result = x0 + v0 * t - (GRAVITY * (t * t)) / (2);

    System.out.println(result);

}
