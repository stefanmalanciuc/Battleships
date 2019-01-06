package com.company.Player;

public class Player {

    private String PlayerName;
    private int Score;

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public Player(String name) {
        PlayerName = name;
    }

    public void setName(String name) {
        this.PlayerName = name;
    }

    public String getName() {
        return PlayerName;
    }


}
