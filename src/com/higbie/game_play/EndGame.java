package com.higbie.game_play;

public class EndGame {

    public static void endGame(){
        System.exit(0);
    }

    public static void gameOverPrint(){
        System.out.println("  _______       __       ___      ___   _______         ______  ___      ___  _______   _______      ___  \n" +
                " /\" _   \"|     /\"\"\\     |\"  \\    /\"  | /\"     \"|       /    \" \\|\"  \\    /\"  |/\"     \"| /\"      \\    |\"  | \n" +
                "(: ( \\___)    /    \\     \\   \\  //   |(: ______)      // ____  \\\\   \\  //  /(: ______)|:        |   ||  | \n" +
                " \\/ \\        /' /\\  \\    /\\\\  \\/.    | \\/    |       /  /    ) :)\\\\  \\/. ./  \\/    |  |_____/   )   |:  | \n" +
                " //  \\ ___  //  __'  \\  |: \\.        | // ___)_     (: (____/ //  \\.    //   // ___)_  //      /   _|  /  \n" +
                "(:   _(  _|/   /  \\\\  \\ |.  \\    /:  |(:      \"|     \\        /    \\\\   /   (:      \"||:  __   \\  / |_/ ) \n" +
                " \\_______)(___/    \\___)|___|\\__/|___| \\_______)      \\\"_____/      \\__/     \\_______)|__|  \\___)(_____/  \n" +
                "                                                                                                          ");
    }

    public static void endGameInDisgrace(){
        System.out.println("You deserve the death that found you out for being a coward");
        System.out.println("May your soul wonder the earth for eternity.");
        gameOverPrint();
        endGame();
    }




}
