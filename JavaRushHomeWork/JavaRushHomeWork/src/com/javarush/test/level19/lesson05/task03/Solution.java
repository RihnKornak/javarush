package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
     String line = "";
        String res = "";
        int chislo = 0;
        Pattern p = Pattern.compile("\\b\\d+\\b");
        Matcher m;
        while (fileReader.ready()){
            line = fileReader.readLine();
            line = line.replace("\\p{Punct}", " ");
            String[] s = line.split("\\s");

            for (int i = 0; i < s.length; i++){
                m = p.matcher(s[i]);
                if (m.matches()){
                    chislo = Integer.parseInt(s[i].trim());
                    res += chislo + " ";
                }
            } // end of for-loop
        } // end of while-loop

        fileWriter.write(res.trim());
       // System.out.println(res.trim());
        fileReader.close();
        fileWriter.close();
    }
}   // D:/file1.txt
