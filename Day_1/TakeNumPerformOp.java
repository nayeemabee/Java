import java.io.Console;

public class TakeNumPerformOp{
    public static void main(String[] args){
        Console console = System.console();
        int result = 0;
        System.out.println("Enter a number 1:");
        String input1 = console.readLine();
        Integer num1 = Integer.parseInt(input1);

        System.out.println("Enter a number 2:");
        String input2 = console.readLine();
        Integer num2 = Integer.parseInt(input2);

        System.out.println("Enter one opertor from these :- '+', '-', '*', '/' :");
        String opertor = console.readLine();

        switch(opertor){
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if(num2 != 0){
                    result = num1 / num2;
                    break;
                } else{
                    System.out.println("Cannot divide by Zero");
                    return;
                }
            
            default:
                System.out.println("Enter a valid operator");
                return;
                      
        }

        System.out.println("This is the final Result: " + result);
        
    }
}