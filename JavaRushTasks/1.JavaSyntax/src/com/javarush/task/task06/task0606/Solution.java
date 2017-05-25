package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numberS = bufferedReader.readLine();
        int[] array = new int[numberS.length()];
        char[] massive = numberS.toCharArray();
        for (int i = 0; i < array.length; i++){
            array[i] =  Integer.valueOf(massive[i]);
            int x = array[i];
            if (x%2 == 0) even++;
            else odd++;

        }

        System.out.println("Even: " + even + " Odd: " + odd);
        bufferedReader.close();
        //напишите тут ваш код
    }
}
