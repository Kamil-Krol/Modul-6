package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> numbers= new LinkedList<>();


    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers)
    {
        List<Integer> evenList = new LinkedList<>();
        for (Integer list : numbers)
        {

            if (list%2==0)
            {
                evenList.add(list);
            }

        }

        return evenList;
    }
}
