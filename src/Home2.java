import java.util.Scanner;

public class Home2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество знаков: ");
        int n = sc.nextInt();
        stars(n);
        }
        public static void stars(int n) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
    }
