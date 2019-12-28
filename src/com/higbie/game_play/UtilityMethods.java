package com.higbie.game_play;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.nio.Buffer;
import java.util.concurrent.TimeUnit;

public class UtilityMethods {

    public static void printStarLine(){
        System.out.println("");
        System.out.println("*******************************************************************");
    }

    public static void useFileReader(String filePath){
        File file = new File(filePath);
        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("There was an error: "+ e);
        }
    }

    public static void gameOverPrint(){
        printStarLine();
        //prints game over line
        useFileReader("src/com/higbie/textfiles/game_over.txt");
        printStarLine();
    }

    public static void startGamePrint(){
        printStarLine();
        //prints welcome message
        useFileReader("src/com/higbie/textfiles/welcome.txt");
        printStarLine();
    }

    public static void delayGamePlay(long secondsToDelay) throws InterruptedException {
        TimeUnit.SECONDS.sleep(secondsToDelay);
    }


}
