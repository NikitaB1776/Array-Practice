//leetcode problem - kids with the greatest number of candies
// here we are going to use the arraylist to solve this problem in a better way
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            candies[i]=sc.nextInt();
        }
        System.out.println("Enter the extra candies each kid has");
        int extracandies=sc.nextInt();

        List<Boolean> result = kidswithcandies(candies,extracandies);
        System.out.println(result);
    }
    public static List<Boolean> kidswithcandies(int[] candies , int extracandies)
    {
        int max = 0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();

        for(int i=0;i<candies.length;i++)
        {
            int newcandies = candies[i]+extracandies;

            if(newcandies>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }


}
