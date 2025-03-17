import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to count vowels");
        String input = sc.nextLine();

        System.out.println("The String Contains "+countVowels(input)+" Vowels");

        sc.close();
    }

    static int countVowels(String str){
        int vowels = 0;

        for(int i=0;i<str.length();i++){
            char c = str.toLowerCase().charAt(i);
            if(c =='a' || c =='e' || c =='i' || c =='o' ||  c =='u'){
                vowels++;
            }
        }

        return vowels;
    }
}
