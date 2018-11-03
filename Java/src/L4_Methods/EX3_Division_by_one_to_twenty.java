/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4_Methods;

/**
 *
 * @author Liam
 */
public class EX3_Division_by_one_to_twenty {
    public static void main(String[] args){
        
        int x = iDivide(20);
        System.out.println(x);
    }
    
    static int iDivide(int limit){
        
        boolean flag = false;
        
        int x = limit;
        
        while(!flag){
        
            flag = true;
            for (int i = limit; i >= 11; i--) {
                if (x % i !=0) {
                    x += limit;
                    flag = false;
                }
            }
        }
        return x;
    }
}
