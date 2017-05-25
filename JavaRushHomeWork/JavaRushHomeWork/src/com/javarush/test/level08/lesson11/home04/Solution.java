package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimum = 2147483647 ;
        for (int i = 0; i < array.size(); i++){
            if (minimum > array.get(i)){
                minimum = array.get(i);
            }
        }
        // Найти минимум
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> array = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N ; i++){
         array.add(Integer.parseInt(reader.readLine()));
        }

        //Тут создать и заполнить список
        return array;
    }
}
