/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_Primitive_Data_Types;

import java.util.Scanner;

/**
 *
 * @author Liam
 */
public class EX1_Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number,reverse=0;
        System.out.println("Enter A Number Between 101 and 199 That you wish to reverse");
        
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        if (number < 101 || number > 199) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        else{
                while(number !=0)
            {
                reverse = reverse * 10;
                reverse = reverse + number % 10;
                number = number/10;
            }
        
        }
        
       System.out.println("The Number Reversed is : " + reverse);
    }
    
}
