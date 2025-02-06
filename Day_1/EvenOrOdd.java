import java.io.Console;

public class EvenOrOdd{
    public static void main(String[] args){
        Console console = System.console();
        System.out.print("Enter a number: ");
        String input = console.readLine();
        Integer num = Integer.parseInt(input);

        if((num%2)==0){
            System.out.println("Its a Even Number!");
        } else{
            System.out.println("Its a Odd Number!");
        }
    }
}