import java.util.Scanner; 

public class FindPrime{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();
        scanner.close();

        if(num<=1){
            System.out.println("Not a Prime");
            return;
        }

        if (num==2 || num==3){
            System.out.println("Prime");
            return;
        }

        if(num%2==0){
            System.out.println("Not a Prime");
            return;
        }

        for (int i=3; i<= num/2; i+=2){
            if(num%i==0){
                System.out.println("Not a Prime");
                return;
            }
        }

        System.out.println("Prime");
    }
}