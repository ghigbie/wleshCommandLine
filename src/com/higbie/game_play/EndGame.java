package com.higbie.game_play;

public class EndGame {

    public static void endGame(){
        System.exit(0);
    }

    public static void endGameInDisgrace(){
        System.out.println("You deserve the death that found you out for being a coward");
        System.out.println("May your soul wonder the earth for eternity.");
        PrintUtility.gameOverPrint();
        endGame();
    }




}
