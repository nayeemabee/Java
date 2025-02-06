import java.util.Scanner; 

public class Factorial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();
        scanner.close(); 

        int result = 1;
        for(int i=0; i<num; i++){
            result *= num;
            num--;
        }

        System.out.println(result);
        
    }
}