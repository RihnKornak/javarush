package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Maxxx on 03.11.2016.
 */
public class Earth implements Planet
{
    private static Earth instance;
    public static synchronized Earth getInstance(){
        if (instance == null) instance = new Earth();
        return instance;
    }
    private Earth(){

    }
}
