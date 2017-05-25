package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread test = new Thread();
        test.interrupt();


        //Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        @Override
        public void run()
        {start();
            while (!currentThread().isInterrupted()){
                try
                {
                    Thread.sleep(60000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
        }
        }
    }
}
