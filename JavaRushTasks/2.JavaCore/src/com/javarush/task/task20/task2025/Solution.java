package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        List list = ArmstrongNumbersMultiSetLongOpt.generate((int) (Math.log10(N) + 1));
        return list.stream().mapToLong(i -> i).toArray();
    }



    public static void main(String[] args) {
        getNumbers(9000000);

    }
}
