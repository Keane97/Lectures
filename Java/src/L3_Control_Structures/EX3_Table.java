/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_Control_Structures;

import java.util.Scanner;

/**
 *
 * @author Liam
 */
public class EX3_Table {
    
    public static void main(String[] args){
    
        Scanner nc = new Scanner(System.in);
        
        System.out.print("Enter a Positive Number: \t\n");
        int number = nc.nextInt();
        System.out.println("N = " + number);
        System.out.println("");
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i*j + "\t");
            } 
            System.out.println("");
        }
    }
}
