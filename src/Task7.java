public class Task7 {

    public static void main(String[] args) {
        double sum1 = per1(5, 6, 7) + square1(5, 6, 7);
        System.out.println(sum1);
        double sum2 = per2(8, 9, 1) + square2(8, 9, 1);
        System.out.println(sum2);
    }

    public static int per1(int a, int b, int c) {
        int P1 = a + b + c;
        return P1;
    }

    public static double square1(double a, double b, double c) {
        double p1 = a + b + c;
        double pp1 = p1 * 0.5;
        double s1 = Math.sqrt(pp1 * (pp1 - a) * (pp1 - b) * (pp1 - c));
        return s1;
    }

    public static int per2(int c, int d, int e) {
        int P2 = c + d + e;
        return P2;
    }

    public static double square2(double c, double d, double e) {
        double p2 = c + d + e;
        double pp2 = p2 * 0.5;
        double s2 = Math.sqrt(pp2 * (pp2 - c) * (pp2 - d) * (pp2 - d));
        return s2;
    }
}
