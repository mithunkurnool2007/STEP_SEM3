package week10.assigment_problems;

import java.util.Scanner;

public class WordPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(reversed + (word.equals(reversed)
                ? " - palindrome" : " - not a palindrome"));
        sc.close();
    }
}