package com.higbie.models;

import com.higbie.game_play.EndGame;
import com.higbie.game_play.UtilityMethods;

import java.util.Scanner;

public class Goffifad extends Warrior {

    public Goffifad(String name, int battlePower, String openingDialogue) {
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
                System.out.println("You pick up your spear and thrust it into " + getName() + "'s chest armor. It pierces his leather breastplate.");
                System.out.println("He drops to the ground and you hear his soul flee his body.");
                System.out.println("He died like a warrior, and you gave him a good death.");
                player.win(5);
                break;
            case 2:
                System.out.println("You turn and run! You feel a sword chop the back of your neck.");
                System.out.println("You collapse and die.");
                EndGame.endGameInDisgrace();
                break;
            default:
                System.out.println("You must select a value oe either  \"1\" to fight or \"2\" to run.");
                this.battle(player);
        }
    }

}
