/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_Arrays;


import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Liam
 */
public class EX_First_Array_1_2_3_4_5 {
    static int RandomArray[]= new int[100];
        
    public static void main(String[] args){
        int Min = 1;
        int Max = 1000;
        int Biggest = RandomArray[0];
        int Smallest = RandomArray[0];
        int SumOfNumbers = RandomArray[0];
        int Avg = RandomArray[0];
        int seven = RandomArray[0];

    for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = ThreadLocalRandom.current().nextInt(Min,Max+1);
           //System.out.println(RandomArray[i]); //visual aid of output
    }
        
        System.out.println("Largest number is: "+ LargestNumber(Biggest));
        System.out.println("Smallest number is: " + SmallestNumber(Smallest));
        System.out.println("Sum of the array is: "+ SumOfNums(SumOfNumbers));
        System.out.println("Average of the array is: "+ Average(Avg));
        System.out.println("Number of sevens: " + FrequancyOfSeven(seven));
        
    }
    
    
    
    public static int LargestNumber(int max){
    
        max = RandomArray[0] ;

        for (int i = 0; i < RandomArray.length; i++) {
            if (RandomArray[i]> max) {
                max = RandomArray[i];
            }
        }
        
        return max;
    }
    public static int SmallestNumber(int min){
        min = RandomArray[0];
        for (int i = 0; i < RandomArray.length; i++) {
            if (RandomArray[i]< min) {
                min = RandomArray[i];
            }
        }
        
        return min;
    }
   
    public static int SumOfNums(int sum){
        sum = 0;
        
        for (int i = 0; i < RandomArray.length; i++) {
            sum += RandomArray[i];
        }
        
        return sum;
    }
    public static int Average(int avg){
       avg = 0;
       int sum = 0;
       
        for (int i = 0; i < RandomArray.length; i++) {
            sum += RandomArray[i];
        }
        for (int i = 0; i < RandomArray.length; i++) {
            avg = sum / RandomArray.length;
        }
        return avg;
        
    }
    public static int FrequancyOfSeven(int SevenCounter){
    
        
        for (int i = 0; i < RandomArray.length; i++) {
            if (RandomArray[i] == 7) {
                SevenCounter++;
            }
        }
        return SevenCounter;
    }
}
