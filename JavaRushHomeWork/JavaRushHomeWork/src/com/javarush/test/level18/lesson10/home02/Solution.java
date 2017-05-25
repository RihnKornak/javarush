package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/
/*
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        if (args.length > 0){
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));

            int symbolCounter, spaceCounter;
            symbolCounter = spaceCounter = 0;
        while (reader.ready())
        {
            String line = reader.readLine();
            //String counter = line;
            char[] spaces = line.toCharArray();
            symbolCounter += spaces.length;
            for (int i = 0; i < spaces.length; i++){
                if (spaces[i] == 32){
                    spaceCounter++;
                }
            }
        }
            double result = (spaceCounter*1.0/symbolCounter)*100;
            double finalResult = new BigDecimal(result).setScale(2, RoundingMode.UP).doubleValue();
            System.out.println(finalResult);
            reader.close();
    }
    }
}
*/

import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0)
        {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            int spaceCounter = 0;
            int allSymbols = 0;
            byte[] buff = new byte[fileInputStream.available()];
            if (fileInputStream.available() > 0){
                allSymbols = fileInputStream.read(buff); //размер массива есть число всех элементов
            }
            byte[] space = " ".getBytes();
            for (byte x : buff){
                if (space[0] == x){spaceCounter++;}
            }
            double result = spaceCounter*100.0/allSymbols;
            fileInputStream.close();
            System.out.println(String.format("%.2f", result));
        }
    }
}