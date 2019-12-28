package com.higbie.models;

import com.higbie.game_play.EndGame;
import com.higbie.game_play.UtilityMethods;

import java.util.Scanner;

public class Lancelot extends Warrior {

    public Lancelot(String name, int battlePower, String openingDialogue) {
        super(name, battlePower, openingDialogue);
    }

    public void fightToKill() throws InterruptedException {
        UtilityMethods.delayGamePlay(2);
        System.out.println(getOpeningDialogue());
        System.out.println("You must kill "+ getName() + " or Die! You can either slash him with your sword or run.");
    }

    public void battle(Player player){
        int choice;
        Scanner scanner = new Scanner(System.in);
        UtilityMethods.printStarLine();
        System.out.println("Enter \"1\" to fight or \"2\" to run.");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("You cut through "+ getName() +"'s defences easily and realize how much of a coward he is as you slash down and cut off his sword hand.");
                System.out.println("Blood flows everywhere.");
                System.out.println(getName() + "begs for mercy. \"Don't kill me!\", he pleads");
                System.out.println("You trust your sword though " + getName() + "'s chest armor. It pierces the leather easily.");
                System.out.println("He screams in bloody agony and stoops to the ground.");
                System.out.println("He continues to plead for a fast death, and in your hatred you let him die slowly");
                player.win(5);
                break;
            case 2:
                System.out.println("You turn and run! You feel a spear pierce your leg.");
                System.out.println("A sword chops at the nape of your neck.");
                System.out.println("You collapse and die.");
                EndGame.endGameInDisgrace();
                break;
            default:
                System.out.println("You must select a value oe either  \"1\" to fight or \"2\" to run.");
                this.battle(player);
        }
    }
}
