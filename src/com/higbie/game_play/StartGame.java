package com.higbie.game_play;

import com.higbie.models.*;

public class StartGame {

    public void loadGame() throws InterruptedException {

        UtilityMethods.printStarLine();
        UtilityMethods.startGamePrint();
        System.out.println("");

        UnnamedWarrior unnamed = new UnnamedWarrior(10,
                                                   "Someone yells, \"Tell me your name so I may know the name of the captive creature I kill!\"");
        unnamed.fightToKill(); //Opening dialogue is run
        Player player = Player.createPlayer(); // creates a new player

        unnamed.battle(player);
        UtilityMethods.printStarLine();
        System.out.println("");

        UtilityMethods.printStarLine();
        player.tellBackStory();

        UtilityMethods.delayGamePlay(5);
        System.out.println("You walk down a long, dark corridor...");
        System.out.println("...");

        Goffifad goffifad = new Goffifad("Goffifad", 15, "I am Gofiffad the Ruthless. The gods welcome you home!");
        goffifad.fightToKill();
        goffifad.battle(player);

        UtilityMethods.delayGamePlay(5);
        System.out.println("You continue to walk. You find a room and look around.");
        System.out.println("You see a familiar face.");
        String lancelotOpen = "You will die slowly " + player.getName() + "!";
        Lancelot lancelot = new Lancelot("Lancelot", 20, "");
        lancelot.fightToKill();
        lancelot.battle(player);
    }


}
