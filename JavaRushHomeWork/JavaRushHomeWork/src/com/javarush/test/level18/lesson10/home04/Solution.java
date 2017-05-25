package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(); // D:/file1.txt
        String file2 = reader.readLine();
        reader.close();

        InputStream input1 = new FileInputStream(file1);
        InputStream input2 = new FileInputStream(file2);


        byte[] copyFile = new byte[input1.available()];
        byte[] buffer = new byte[input2.available()];
        //int countCopy = 0;
       // int countBuff = 0;
        ArrayList<Byte> result = new ArrayList<Byte>();


            while (input2.available() > 0)
            {
                result.add((byte) input2.read());
            }
        while (input1.available() > 0)
        {
            result.add((byte) input1.read());
        }
        input1.close();
        input2.close();
        OutputStream output = new FileOutputStream(file1);
            byte[] res = new byte[result.size()];
            for (int x = 0; x < res.length; x++){res[x] = result.get(x); }

            output.write(res);
         //int countCopy = input1.read(copyFile);

        output.close();





    }
}
