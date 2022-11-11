import java.util.Scanner;

public class FunctionWiyhParams {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }

    public static void sum(int number1, int number2) {
        System.out.println(number1+number2);
    }
}
