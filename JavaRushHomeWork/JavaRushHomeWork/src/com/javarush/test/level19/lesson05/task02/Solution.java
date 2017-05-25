package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern; */

/* public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        Reader inputStream = new FileReader(file);
        reader.close();
        Scanner scanner = new Scanner(inputStream);

        int count = 0;
        Pattern p = Pattern.compile("(world)");
        Matcher matcher;
        String res = "";
        while (scanner.hasNextLine()){
            res += scanner.nextLine();
        } // end of while-loop
       // res = res.replaceAll("[.,!?;:-]", " ");
        res = res.replaceAll("\\p{Punct}", " ");
        String[] s = res.split(" ");
            for (int i = 0; i < s.length; i++){
                matcher = p.matcher(s[i]);
                 if (matcher.matches()){
                    count += 1;

                }
                //System.out.println("s[i]= " + i  + " : " +  s[i] + "| count = " + count);
            }


       // } // end of while-loop
    System.out.println(count);

        inputStream.close();
        scanner.close();
    }
} // D:/file1.txt */

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        int worldCount =0;
        String resultString;
        while (fileReader.ready())
        {
            resultString = fileReader.readLine();
            String[] result = resultString.split("[., !?;:-]");
            for (int i = 0; i < result.length; i++)
            {
                if("world".equals(result[i])) worldCount++;
            }
        }
        System.out.println(worldCount);
        fileReader.close();
        reader.close();
    }
}
