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
public class EX2_Date {
    
    public static void main(String[] args){
        int day1;
        int Month1;
        int year1;
        
        System.out.println("Enter Day");
        Scanner day = new Scanner(System.in);
        day1 = day.nextInt();
        
        System.out.println("Enter Month");
        Scanner Month = new Scanner(System.in);
        Month1 =Month.nextInt();
        
        System.out.println("Enter Year");
        Scanner Year = new Scanner(System.in);
        year1 = Year.nextInt();
        
        if (day1 > 1 || day1 < 31 && Month1 >1 || Month1 < 12) {
            if (day1> 31) {
                day1=1;
                Month1++;
                 if (Month1 > 12) {
                     Month1 =1;
                    year1++;
                }
            }
            else{
                 day1++;
            }
             
            System.out.println("Successor date is: "+ day1 +"/" + Month1 + "/"+ year1 );
            //System.out.println(day1);
           
            
        } else {
            System.out.println("Invalid number");
            System.exit(0);
        }
    }
}
