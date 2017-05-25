package com.javarush.test.level14.lesson08.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        String vrem;
        List<String> keys =new ArrayList<String>();
        for (int i = 0; i < 5; i++){

            vrem =reader.readLine();

            if (vrem.equals("user")){keys.add(vrem);}
            if(vrem.equals("looser")){keys.add(vrem);}
            if(vrem.equals("coder")){keys.add(vrem);}
            if(vrem.equals("proger")){keys.add(vrem);}
            {


            }
        }
        for (int i = 0; i < keys.size(); i++)
        //тут цикл по чтению ключей, пункт 1
        {
            if (keys.get(i).equals("user")){
                person = new Person.User();
            }else if (keys.get(i).equals("looser")){
                person = new Person.Looser();
            }else if (keys.get(i).equals("coder")){
                person = new Person.Coder();
            }else if (keys.get(i).equals("proger")){
                person = new Person.Proger();
            }

            //создаем объект, пункт 2

        doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person)
    {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Looser){
            ((Person.Looser) person).doNothing();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
        // пункт 3
    }
}
