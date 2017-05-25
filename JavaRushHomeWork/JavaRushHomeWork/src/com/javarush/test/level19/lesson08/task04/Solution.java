package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        PrintStream console = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
       // String line = outputStream.toString();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(outputStream.toByteArray())));
        String line = reader.readLine().trim();
        String[] mass = line.split(" ");
        int a = Integer.parseInt(mass[0].trim());
        int b = Integer.parseInt(mass[2].trim());
        int c = 0;
        if (mass[1].equals("+")){
            c = a + b;
        }else if (mass[1].equals("-")){
            c = a - b;
        }else if (mass[1].equals("*")){
            c = a * b;
        }

        console.println(a + " " + mass[1] + " " + b + " = " + c);

        outputStream.close();
        stream.close();
        reader.close();
        System.setOut(console);




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

