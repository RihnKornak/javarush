package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Solution {
    public static TestString testString = new TestString();


    public static void main(String[] args) throws IOException {
        PrintStream old = System.out;
        String reklama = "JavaRush - курсы Java онлайн";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] mas;
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);
        int count = 0;
        testString.printSomething();
        System.setOut(old);

        mas = outputStream.toString().getBytes();
        if (mas.length != 0)
        {
            for (int i = 0; i < mas.length; i++ )
            {
                //System.out.println("MAS[" + i + "]= " + (int)mas[i]);
                int num = mas[i];
                char ch = (char) num;
                System.out.print(ch);
                if (num == 10){
                    count++;
                    if (count > 0 && count%2 == 0)
                    {

                        System.out.println(reklama);

                    }
                }
              //  System.out.println("!!! " + num + " !!!");
                //System.out.println("!!!" + count + "!!!");

            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
