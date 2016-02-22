package com.bgogoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static DuplicateNumbers dup = new DuplicateNumbers();
    public static void main(String[] args) {
        String array = sc.nextLine();
        String[] numbers = array.split("");
        List<String> string = new ArrayList<String>(Arrays.asList(numbers));
        dup.setNumbers(string);
        int max_sum = 0;
        for(String s:string)
        {
        if(createDuplicates(s)>max_sum)
        {
            max_sum = createDuplicates(s);
        }
        }
        System.out.print(max_sum);
    }
    public static int createDuplicates(String item)
    {
        ArrayList<String> duplicate = new ArrayList<String>();
        int position = dup.findNumber(item);
        duplicate.addAll(dup.getNumbers());
        duplicate.add(position,item);
        int sum =0;
        for(int j=0;j<duplicate.size();j++)
        {
            sum+=Integer.parseInt(duplicate.get(j));
        }
        return sum;
    }
}
