public class RecursionTest{

    public static void main(String[] args ){
        String input = "Hello World";
        System.out.println(input);
        System.out.println("input.substring(2): " + input.substring(2));
        System.out.println("input.charAt(0): " + input.charAt(0));
        System.out.println("reserveString(input): " + reserveString(input));

        String palindrome = "kayak";
        System.out.println("palindrome.charAt(palindrome.length()-1): " + palindrome.charAt(palindrome.length()-1));
        System.out.println("palindrome.substring(1, palindrome.length()-1): " + palindrome.substring(1, palindrome.length()-1));
        System.out.println("isPalindrome(palindrome): " + isPalindrome(palindrome));

    
    }

    public static String reserveString(String input){
        if (input.equals("")){
            return "";
        }
        return reserveString(input.substring(1)) + input.charAt(0);
    }

    public static boolean isPalindrome(String input){
        if (input.length() == 0 || input.length() == 1){
            return true;
        }
        if (input.charAt(0) == input.charAt(input.length()-1)){
            return isPalindrome(input.substring(1, input.length()-1));
        }

        else return false;
    }
}