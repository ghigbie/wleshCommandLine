package com.higbie.game_play;

import java.util.concurrent.TimeUnit;

public class UtilityMethods {

    public static void printStarLine(){
        System.out.println("");
        System.out.println("*******************************************************************");
    }

    public static void gameOverPrint(){
        printStarLine();
        System.out.println(" ______     ______     __    __     ______           ______     __   __   ______     ______       \n" +
                "/\\  ___\\   /\\  __ \\   /\\ \"-./  \\   /\\  ___\\         /\\  __ \\   /\\ \\ / /  /\\  ___\\   /\\  == \\      \n" +
                "\\ \\ \\__ \\  \\ \\  __ \\  \\ \\ \\-./\\ \\  \\ \\  __\\         \\ \\ \\/\\ \\  \\ \\ \\'/   \\ \\  __\\   \\ \\  __<      \n" +
                " \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\        \\ \\_____\\  \\ \\__|    \\ \\_____\\  \\ \\_\\ \\_\\    \n" +
                "  \\/_____/   \\/_/\\/_/   \\/_/  \\/_/   \\/_____/         \\/_____/   \\/_/      \\/_____/   \\/_/ /_/    \n" +
                "                                                                                                  ");
        printStarLine();
    }

    public static void startGamePrint(){
        printStarLine();
        System.out.println(" __     __     ______     __         ______     ______     __    __     ______    \n" +
                "/\\ \\  _ \\ \\   /\\  ___\\   /\\ \\       /\\  ___\\   /\\  __ \\   /\\ \"-./  \\   /\\  ___\\   \n" +
                "\\ \\ \\/ \".\\ \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\____  \\ \\ \\/\\ \\  \\ \\ \\-./\\ \\  \\ \\  __\\   \n" +
                " \\ \\__/\".~\\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\ \\_\\  \\ \\_____\\ \n" +
                "  \\/_/   \\/_/   \\/_____/   \\/_____/   \\/_____/   \\/_____/   \\/_/  \\/_/   \\/_____/ \n" +
                "                                                                                  ");
        printStarLine();
    }

    public static void delayGamePlay(long secondsToDelay) throws InterruptedException {
        TimeUnit.SECONDS.sleep(secondsToDelay);
    }
}
