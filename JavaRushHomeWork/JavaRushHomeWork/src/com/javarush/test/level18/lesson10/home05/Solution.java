package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 =  reader.readLine(); //"D:/file1.txt";
        String file2 =  reader.readLine(); //"D:/file2.txt";
        reader.close();
        InputStream inputStream = new FileInputStream(file1);
        OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(file2));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        int[] array;
        while (reader1.ready())
        {
            line = reader1.readLine();
            String[] massiv = line.split(" ");
            array = new int[massiv.length];
            line = "";
            for (int i = 0; i < massiv.length; i++)
            {
                array[i] = (int) Math.round(Double.parseDouble(massiv[i]));
                line += array[i] + " ";

            }

        }
        line = line.trim();
            outputStream.write(line);
            outputStream.flush();
            inputStream.close();
            reader1.close();
            outputStream.close();


    }
}
