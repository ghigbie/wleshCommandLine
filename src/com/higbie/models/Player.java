package com.higbie.models;

import com.higbie.game_play.EndGame;
import com.higbie.game_play.UtilityMethods;

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

    public static Player createPlayer(){
        System.out.println("What shall you be called?");
        System.out.println("Enter your name below: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        Player player = new Player(playerName, 10, 100, 100);
        player.declarePlayer();
        return player;
    }

    public void declarePlayer(){
        System.out.println("You realize who you are. You are " + this.name + " the mighty!");
        System.out.println("You yell out your name in a roar and see the shock on your enemy's face.");
        System.out.println("In a renewed vigor, your power and strength come flushing through your body!");
        System.out.println("Your battlePower is " + this.battlePower + ".");
        System.out.println("Your life is " + this.life + "." );
    }

    public void tellBackStory(){
        System.out.println("After your quick victory, you realize who you are!");
        System.out.println("You are a Welsh spearman of the Kingdom of Dumnonia who has been taken prisoner after your shield wall was broken in battle...");
        System.out.println("You comrades and fellow spearmen were all killed after the shield wall broke, and you were left unconscious.");
        System.out.println("The world is spinning, your head hurts, and you look up as blood drips from your nose.");
    }

    public void win(int increaseValue){
        setBattlePower(getBattlePower(), increaseValue);
        System.out.println("Your battle power has increased by " + increaseValue + ".");
        System.out.println("Your total battle power is "+ getBattlePower());
    }

    public void battle(String winLine, String failLine){
        int choice;
        Scanner scanner = new Scanner(System.in);
        UtilityMethods.printStarLine();
        System.out.println("Enter \"1\" to fight or \"2\" to run.");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println(winLine);
                win(5);
                break;
            case 2:
                System.out.println(failLine);
                EndGame.endGameInDisgrace();
                break;
            default:
                System.out.println("You must select a value either  \"1\" to fight or \"2\" to run.");
                this.battle(winLine, failLine); //recursive use of method
        }
    }
}
