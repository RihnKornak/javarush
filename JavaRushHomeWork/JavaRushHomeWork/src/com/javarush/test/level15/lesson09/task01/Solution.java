package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(2.1, "Jop");
        labels.put(2.2, "Jop");
        labels.put(2.3, "Jop");
        labels.put(2.4, "Jop");
        labels.put(2.5, "Jop");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }

}
