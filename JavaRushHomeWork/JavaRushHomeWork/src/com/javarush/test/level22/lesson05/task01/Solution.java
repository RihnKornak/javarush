package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException
    {
        String s = "JavaRush - лучший сервис обучения Java.";
    System.out.println(getPartOfString(s));
        System.out.println();
    }
    public static String getPartOfString(String string) throws TooShortStringException
    {
        String line = "";
        if (string != null)
        {
            String[] array = string.split(" ");


            if (array.length >= 5){
                for (int i = 1; i < 5; i++){
                    line += array[i] + " ";
                }
            }else throw new TooShortStringException();
        }else throw new TooShortStringException();
        return line.substring(0, line.length() - 1);
    }

    public static class TooShortStringException extends Exception{


        public TooShortStringException()
        {
            System.out.println("Наебалово");
        }
    }
}
