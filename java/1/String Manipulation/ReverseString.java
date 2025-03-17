import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to reverse ");
        String inputString = sc.nextLine();

        String reversedString = "";

        for(int i=inputString.length()-1;i>=0;i--){
            reversedString += inputString.charAt(i);
        }

        System.out.println("Reversed String "+reversedString);

        sc.close();
    }
}
