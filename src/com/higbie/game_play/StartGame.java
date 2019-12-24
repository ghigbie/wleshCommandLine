package com.higbie.game_play;

import com.higbie.models.Goffifad;
import com.higbie.models.Player;
import com.higbie.models.UnnamedWarrior;
import com.higbie.models.Warrior;

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
    }


}
