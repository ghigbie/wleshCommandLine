package com.higbie;

import com.higbie.game_play.StartGame;
import com.higbie.models.Player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isPlaying = true;


        StartGame.loadGame();

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();

        Player player = new Player(playerName, 10, 100, 100);
        player.declarePlayer();


        while(isPlaying){

        }

    }

}
