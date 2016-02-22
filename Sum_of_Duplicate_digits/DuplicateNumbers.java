package com.bgogoi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bhaskar on 2/22/2016.
 */
public class DuplicateNumbers {
    List<String> numbers = new ArrayList<String>();

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getNumbers() {
        return numbers;
    }
    public void addNumbers(String item)
    {
        numbers.add(item);
    }
    public void displayNumbers()
    {
        for(int i=0;i<numbers.size();i++)
        {
            System.out.print(numbers.get(i));
        }
    }
    public int findNumber(String item)
    {
        return numbers.indexOf(item);
    }
}
