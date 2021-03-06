package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine(); //reader.readLine(); // "D:/file1.txt";
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = "";
        while ((line = bufferedReader.readLine()) != null ){
            int count = 0;
            String modifLine = line.replaceAll("\\p{Punct}", " ");
            String[] result = modifLine.split(" ");
            for (String a : result){System.out.println(a);}
            for (int i = 0; i < result.length; i++){
                for ( String word : words){
                    if (result[i].equals(word)){
                        count +=1;
                    }
                }

            }
            if (count == 2)System.out.println(line);
        }

    bufferedReader.close();
    }
}
