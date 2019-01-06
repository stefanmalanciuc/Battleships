package com.company.ship;

import com.company.Move;

public interface GameBattleships {

    void attack(Move moveToAttack);
    void placeShip(Ship shipToPlace);
}

