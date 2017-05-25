package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A111A", 600);
        map.put("A222A", 200);
        map.put("A333A", 600);
        map.put("A444A", 100);
        map.put("A555A", 600);
        map.put("A666A", 900);
        map.put("A777A", 1000);
        map.put("A888A", 600);
        map.put("A999A", 600);
        map.put("A1000A", 600);
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator <Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String surname = pair.getKey();
            int bucks = pair.getValue();
            if (bucks < 500) iterator.remove();
        }
        //напишите тут ваш код
    }
   /* public static void PrintMap(HashMap<String, Integer> map) {
    for (Map.Entry<String , Integer> x : map.entrySet()){
        String surname = x.getKey();
        int bucks = x.getValue();
        System.out.println("Фамилия клиента: " + surname + " , зарплата этого лоха: " + bucks);
    }
    } */
    public static void main(String[] args) {
    HashMap<String, Integer> mapa = createMap();
    removeItemFromMap(mapa);
    //PrintMap(mapa);

    }
}