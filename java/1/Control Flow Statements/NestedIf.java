import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers :");
        
        int a,b,c;
        
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if(a >b ){

            if(a >c){
                System.out.println(a + " is Largest Number");
            }else{
                System.out.println(c + " is Largest Number");
            }
        }else{
            if(b>c){
                System.out.println(b + " is Largest Number");
            }else{
                System.out.println(c + " is Largest Number");
            }
        }


        scanner.close();
    }
}
