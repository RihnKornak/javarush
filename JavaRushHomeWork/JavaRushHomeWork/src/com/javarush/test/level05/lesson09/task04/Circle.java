package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    double centerX;
    double centerY;
    int radius;
    double width;
    String color;
    public Circle(double centerX, double centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerX;
        this.radius = radius;

    }
    public Circle(double centerX, double centerY, int radius, double width)
    {
        this.centerX = centerX;
        this.centerY = centerX;
        this.radius = radius;
        this.width = width;

    }
    public Circle(double centerX, double centerY, int radius, double width, String color)
    {
        this.centerX = centerX;
        this.centerY = centerX;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args)
    {

    }
    //напишите тут ваш код

}
