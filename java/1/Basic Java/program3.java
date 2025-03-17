import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = scanner.nextInt();
        System.out.println(n+" Factorial is equal to "+getFact(n));

        scanner.close();
    }

    static int getFact(int n){
        if(n==1){
            return 1;
        }
        return n * getFact(n-1);
    }
}
