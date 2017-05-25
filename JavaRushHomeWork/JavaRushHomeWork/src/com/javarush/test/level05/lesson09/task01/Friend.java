package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    int age;
    String sex;
    public Friend(String name){
        this.name ="Овцееб";
    }
    public Friend(String name, int age){
        this.name = "Овцееб";
        this.age = 96;
    }
    public Friend(String name, int age, String sex){
        this.name = "Овцееб";
        this.age = 96;
        this.sex = "male";
    }


    public static void main(String[] args)
    {

    }
    //напишите тут ваш код

}