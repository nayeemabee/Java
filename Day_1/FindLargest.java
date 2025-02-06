import java.io.Console;

public class FindLargest{
    public static void main(String[] args){
        Console console = System.console();
        int largest = 0;

        for(int i=0; i<3; i++){

            System.out.print("Enter a number:");
            String input = console.readLine();

            int num = Integer.parseInt(input);
            
            if(largest<num){
                largest = num;
            }
        }

        System.out.println(largest);
    }
}