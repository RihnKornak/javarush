package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader textReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = "";

        while (textReader.ready())
        {
            line += new String(textReader.readLine().getBytes("UTF-8"), "UTF-8") + " ";
        }

        //line.trim();
        String[] words = line.split(" ");

        textReader.close();

        int count = 0;
        String reversiveWord;
        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++){
                int beginIndex = line.indexOf(words[i]);
                reversiveWord = new StringBuilder(words[j]).reverse().toString();
                int lastIndex = line.indexOf(reversiveWord);
                if (beginIndex >= 0 & lastIndex >= 0 & !words[i].equals("") & words[i].equals(reversiveWord))
                {
                    Pair pair = new Pair();
                    pair.first = words[i];
                    pair.second = words[j];
                    result.add(pair);
                    words[i] = "";
                    words[j] = "";
                }
        }
    }
        //
        for (Pair x : result)System.out.println(x.toString());


    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}

//   D:/file1.txt