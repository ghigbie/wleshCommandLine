package com.higbie.models;

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

    public void setBattlePower(int battlePower) {
        this.battlePower = battlePower;
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

    private void createPlayer(){

    }

    public void declarePlayer(){
        System.out.println("You realize who you are. You are the great" + this.name + "!");
        System.out.println("You yell out your name in a roar and see the shock on your enemy's face.");
        System.out.println("In a renewed vigor your power and strength come flushing your your body!");
        System.out.println("Your battlePower is " + this.battlePower + ".");
        System.out.println("Your life is " + this.life + " of a maximum life of " + this.maxLife );
    }

    public void firstBattle(){
        boolean willFight;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You must kill this Saxon pig! You can either pick up your spear or run.");
        System.out.println("Enter \"1\" to fight or \"2\" to run.");


    }
}
