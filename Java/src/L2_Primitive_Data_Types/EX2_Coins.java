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
public class EX2_Coins {
   
    
    public static void main(String[] args) {
     
        double change1;
        System.out.println("what change of have you?\n ");
        Scanner in = new Scanner(System.in);
        change1 = in.nextDouble();
        
        System.out.println("Your change is "+ "\u20ac"+ change1);
        
        int change = (int)(Math.ceil(change1*100));
        
        int TwoEuro = Math.round((int)change/200);
        change = change%200;
        
        int OneEuro =  Math.round((int)change/100);
        change = change%100;
        
        int FiftyCent =  Math.round((int)change/50);
        change = change%50;
        
        int TwentyCent =  Math.round((int)change/20);
        change = change%20;
        
        int TenCent =  Math.round((int)change/10);
        change = change%10;
        
        int FiveCent =  Math.round((int)change/5);
        change = change % 5;
        
        System.out.println(change1+" Broken down is: \n");
        System.out.println("2 euro : " + TwoEuro);
        System.out.println("1 euro : " + OneEuro);
        System.out.println("50 cent : " + FiftyCent);
        System.out.println("20 cent : " + TwentyCent);
        System.out.println("10 cent: " + TenCent);
        System.out.println("5 cent : " + FiveCent);
        
     }
     
}
