//Leetcode question -- You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.


import java.util.Scanner;

public class TwoDimensionalArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements");
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxwealth = maximumwealth(matrix);
        System.out.println(maxwealth);

    }
    public static int maximumwealth(int[][] matrix)
    {
        int maxwealth = 0;

        for(int i =0;i<matrix.length;i++)
        {
            int currentwealth=0;

            for(int j=0;j<matrix[i].length;j++)
            {
                currentwealth+=matrix[i][j];
            }
            if(currentwealth>maxwealth)
            {
                maxwealth=currentwealth;
            }
        }
        return maxwealth;
    }
}


//leetcode solution

class Solution {
    public int maximumWealth(int[][] accounts) {

        int richestcustomer=maxwealth(accounts);
        return richestcustomer;
    }
    public static int maxwealth(int[][] accounts)
    {
        int max = 0;

        for(int i=0;i<accounts.length;i++)
        {
            int currentwealth=0;

            for(int j=0;j<accounts[i].length;j++)
            {
                currentwealth+=accounts[i][j];
            }
            if(currentwealth>max)
            {
                max=currentwealth;
            }
        }
        return max;
    }
}