package com.higbie.models;

import com.higbie.game_play.EndGame;
import com.higbie.game_play.UtilityMethods;

import java.util.Scanner;

public class UnnamedWarrior extends Warrior {

    public UnnamedWarrior(int battlePower, String openingDialogue) {
        super(battlePower, openingDialogue);
    }

    public void fightToKill() throws InterruptedException {
        UtilityMethods.delayGamePlay(2);
        System.out.println("A bute of a spearman draws his weapon and points it at your throat.");
        System.out.println(getOpeningDialogue());
        System.out.println("");
    }

    public void battle(Player player){
        int choice;
        Scanner scanner = new Scanner(System.in);
        UtilityMethods.printStarLine();
        System.out.println("Enter \"1\" to fight or \"2\" to run.");
        choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("You pick up your spear and thrust it into the throat of the Saxon spearman,");
                System.out.println("and you hear the sound of death in crackle in his throat.");
                player.win(5);
                break;
            case 2:
                System.out.println("You turn and run! You feel a spear suddenly pierce you back.");
                System.out.println("You drop to your knees in a pool of your own blood. Coward!");
                EndGame.endGameInDisgrace();
                break;
            default:
                System.out.println("You must select a value oe either  \"1\" to fight or \"2\" to run.");
                this.battle(player);
        }
    }
}
