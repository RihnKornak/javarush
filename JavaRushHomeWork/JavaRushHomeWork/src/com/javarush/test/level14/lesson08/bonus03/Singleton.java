package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Maxxx on 03.11.2016.
 */
public class Singleton
{
    private static Singleton instance;
    public static Singleton getInstance(){
        synchronized (Singleton.class){
           if (instance == null)instance = new Singleton();
        }
        return instance;

    }
    private Singleton(){

    }

}
