package com.javarush.test.level22.lesson09.task02;


//import java.util.LinkedHashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
   /* public static void main(String[] args)
    {
        Map<String,String> xxx = new LinkedHashMap<>();
       // xxx.put("name", "Ivanov");
       // xxx.put(null, null);
       // xxx.put("country", "Russia");
       // xxx.put("city", "Zelenograd");
       // xxx.put("age", null);
        for (Map.Entry<String,String> x : xxx.entrySet()){System.out.println(x);}
        System.out.println(getCondition(xxx));

    } */

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        if (params == null){return sb;}
        boolean isFirst = true;
        for (Map.Entry<String,String> x : params.entrySet()){
            if (x.getKey() != null & x.getValue() != null){
                sb.append(" and ");
                sb.append(x.getKey());
                sb.append(" = '");
                sb.append(x.getValue() + "'");
                    if (isFirst){sb.delete(0,5);}
                isFirst = false;
            }

        }
        return sb;
    }
}
