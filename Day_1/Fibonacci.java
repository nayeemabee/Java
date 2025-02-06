import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);

        for(int i = 2; i<(num); i++){
            int nextNumber = numbers.get(i-1) + numbers.get(i-2);
            numbers.add(nextNumber);
        }

        System.out.println(numbers);
        scanner.close(); 
    }
}