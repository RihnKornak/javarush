package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        Human child3 = new Human("Жопся",true,5);
        Human child2 = new Human("Кузя",true,7);
        Human child1 = new Human("Дося",false,8);
        Human mama = new Human("Маман",false,29, child1, child2, child3);
        Human papa = new Human("Папан",true,35, child1, child2, child3);
        Human babka2 = new Human("Баба Нюра",false,70,papa);
        Human babka1 = new Human("Баба Зина",false,90,mama);
        Human ded2 = new Human("Дед Бородед",true,78,papa);
        Human ded1 = new Human("Старый Пень",true,80,mama);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        //напишите тут ваш код
    }

    public static class Human
    {
     private    String name;
     private    boolean sex;
      private   int age;
      private   ArrayList<Human> children = new ArrayList<Human>();
        Human(String name, boolean sex, int age, Human child){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.add(child);



    }
        Human(String name, boolean sex, int age, Human child, Human child1){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);
            this.children.add(child1);



        }
        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;




        }

        Human(String name, boolean sex, int age, Human child, Human child1, Human child2){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);
            this.children.add(child1);
            this.children.add(child2);



        }

        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
