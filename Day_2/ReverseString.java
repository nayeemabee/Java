import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        String reversedString = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string is: "+ reversedString);
    }
}