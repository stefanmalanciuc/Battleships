package com.company.Game;

import com.company.Move;
import com.company.Player.Player;
import com.company.ship.GameBattleships;
import com.company.ship.Ship;

import java.util.List;

public class Game implements GameBattleships {
    private int currentRound;
    private List<Player> players;
    private List<Ship> ships;

    //default constructor
    public Game() {
        currentRound =1;
    }

    public void startGame(Player p1, Player p2) {

    }

    @Override
    public void attack(Move moveToAttack) {

    }

    @Override
    public void placeShip(Ship shipToPlace) {

    }

    public String getGameStatistics() {
        return null;
    }
}
