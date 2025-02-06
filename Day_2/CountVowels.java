import java.util.Scanner; 

public class CountVowels{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String str = scanner.nextLine();
        scanner.close();
        int result = 0;

        for (char i : str.toCharArray()){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                result+=1;
            }
            
        }

        System.out.println("The final Count is: " + result);
    }
}