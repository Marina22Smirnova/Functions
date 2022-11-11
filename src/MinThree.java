public class MinThree {

    public static void main(String[] args){

        int result = min(8,7,9);
        System.out.println(result);
    }
    public static int min(int a, int b, int c){
        int x = 0;
        if (a <= b && a <= c){
            x = a;
        }
        if (b <= c && b <= a){
            x = b;
        }
        if (c <= a && c <= b){
            x = c;
        }
        return x;
    }
}


