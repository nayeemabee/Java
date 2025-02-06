import java.util.Scanner; 

public class FindSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();
        scanner.close();
        int result = 0;

        for (int i=0; i<= num; i++){
            result+=i;
        }

        System.out.println("The final Sum is: " + result);
    }
}