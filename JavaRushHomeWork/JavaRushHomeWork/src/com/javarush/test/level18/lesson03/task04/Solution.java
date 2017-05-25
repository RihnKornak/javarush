package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        int min = 255, count = 0;
        String res = "";
        byte[] buff = new byte[64* 1024];
        ArrayList<Byte> massiv = new ArrayList<Byte>();
        ArrayList<Integer> chisloVstrech = new ArrayList<Integer>();
        while (inputStream.available() > 0){ // заполняем список байтами из файла
            count = inputStream.read(buff);
            for (int i = 0; i < count; i++){
                massiv.add(buff[i]);
            }
                   } // end of while-loop
        count = 1;
        for (int i = 0; i < massiv.size(); i++){
            for (int j =0; j < massiv.size(); j++){
                if (massiv.get(i).equals(massiv.get(j))){
                    if (i == j){ continue;} // ищем одинаковые байты и помещаем их количество в список
                    count++;
                }

            } // конец внутреннего цикла
            chisloVstrech.add(count);
            count = 1;
        }// конец внешнего цикла
       // for (int i = 0; i < chisloVstrech.size(); i++)
       //{
            for (int j = 0; j < chisloVstrech.size(); j++){
            if (chisloVstrech.get(j) <= min) { // ищем минимальное количество упоминаний байта, сам байт пока неизвестен
                min = chisloVstrech.get(j);
            }
        } // конец внутреннего цикла

        for (int i = 0; i < chisloVstrech.size(); i++){
            if (chisloVstrech.get(i).equals(min)){
                res += massiv.get(i) + " ";
            }
        }

        //} // конец внешнего цикла
        System.out.print(res);
       // for (Byte x : massiv){System.out.print(x + " ;");}
       // for (Integer x : chisloVstrech){System.out.print(x + " :");}

    }
} //  D:/010.txt
