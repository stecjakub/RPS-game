package org.example;

import org.example.rps.ComputerPlayer;
import org.example.rps.Game;
import org.example.rps.Player;

public class Main {
    public static void main(String[] args) {
        Player humanPlayer = new Player("Player");
        Player computerPlayer = new ComputerPlayer("Computer");

        Game game = new Game(humanPlayer, computerPlayer);
        game.playGame();
    }
}
