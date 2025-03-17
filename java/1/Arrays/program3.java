import java.util.Scanner;

public class program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 25, 30, 45, 50};

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int index = -1;

        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}

