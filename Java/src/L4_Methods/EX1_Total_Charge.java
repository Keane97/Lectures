/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Liam
 */
public class EX1_Total_Charge {
    
    public static void main(String[] args){
    
        DecimalFormat df = new DecimalFormat("€#.00");
        
        
        System.out.println("How Long Will You Be Staying in the Car Park");
        Scanner hours1 = new Scanner(System.in);
        double Hours = hours1.nextDouble();
        
        
        
        System.out.println("Total Charge: " + df.format(Calculation(Hours)));
    }
    
     static double Calculation(double Hours){
    double TotalCharge=2;
        if (Hours > 3) {
            TotalCharge += (Math.ceil(Hours) - 3) * 0.5;
        }
        if (TotalCharge > 10.00) {
            TotalCharge = 10.00;
        }

    
        return TotalCharge;
    }
    
}
