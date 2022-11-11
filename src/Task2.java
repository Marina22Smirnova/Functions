import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        print55(count);
    }
    public static void print55(int n) {
        Scanner sc2 = new Scanner(System.in);
        String name = sc2.next();
        String row = "";
        for (int i = 0; i < n; i++) {
            row += name;
            System.out.println(row);
        }
    }
}
