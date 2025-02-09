//You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
//
//The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
//
//Return the earliest year with the maximum population.
import java.util.*;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        // Sample input logs directly in the code
        int[][] logs = {
                {2000, 2010},
                {1975, 2005},
                {1985, 2003},
                {2001, 2004}
        };

        // Call the function to find the earliest year with max population
        int year = maximumPopulation(logs);
        System.out.println("Earliest Year with Maximum Population: " + year);
    }

    public static int maximumPopulation(int[][] logs) {

        int[] years = new int[2051];

        for(int[] log:logs){
            years[log[0]]++;
            years[log[1]]--;

        }
        int maxpopulation=0 , currentpopulation=0, earliestyear=0;

        for(int year=1900 ;year<2025 ; year++){
            currentpopulation += years[year];
            if(currentpopulation>maxpopulation){
                maxpopulation=currentpopulation;
                earliestyear=year;
            }
        }
        return earliestyear;
    }
}