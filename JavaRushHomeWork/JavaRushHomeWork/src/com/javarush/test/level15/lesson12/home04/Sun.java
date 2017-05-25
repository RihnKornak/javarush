package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Maxxx on 03.11.2016.
 */
public class Sun implements Planet
{
    private static Sun instance;
    public static synchronized Sun getInstance(){
        if (instance == null) instance = new Sun();
        return instance;
    }
    private Sun(){

    }

}
