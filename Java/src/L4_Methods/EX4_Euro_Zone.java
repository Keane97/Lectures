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
public class EX4_Euro_Zone {
    public static void main(String[] args) {
        int x = findPoss(200, 0);
        System.out.println(x);
    }

    private static int findPoss(int money, int maxcoin) {
        int coins[] = {200, 100, 50, 20, 10, 5, 2, 1};

        int sum = 0;
        if (maxcoin == 7) {
            return 1;
        }
        
        for (int i = maxcoin; i < 8; i++) {
            if (money - coins[i] == 0) {
                sum += 1;
            }
            if (money - coins[i] > 0) {
                sum += findPoss(money - coins[i], i);
            }
        }
        return sum;

    }
}
