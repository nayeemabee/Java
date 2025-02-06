import java.io.Console;

public class FindIfPalindrome{
    public static void main(String[] args){
        Console console = System.console();
        System.out.print("Enter a value: ");
        String input = console.readLine();

        String reversedNum = new StringBuilder(input).reverse().toString();

        if(input.equals(reversedNum)){
            System.out.println("Its a palindrome!");
        } else{
            System.out.println("Not a palindrome!");
        }
    }
}