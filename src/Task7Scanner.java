import java.util.Scanner;

public class Task7Scanner {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите значения сторон первого треугольника: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            System.out.println("Введите значения сторон второго треугольника");
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();

            double x = per1(a ,b, c);
            double y = square1(a, b, c);
            double sum1 = x+y;
            System.out.println("Сумма периметра и площади первого треугольника равна "+sum1);

            double n = per2(d ,e, f);
            double m = square2(d, e, f);
            double sum2 = m+n;
            System.out.println("Сумма периметра и площади второго треугольника равнв "+sum2);
        }

        public static double per1(double a, double b, double c) {
            double P1 = a + b + c;
            return P1;
        }
        public static double square1(double a, double b, double c) {
            double p1 = a + b + c;
            double pp1 = p1 * 0.5;
            double s1 = Math.sqrt(pp1 * (pp1 - a) * (pp1 - b) * (pp1 - c));
            return p1;
        }

        public static double per2(double d, double e, double f) {
            double P2 = d + e + f;
            return P2;
        }

        public static double square2(double d, double e, double f) {
            double p2 = d + e + f;
            double pp2 = p2 * 0.5;
            double s2 = Math.sqrt(pp2 * (pp2 - d) * (pp2 - e) * (pp2 - f));
            return s2;
        }
}
