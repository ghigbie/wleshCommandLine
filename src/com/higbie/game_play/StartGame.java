package com.higbie.game_play;

import com.higbie.models.Lancelot;
import com.higbie.models.Player;
import com.higbie.models.Warrior;

import java.util.concurrent.TimeUnit;

public class StartGame {

    Player player = Player.createPlayer();

    public static void unnanedApproaches(int battlePower, long secondsToDelay, String openingDialogue, String actionLine) throws InterruptedException {
        UtilityMethods.delayGamePlay(2);
        UtilityMethods.printStarLine();
        Warrior warrior = new Warrior(battlePower, openingDialogue);
        warrior.fightToKill(actionLine);
    }

    public static void warriorApproaches(String warriorName, int battlePower, long secondsToDelay, String openingDialogue, String actionLine) throws InterruptedException {
        UtilityMethods.delayGamePlay(2);
        UtilityMethods.printStarLine();
        Warrior warrior = new Warrior(warriorName, battlePower, openingDialogue);
        warrior.fightToKill(actionLine);
    }

    public void loadGame() throws InterruptedException {
        UtilityMethods.printStarLine();
        UtilityMethods.startGamePrint();
        System.out.println("");
        unnanedApproaches(10,
                         2,
                         "Someone yells, \"Tell me your name so I may know the name of the captive creature I kill!\"",
                         "\"You must kill this Saxon pig! You can either pick up your spear or run.\"");
        UtilityMethods.printStarLine();
        System.out.println("");

        player.firstBattle();
        UtilityMethods.printStarLine();
        player.tellBackStory();

        UtilityMethods.delayGamePlay(5);
        System.out.println("You walk down a long, dark corridor...");
        System.out.println("...");

        warriorApproaches("Gofiffad",
                          15,
                          2,
                          "I am Gofiffad the Ruthless. The gods welcome you home!",
                          "You must kill Gofiffad or Die! You can either slash him with your sword or run.");
    }


}
