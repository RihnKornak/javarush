package com.javarush.test.level21.lesson08.task03;

/* Запретить клонирование
Разрешите клонировать класс А
Запретите клонировать класс B
Разрешите клонировать класс C
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        A a = new A(1,2);
        A cloneA = (A)a.clone();
        B b = new B(3, 4, "ZZZ");
        B cloneB = (B) b.clone();
        C c = new C(5, 6, "aaa");
    }
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }
        public Object clone() throws CloneNotSupportedException{
            return new A(getI(), getJ());
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }
        public Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();
        }

        public String getName() {
            return name;
        }
    }

    public static class C extends B implements Cloneable {
        public Object clone() throws CloneNotSupportedException{
            return new C(getI(), getJ(), getName());
        }
        public C(int i, int j, String name) {
            super(i, j, name);
        }
    }

}
