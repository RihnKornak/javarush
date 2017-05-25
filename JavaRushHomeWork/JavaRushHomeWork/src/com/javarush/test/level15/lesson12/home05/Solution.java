package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private String name;
    private int count;
    private double a;
    private char b;

    public Solution(){};
    public Solution(String name){this.name = name;;}
    public Solution(int count){this.count = count;}


     Solution(String name, int count){}
     Solution(int count, double a){}
    Solution(double a, int count){}

    protected Solution(char b, String name, int count){}
    protected Solution(int count, char b){}
    protected Solution(int count, double a, String name){}

    private Solution(String name, char b){}
    private Solution(int count, double a, String name, char b){}
    private Solution(char b, int count, double a){}



}

