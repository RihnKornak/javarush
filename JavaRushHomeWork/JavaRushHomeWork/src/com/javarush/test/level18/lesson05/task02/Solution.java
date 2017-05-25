package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        byte[] buff = new byte[64 * 1024];
        ArrayList<Byte> massiv = new ArrayList<Byte>();
        int count;
        while (inputStream.available() > 0){
            count = inputStream.read(buff);
            for (int i = 0; i < count; i++){
                massiv.add(buff[i]);
            }
        } // end of while-loop
        count = 0;
       for ( int i = 0; i < massiv.size(); i++){
           if (massiv.get(i) == 44){
               count++;
           }
       }
        System.out.print(count);
        //for (Byte x : massiv){System.out.println(x);}
        reader.close();
        inputStream.close();
    } // end of main-method
} // D:/010.txt
