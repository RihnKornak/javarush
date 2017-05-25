package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (reader1.ready())
        {
         StringBuilder line = new StringBuilder(reader1.readLine());
            System.out.println(line.reverse());
        }

        reader1.close();
    }
}
// D:/JAVA/1.txt