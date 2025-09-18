public class Palindrome {
    public static void main(String[] args) {
        String str = "lol";

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("Это палиндром");
        } 
        
        else {
            System.out.println("Это не палиндром");
        }
    }
}