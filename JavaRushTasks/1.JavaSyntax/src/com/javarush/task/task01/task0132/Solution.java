package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = "" + number;
        char[] arr = s.toCharArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result += Integer.valueOf(Character.toString(arr[i]));
        }
        return result;
        //напишите тут ваш код
    }
}