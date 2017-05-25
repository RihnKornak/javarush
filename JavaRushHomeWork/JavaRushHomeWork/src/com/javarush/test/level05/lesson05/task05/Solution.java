package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Cat catPetu = new Cat("Петушара", 1, 4, 7);
        Cat catKoz = new Cat("Козлина", 8, 12, 9);
        Cat catZaba = new Cat("Жабарыба", 1, 8, 8);
        if (catPetu.fight(catKoz)){
            System.out.println(catPetu.name + " wins with CATALITY !!!");
        }else {
            System.out.println(catPetu.name + " позорно проиграл и возвращается в свою помойку. Победитель - " + catKoz.name);
        }
        if (catPetu.fight(catZaba)){
            System.out.println(catPetu.name + " подло кастрировал соперника, но победителей не судят!");
        }else {
            System.out.println(catPetu.name + ", собрав выбитые зубы сломанными лапами, прошепелявил: \" Победил " + catZaba.name + "\"");
        }
        if (catKoz.fight(catZaba)){
            System.out.println(catKoz.name + " на правах победителя пометил подранную тушку Жабарыбы");
        }else {
            System.out.println(catZaba.name + ", вспомнив \"Очумелые ручки\", натянул глаз на хвост Козлине");
        }
        //напишите тут ваш код
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
