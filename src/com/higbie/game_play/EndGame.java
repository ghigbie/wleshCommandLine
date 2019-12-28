package com.higbie.game_play;

public class EndGame {

    public static void endGame(){
        System.exit(0);
    }

    public static void endGameInDisgrace(){
        System.out.println("You deserve the death that found you out for being a coward");
        System.out.println("May your soul wonder the earth for eternity.");
        UtilityMethods.gameOverPrint();
        endGame();
    }

    public static void winGame(String place){
        System.out.println("You have defeated all of your enemies and have proved yourself to be the Champion of " + place + ".");
        System.out.println("You are victorious this time, but remember you are surrounded by foes at all times.");
        System.out.println("For now, you may rejoice in your victory!");
        UtilityMethods.useFileReader("src/com/higbie/textfiles/win.txt");
        UtilityMethods.printStarLine();
        endGame();
    }




}
