/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_Methods;

import java.util.Scanner;

/**
 *
 * @author Liam
 */
public class EX2_Palindrome {
    
    public static void main(String[] args){
        
        System.out.println("Enter the first number");
        Scanner FirstNum1 = new Scanner(System.in);
        int FirstNum = FirstNum1.nextInt();
        
        System.out.println("Enter the second number");
        Scanner SecondNum1 = new Scanner(System.in);
        int SecondNum = SecondNum1.nextInt();
        
        int sum = FirstNum * SecondNum;
        System.out.println("The sum of the two numbers is: "+ sum);
       
        if (isPalindrome(sum)) {
            System.out.println(sum + " Is a palindrome");
        }
        else{
            System.out.println(sum + " Is not a palindrome");
        }
        
        System.out.println("Biggest Three digit palindrome is: "+ biggestpalindrome());
    }
    
    
    static int biggestpalindrome(){
         int max = 1;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                int temp = i * j;
                
                if (max < temp) {
                    if (isPalindrome(temp)) {
                        max = temp;
                        break;
                    }
                } else {
                    break;
                }
            }//end for
        }//end for
        
        return max;
    }
    static boolean isPalindrome(int SUM){
        int palindrome = SUM;
        int reverse = 0;
        
         while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

        
        return SUM == reverse;
    }
    
}
