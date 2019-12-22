package com.higbie.models;

import com.higbie.game_play.EndGame;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Player {

    public Player(String name, int power, int life, int maxLife) {
        this.name = name;
        this.battlePower = power;
        this.life = life;
        this.maxLife = maxLife;
    }

    private String name;
    private int battlePower;
    private int life;
    private int maxLife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattlePower() {
        return battlePower;
    }

    public void setBattlePower(int battlePower){
        this.battlePower = battlePower;
    }

    public void setBattlePower(int battlePower, int increaseValue ) {
        this.battlePower = battlePower + increaseValue;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public static void createPlayer(){
        System.out.println("What shall you be called?");
        System.out.println("Enter your name below: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        Player player = new Player(playerName, 10, 100, 100);
        player.declarePlayer();
    }

    public void declarePlayer(){
        System.out.println("You realize who you are. You are the great " + this.name + " the mighty!");
        System.out.println("You yell out your name in a roar and see the shock on your enemy's face.");
        System.out.println("In a renewed vigor your power and strength come flushing your your body!");
        System.out.println("Your battlePower is " + this.battlePower + ".");
        System.out.println("Your life is " + this.life + " with a maximum life of " + this.maxLife );
    }

    public void win(int increaseValue){
        setBattlePower(getBattlePower(), increaseValue);
        System.out.println("Your battle power has increased by " + increaseValue + ".");
        System.out.println("Your total battle power is "+ getBattlePower());
    }

    public void firstBattle(){
        boolean willFight;
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("You must kill this Saxon pig! You can either pick up your spear or run.");
        System.out.println("Enter \"1\" to fight or \"2\" to run.");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("You pick up your spear and thrust it into the throat of that Saxon creature,");
                System.out.println("and you hear the sound of death in crackle in his throat.");
                win(5);
                break;
            case 2:
                System.out.println("You turn and run! You feel a spear suddenly pierce you back.");
                System.out.println("You drop to your knees in a pool of your own blood. Coward!");
                System.out.println("You die. May your soul wonder the earth for eternity.");
                EndGame.endGameInDisgrace();
                break;
            default:
                System.out.println("You must select a value oe either  \"1\" to fight or \"2\" to run.");
        }
    }
}
