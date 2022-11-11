public class MinFour {

    public static void main(String[] args) {
        int result = minFour(10, 5, 6, 3);
        System.out.println(result);
    }
        public static int minFour(int a,int b, int c, int d) {
            int s = min(10, 5);
            int x=0;
            if (s < c) {
                x = s;
            }
            if (c < s) {
                x = c;
            }
            if (d < s){
                x = d;
            }
            return x;
        }
        public static int min(int a, int b) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }
    }
