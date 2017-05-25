package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count2 = 0;
        int count1 = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0){
                count2 += array[i];
            }else count1 += array[i];
        }
        if (count2 > count1) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (count1 > count2){System.out.println("В домах с нечетными номерами проживает больше жителей.");}
        //System.out.println("Chet - " + count2 + ", nechet - " + count1);
        reader.close();
        //напишите тут ваш код
    }
}
