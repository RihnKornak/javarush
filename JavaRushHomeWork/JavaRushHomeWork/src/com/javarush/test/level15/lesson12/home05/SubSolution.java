package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Maxxx on 06.10.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
        super();
    }

    public SubSolution(String name)
    {
        super(name);
    }

    public SubSolution(int count)
    {
        super(count);
    }

    SubSolution(String name, int count)
    {
        super(name, count);
    }

    SubSolution(int count, double a)
    {
        super(count, a);
    }

    SubSolution(double a, int count)
    {
        super(a, count);
    }

    protected SubSolution(char b, String name, int count)
    {
        super(b, name, count);
    }

    protected SubSolution(int count, char b)
    {
        super(count, b);
    }

    protected SubSolution(int count, double a, String name)
    {
        super(count, a, name);
    }
    private SubSolution(String name, char b){}
    private SubSolution(int count, double a, String name, char b){}
    private SubSolution(char b, int count, double a){}
}
