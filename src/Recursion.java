public class Recursion {

    public static void main(String[] args) {
       String phrase = recFunction("Word");
       System.out.println(phrase);
    }

        public static String recFunction(String word){
        if (word=="Word") {
            recFunction("Hello ");
        }
        return word;

    }
}
