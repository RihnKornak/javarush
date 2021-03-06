package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;
    double strike ;

    public Cat()
    {

    }

    public boolean fight(Cat anotherCat)
    {
         this.strike = weight/age + strength;
         anotherCat.strike = anotherCat.weight/anotherCat.age + anotherCat.strength;
        if (strike > anotherCat.strike){
            return true;
        }else {
            return false;
        }




        //напишите тут ваш код

    }
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "Петушара";
        cat1.age = 1;
        cat1.weight = 4;
        cat1.strength = 7;
        cat2.name = "Козлина";
        cat2.age = 9;
        cat2.weight = 8;
        cat2.strength = 9;
        if (cat1.fight(cat2)){
            System.out.println("Победил " + cat1.name);
        }else {
            System.out.println("Победил " + cat2.name);
        }


    }
}
