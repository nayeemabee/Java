import java.io.Console;

public class ReverseTheNum{
    public static void main(String[] args){
        Console console = System.console();
        System.out.print("Enter a number: ");
        String input = console.readLine();

        String reversedNum = new StringBuilder(input).reverse().toString();

        System.out.println("Reverse num: "+ reversedNum);
    }
}