package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] list = new int[10];
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0, j = list.length-1; i < list.length/2; i++, j--){
            int vrem = list[j];
            list[j]= list[i];
            list[i] = vrem;

        }
        for (int x : list){
            System.out.println(x);
        }

        //напишите тут ваш код

    }
}
