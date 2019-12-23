package com.higbie;

import com.higbie.game_play.StartGame;
import com.higbie.models.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StartGame startGame = new StartGame();

        try {
            startGame.loadGame();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }

//        Scanner scanner = new Scanner(System.in);
//        String playerName = scanner.next();
//
//        Player player = new Player(playerName, 10, 100, 100);
//        player.declarePlayer();

        //Player.createPlayer();


    }

}
