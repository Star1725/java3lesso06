package com.geekbrains.java.ProfessionalLevel.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
//        System.out.println(isOneAndFour(1, 2,  1,2,3,4,5,2,3,4,1,3,5,1,2,1,1,1,1,2,1,2,1,21,3,5,0));
//        System.out.println(isOneAndFour(1, 2,  1,2,1,1,2,1,1,1,1,2,1,2,1,1,2,1,2,1,2,2,2,1,1,1,2,2,1));
    }
    public Integer[] getSubArray(int checkNumber, Integer... array){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        int lastIndex = arrayList.lastIndexOf(checkNumber);
        if (lastIndex == -1) throw new RuntimeException("В исходном массиве отсутствует хотябы одна цифра " + checkNumber);
        List<Integer> subList = arrayList.subList(lastIndex + 1, arrayList.size());
        return subList.toArray(new Integer[0]);
    }

    public boolean isOneAndFour(int num1, int num2, Integer... array){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        //long startTime = System.nanoTime();
        //1-й вариант
        if (arrayList.contains(num1)){
            if (arrayList.contains(num2)){
                arrayList.removeAll(Arrays.asList(num1, num2));
                int i = arrayList.size();
                //long stopTime = System.nanoTime();
                //System.out.println(stopTime - startTime);
                return i == 0;
            }
        }
        //long stopTime = System.nanoTime();
        //System.out.println(stopTime - startTime);
        return false;

        //2-й вариант
//        int num1s = 0;
//        int num2s = 0;
//        for (Integer integer : arrayList) {
//            if (integer == num1){
//                num1s++;
//                continue;
//            }
//            if (integer == num2){
//                num2s++;
//            }
//        }
//        long stopTime = System.nanoTime();
//        System.out.println(stopTime - startTime);
//        return (num1s + num2s) == array.length && (num1s != 0 || num2s != 0);
    }
}
