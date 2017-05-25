package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Петр Петрович", true, 68, null,null);
        Human ded2 = new Human("Мухтар Мамедович",true,50,null,null);
        Human babka1 = new Human("Лидия Борисовна", false, 66, null, null);
        Human babka2 = new Human("Ослопохожая Лениновна", false, 99, null, null);
        Human otec = new Human("Игорь Петрович", true, 30, ded1, babka1);
        Human mater = new Human("Чурка Мухтаровна", false, 28, ded2, babka2);
        Human child1 = new Human("Анечка", false, 12, otec, mater);
        Human child2 = new Human("Мухтя", true, 5, otec, mater);
        Human child3 = new Human("Педро", true, 3, otec, mater);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(otec);
        System.out.println(mater);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        //напишите тут ваш код
    }

    public static class Human
    {
         String name;
         boolean sex;
         int age;
         Human father;
         Human mother;
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
