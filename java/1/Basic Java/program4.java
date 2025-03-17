import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number for fibonacci series: ");
        int n = scanner.nextInt();

        long a=0 ,b=1;

        System.out.println("Printing series :");
        while(n > 0){

            System.out.println(a);

            long tmp = a;
            a = b;
            b = tmp + b;

            n--;
        }


        scanner.close();
    }
}
