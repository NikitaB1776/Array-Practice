//The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {

        int n = num.length;
        int carry = k;
        List<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0 || carry > 0; i--) {
            int currentdigit = (i > 0) ? num[i] : 0;
            int sum = currentdigit + carry;

            result.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 2, 1};
        int k = 879;
        System.out.println("Result: " + addToArrayForm(num, k));
    }
}
