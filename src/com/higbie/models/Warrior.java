package com.higbie.models;

import com.higbie.game_play.EndGame;
import com.higbie.game_play.UtilityMethods;

import java.util.Scanner;

public class Warrior {
    private int battlePower;
    private String name;
    private String openingDialogue;

    public Warrior(String name, int battlePower, String openingDialogue) {
        this.battlePower = battlePower;
        this.name = name;
        this.openingDialogue = openingDialogue;
    }

    public Warrior(int battlePower, String openingDialogue) {
        this.battlePower = battlePower;
        this.openingDialogue = openingDialogue;
    }

    public int getBattlePower() {
        return battlePower;
    }

    public void setBattlePower(int battlePower) {
        this.battlePower = battlePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fightToKill(String actionLine, Player player){
        System.out.println(getName() + " draws his weapon and points it at your throat.");
        System.out.println("");

        int choice;
        Scanner scanner = new Scanner(System.in);
        UtilityMethods.printStarLine();
        System.out.println(actionLine);
        player.battle();
    }

    public void battle(){
        boolean willFight;
        int choice;
        Scanner scanner = new Scanner(System.in);
        UtilityMethods.printStarLine();
        System.out.println("You must kill this Saxon pig! You can either pick up your spear or run.");
        System.out.println("Enter \"1\" to fight or \"2\" to run.");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("You pick up your spear and thrust it into the throat of the Saxon spearman,");
                System.out.println("and you hear the sound of death in crackle in his throat.");
                win(5);
                break;
            case 2:
                System.out.println("You turn and run! You feel a spear suddenly pierce you back.");
                System.out.println("You drop to your knees in a pool of your own blood. Coward!");
                EndGame.endGameInDisgrace();
                break;
            default:
                System.out.println("You must select a value oe either  \"1\" to fight or \"2\" to run.");
                this.firstBattle();
        }
    }
}
