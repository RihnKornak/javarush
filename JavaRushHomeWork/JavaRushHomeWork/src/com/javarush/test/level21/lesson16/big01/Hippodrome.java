package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Maxxx on 14.12.2016.
 */
public class Hippodrome
{
    private static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses(){
        return this.horses;
    }

    public void move(){
        for (Horse horse : getHorses()){
            horse.move();
        }
    }

    public void print(){
    for (Horse horse : getHorses()){
    horse.print();
}
    System.out.println();
    System.out.println();

}

    public void run(){
        for (int time = 1; time <= 100; time++){
            this.move();
           this.print();
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public Horse getWinner(){
        double winDistanse = 0;
        Horse winner = null;
        for (int i = 0; i < getHorses().size(); i++){
            if (getHorses().get(i).getDistance()> winDistanse){
                winDistanse = getHorses().get(i).getDistance();
                winner = getHorses().get(i);
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.format("Winner is %s!", getWinner().getName());
    }


    public static void main(String[] args)
    {
        Hippodrome.game = new Hippodrome();
        Horse bolivar = new Horse("Bolivar", 3, 0);
        Horse savraska = new Horse("Savraska", 3, 0);
        Horse ishakIA = new Horse("Ishak IA", 3, 0);
        game.horses.add(bolivar);
        game.horses.add(savraska);
        game.horses.add(ishakIA);
        game.run();
        game.printWinner();
    }

}
