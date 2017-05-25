package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        sol.print(22);
        sol.print(1);
    }

   public void print(int a){
    System.out.println(a);
   }

    public void print(Integer x){
        System.out.println(x);
    }
    //Напишите тут ваши методы
}
