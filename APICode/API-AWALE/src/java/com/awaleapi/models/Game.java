/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awaleapi.models;

/**
 *
 * @author WINDOWS
 */
public class Game 
{
    private int taillePlateau;
    private int nbrHole;
    private Hole hole;
    private int nbrSeed;
    private int playerGameTime;
    private boolean gameSens;
    
    public int cells[][];
    private void intialize(int taillePlateau, int nbrHole, Hole hole, int nbrSeed, int playerGameTime,boolean gameSens)
    {
        int timer = playerGameTime;
        cells = new int[2][nbrHole];
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 6; j++)
				cells[i][j] = nbrSeed;
		} 
    }

    public int getTaillePlateau() {
        return taillePlateau;
    }

    public void setTaillePlateau(int taillePlateau) {
        this.taillePlateau = taillePlateau;
    }

    public int getNbrHole() {
        return nbrHole;
    }

    public void setNbrHole(int nbrHole) {
        this.nbrHole = nbrHole;
    }

    public Hole getHole() {
        return hole;
    }

    public void setHole(Hole hole) {
        this.hole = hole;
    }

    public int getNbrSeed() {
        return nbrSeed;
    }

    public void setNbrSeed(int nbrSeed) {
        this.nbrSeed = nbrSeed;
    }

    public int getPlayerGameTime() {
        return playerGameTime;
    }

    public void setPlayerGameTime(int playerGameTime) {
        this.playerGameTime = playerGameTime;
    }

    public boolean isGameSens() {
        return gameSens;
    }

    public void setGameSens(boolean gameSens) {
        this.gameSens = gameSens;
    }
    
    
}
