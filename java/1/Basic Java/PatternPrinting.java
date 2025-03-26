import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] Print Square");
        System.out.println("[2] Print Triangle");
        System.out.print("Enter your choice :");

        int choice = scanner.nextInt();
        int len;

        if(choice == 1){
            System.out.print("Enter length of side : ");
            len = scanner.nextInt();
            printSquare(len);
        }else if(choice == 2){
            System.out.print("Enter height : ");
            len = scanner.nextInt();
            printTriangle(len);
        }else{
            System.out.println("Invalid Choice");
        }

        scanner.close();
    }

    static void printSquare(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printTriangle(int len){
        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
