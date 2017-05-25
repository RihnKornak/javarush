package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean uslov = true;
        int sum = 0;
        int count = 0;
        while (uslov){
            int number = Integer.parseInt(br.readLine());
            if (number != -1) {
                sum += number;
                count++;
            }else uslov = false;
        }
        System.out.println(1.0*sum/count);
        br.close();
        //напишите тут ваш код
    }
}

