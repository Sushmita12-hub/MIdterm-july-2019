package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

            String reverse=" ";

        System.out.println("Enter the input string:");

            Scanner sc = new Scanner(System.in);
            String actual =sc.nextLine();

        for(int i = actual.length()-1;i>=0; i--){
            reverse = reverse + actual.charAt(i);
        }
        if(actual.equalsIgnoreCase(reverse)){
            System.out.println("is palidrome");
        }else {
            System.out.println("Not a palidrome");
        }
    }
    }




