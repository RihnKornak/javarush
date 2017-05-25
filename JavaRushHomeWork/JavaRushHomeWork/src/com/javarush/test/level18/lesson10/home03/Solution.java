package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();   // D:/file1.txt
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream fis2 = new FileInputStream(file2);
        FileInputStream fis3 = new FileInputStream(file3);
        FileOutputStream fos = new FileOutputStream(file1);

        while (fis2.available() > 0){
            byte[] buffer = new byte[fis2.available()];
            int count = fis2.read(buffer);
            fos.write(buffer, 00, count);
        }
        fos.flush();
        fis2.close();

        while (fis3.available() > 0){
            byte[] buffer = new byte[fis3.available()];
            int count = fis3.read(buffer);
            fos.write(buffer, 00, count);
        }
        fos.flush();
        fis3.close();
        fos.close();
    }
}
