public class Fibonacci {

    public static void main(String[] args){
        int k = 5;
        int result = fib(k);
        System.out.println(result);
    }

    public static int fib(int k){
        int number = 0;
        if (k==1||k==2){
            number = 1;
        }else {
            number = fib(k-1)+fib(k-2);
        }
        return number;
    }

}
