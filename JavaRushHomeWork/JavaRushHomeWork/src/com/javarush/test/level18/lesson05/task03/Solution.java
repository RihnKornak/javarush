package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        InputStream inputStream = new FileInputStream(file1);
        OutputStream outputStream2 = new FileOutputStream(file2);
        OutputStream outputStream3 = new FileOutputStream(file3);
        reader.close();
        if (inputStream.available() > 0){
            int size1 = inputStream.available()/2, size2 = inputStream.available() - size1;
            byte[] buff1 = new byte[size2];
            byte[] buff2 = new byte[size1];
           int count = inputStream.read(buff1);
            outputStream2.write(buff1, 0, count);
            count = inputStream.read(buff2);
            outputStream3.write(buff2, 0, count);

        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();

    }
} // D:/file1.txt
