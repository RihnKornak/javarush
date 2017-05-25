package com.javarush.test.level18.lesson03.task02;

import java.io.*;
import java.util.ArrayList;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        InputStream inputStream = new FileInputStream(file);
        ArrayList<Byte> massiv = new ArrayList<Byte>();

        byte[] buffer = new byte[64 * 1024];
        while (inputStream.available() > 0){
            int count = inputStream.read(buffer);
            for (int i = 0; i < count; i++){
                massiv.add(buffer[i]);
            }


        }
        for (int i = 0; i < massiv.size() - 1; i++){
            for (int j = 0; j< massiv.size() - i -1; j++ )
            {

                if (massiv.get(j) > massiv.get(j+1)){
                    Byte vrem = massiv.get(j);
                    massiv.set((j), massiv.get(j+1));
                    massiv.set((j+1), vrem);
                }
            }
        }
      //  for (Byte x : massiv){System.out.println(x);}
        System.out.println(massiv.get(0));


    }

}
