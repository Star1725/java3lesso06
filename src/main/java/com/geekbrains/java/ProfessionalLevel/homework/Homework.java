package com.geekbrains.java.ProfessionalLevel.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    public static void main(String[] args) {

    }
    public Integer[] getSubArray(int checkNumber, Integer... array){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        int lastIndex = arrayList.lastIndexOf(checkNumber);
        if (lastIndex == -1) throw new RuntimeException("В исходном массиве отсутствует хотябы одна цифра " + checkNumber);
        List<Integer> subList = arrayList.subList(lastIndex + 1, arrayList.size());
        return subList.toArray(new Integer[0]);
    }
}
