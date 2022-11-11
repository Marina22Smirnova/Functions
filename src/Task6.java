import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("Введите три числа:");
        example();
    }
        public static void example () {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("Наименьшее число: " + a);
        }
        if (b <= a && b <= c) {
            System.out.println("Наименьшее число: " + b);
        }
        if (c <= a && c <= b) {
            System.out.println("Наименьшее число: " + c);
        }
    }
}
