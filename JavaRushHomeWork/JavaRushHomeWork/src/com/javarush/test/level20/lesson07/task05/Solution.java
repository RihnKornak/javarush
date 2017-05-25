package com.javarush.test.level20.lesson07.task05;

import java.io.*;

/* Переопределение сериализации
Сделайте так, чтобы после десериализации нить runner продолжила работать.
Ключевые слова объекта runner менять нельзя.
Hint/Подсказка:
Конструктор не вызывается при сериализации, только инициализируются все поля.
*/
public class Solution implements Serializable, Runnable {
    transient private Thread runner;
    private int speed;

  /*  public static void main(String[] args) throws Exception
    {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("D:/file.tmp"));
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:/file.tmp"));
        Solution sol = new Solution(10);
        sol.writeObject(output);
       // Solution loaded = new Solution(1);
       // loaded.readObject(input);

        sol.readObject(input);

        output.close();
        input.close();
    } */

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        int i = 0;
        while (i < 60)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            i++;
            System.out.println(i);
        }
        // do something here, does not matter
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
       // out.writeObject(runner);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        runner = new Thread(this);
        runner.start();
        //runner.start();
    }
}
