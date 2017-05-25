package com.javarush.test.level14.lesson08.bonus01;

import javax.transaction.xa.XAException;
import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.prefs.BackingStoreException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
     public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int i = 4 / 0;

        } catch (ArithmeticException e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] a = new int[1];
            a[1]=4;
        }catch (IndexOutOfBoundsException e){
            exceptions.add(e);
        }
        try
        {
           throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){exceptions.add(e);}
        try
        {
            throw new Exception();
        }catch (Exception e){exceptions.add(e);}

        try
        {
            throw new SecurityException();
        }catch (SecurityException e){exceptions.add(e);}
        try
        {
            throw new ArrayStoreException();
        }catch (ArrayStoreException e){exceptions.add(e);}
        try
        {
            throw new XAException();
        }
        catch (XAException e){exceptions.add(e);}
        try
        {
            throw new InputMismatchException();
        }catch (InputMismatchException e){exceptions.add(e);}
        try
        {
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException e){exceptions.add(e);}
    }
}
