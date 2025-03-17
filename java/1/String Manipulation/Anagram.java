import java.util.Scanner;

public class Anagram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString, secondString;
        int count[] = new int[26];

        System.out.print("Enter First String :");
        firstString = sc.nextLine().toLowerCase();

        System.out.print("Enter Second String :");
        secondString = sc.nextLine().toLowerCase();

        sc.close();

        int maxLength = (firstString.length() > secondString.length())?firstString.length():secondString.length();
        int i = 0;

        while(i < maxLength){

            if(i < firstString.length()){
                count[firstString.charAt(i)-'a']++;
            }

            if(i < secondString.length()){
                count[secondString.charAt(i)-'a']--;
            }

            i++;
        }

        boolean isAnagram = true;

        for(i =0;i <26;i++){
            if(count[i] != 0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram == true){
            System.out.println("Strings are Anagrams");
        }else{
            System.out.println("Strings are not Anagrams");
        }

    }
}
