package com.javarush.test.level03.lesson12.home01;

/* Жить хорошо, а хорошо жить еще лучше
Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»
*/

public class Solution
{
    public static void main(String[] args)
    {
       int x= 0, y=555 ;

       if ( x < 0)
       { y = x + 1;}
            else { if ( x>=0 && x<1 ) y = x + 2;  else { if ( x >= 1)  y= x + 10;}}

        System.out.println(y);

    }
}
