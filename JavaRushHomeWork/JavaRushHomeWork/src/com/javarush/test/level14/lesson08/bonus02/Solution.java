package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int border;
        int NOD = 0;
        if (first > second){border = first;}else {border = second;}
                for (int i = 1; i <= border; i++){
                    if ((first%i ==0) & (second%i == 0)){
                        NOD = i;
                    }
                }
        System.out.println(NOD);
    }
}
