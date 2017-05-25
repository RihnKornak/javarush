package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private int age;
        private double weight;
        private int friends;
        private double norm = 1.0*age/weight;
        private double border = (age + weight)/(1.0*2);



        Human(String name){
            this.name = name;
        }
        Human(int age){
            this.age = age;
        }
        Human(double weight){
            this.weight = weight;
        }
        Human(int friends, String name){
            this.friends = friends;
            this.name = name;
        }
        //5-ый
        Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        Human(String name, double weight){
            this.name = name;
            this.weight = weight;
        }
        Human(String name, int friends, double weight){
            this.name = name;
            this.friends = friends;
            this.weight =  weight;
        }
        Human(int age, String name, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
        Human(String name, int age, double weight, int friends){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.friends = friends;
        }
        Human(int friends,  double weight,  int age,  String name){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.friends = friends;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
