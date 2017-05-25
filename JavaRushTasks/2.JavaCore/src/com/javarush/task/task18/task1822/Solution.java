package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // D:/JAVA/test.txt
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        String line = "";
        String data;
        while (fileReader.ready()){
            line = fileReader.readLine();
           // System.out.println(line);
            String[] splitter1 = line.split(" ");
            int id = Integer.parseInt(splitter1[0]);
            if (Integer.parseInt(args[0]) == id) {
                System.out.println(line);
                break;
            }
        }
        fileReader.close();
        reader.close();
    }
}
