package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat(100, "Tom",12 );
        Dog dog = new Dog(100, 6, "Dog");
        Woman woman = new Woman(100, 12, "Master");

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        int age;
        int volume;
        String name;;
        public Dog(int  age, int    volume, String name){
            this.age = age;
            this.volume =volume;
            this.name = name;
        }

    }
    public static class Cat
    {
        int age;
        String name;
        int speed;
        public Cat(int age, String name, int speed){
            this.age =age;
            this.name = name;
            this.speed =speed;
        }

    }
    public static class Woman
    {
        int evil;
        int speed;
        String name;
        public Woman(int evil, int speed, String name){
            this.evil =evil;
            this.speed =speed;
            this.name =name;
        }

    }
    //добавьте тут ваши классы

}
