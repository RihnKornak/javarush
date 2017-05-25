package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        byte[] buff = new byte[64 * 1024];
        ArrayList<Integer> massiv = new ArrayList<Integer>();
        ArrayList<Integer> povtorCount = new ArrayList<Integer>();
        InputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0){
            int count = inputStream.read();
            buff[count]++;// end of "for" - loop
        } // end of "while" - loop
       int max = 0;
        String res = "";
            for (int vnutr = 0; vnutr < buff.length; vnutr++){
                if (buff[vnutr] > max){
                    max = buff[vnutr];
                }

            } // end of vnutrenniy loop
        for (int vnutr = 0; vnutr < buff.length; vnutr++)
        {
            if (buff[vnutr] == max){
            res += max + " ";}
        }
        System.out.println(res);
        for (byte x: buff){System.out.println(x);}

        reader.close();
        inputStream.close();
    }

}
// D:/010.txt