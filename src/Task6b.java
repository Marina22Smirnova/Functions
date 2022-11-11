import java.util.Scanner;

public class Task6b {
    public static void main (String [] args) {
        System.out.println("Введите четыре числа: ");
        FunctionMinimum4();
    }
        public static void FunctionMinimum4(){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min1 = Math.min(a, b);
        int min2 = Math.min(b, c);
        int min3 = Math.min(c, d);
        int min4 = Math.min(a, d);

        if(min1 == min2){
            System.out.println("Наименьшее число:" + b);
        }
        if(min2==min3){
             System.out.println("Наименьшее число:" + c);
        }
        if(min1==min4){
            System.out.println("Наименьшее число:" + a);
        }
        if(min3==min4) {
            System.out.println("Наименьшее число:" + d);
        }
    }
}


