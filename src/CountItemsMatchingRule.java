//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//
//The ith item is said to match the rule if one of the following is true:
//
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        sc.nextLine();

        List<List<String>> items = new ArrayList<>();
        //Enter the details for each item
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the details for the item" +(i+1) + ":");
            System.out.println("Type :");
            String type = sc.nextLine();
            System.out.println("Color:");
            String color =sc.nextLine();
            System.out.println("Name :");
            String name =sc.nextLine();

            List<String> item = new ArrayList<>();
            item.add(type);
            item.add(color);
            item.add(name);
            items.add(item);
        }

        System.out.println("Enter the rulekey (type/color/name):");
        String rulekey =sc.nextLine();
        System.out.println("Enter the rulevalue");
        String rulevalue = sc.nextLine();



    }

    public static int countMatches(List<List<String>> items , String rulekey , String rulevalue)
    {
        int count =0;
        int index=-1;

        switch(rulekey){
            case "type":
                index =0;
                break;
            case "color":
                index=1;
                break;
            case "name":
                index=2;
                break;
            default:
                return 0;

        }

        for(List<String> item :items){
            if(item.get(index) .equals(rulevalue)){
                count++;
            }
        }
        return count;
    }
}
