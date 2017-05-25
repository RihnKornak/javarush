package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {

    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] array = new Solution[2];
        Solution a = new Solution();
        Solution b = new Solution();
        a.innerClasses = new InnerClass[]{new Solution().new InnerClass(),new Solution().new InnerClass()};
        b.innerClasses = new InnerClass[]{new Solution().new InnerClass(), new Solution().new InnerClass()};
        array[0] = a;
        array[1] = b;
        return array ;
    }
}
