package com.javarush.test.level18.lesson03.task01;

import java.io.*;
import java.util.ArrayList;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        byte[] buffer = new byte[64 * 1024];
        InputStream inputStream = new FileInputStream(file);
        ArrayList<Byte> massiv = new ArrayList<Byte>();
        // OutputStream outputStream = new OutputStreamWriter();

        while (inputStream.available() > 0){
            int count = inputStream.read(buffer);
            for (int i = 0; i < count; i++){
                massiv.add(buffer[i]);

            }// набрал в список буфер





        } // конец цикла

        for (int vnesh = 0; vnesh < massiv.size() - 1; vnesh++){
            for (int vnutr = 0; vnutr < massiv.size() - vnesh - 1; vnutr++){
                if (massiv.get(vnutr) < massiv.get(vnutr + 1))
                {
                    int vrem = massiv.get(vnutr);
                    massiv.set(vnutr, massiv.get(vnutr + 1));
                    massiv.set((vnutr + 1), (byte) vrem);
                }

            }

        }
        //for (Byte x : massiv){System.out.print(x + " ");}
       // System.out.println("Максимальный байт тут = " + massiv.get(0) );
        System.out.println(massiv.get(0) );

    }
}
