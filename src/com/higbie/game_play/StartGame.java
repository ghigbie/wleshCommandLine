package com.higbie.game_play;

import com.higbie.models.Player;

public class StartGame {

    public static void loadGame(){
        PrintUtility.printStarLine();
        PrintUtility.startGamePrint();
        System.out.println("");
        System.out.println("Someone yells, \"Tell me your name so I may know the name of the captive creature I kill!\"");
        PrintUtility.printStarLine();
        System.out.println("");

        Player player = Player.createPlayer();
        player.firstBattle();
        PrintUtility.printStarLine();
        System.out.println("You realize who you are!");
        System.out.println("You are a Welsh spearman of the Kingdom of Dumnonia who has been taken prisoner after your shield wall was broken in battle...");
        System.out.println("You comrades and fellow spearmen were all killed while you were left unconscious. ");
        System.out.println("The world is spinning, your head hurts, and you look up as blood drips from your nose.");
    }


}
