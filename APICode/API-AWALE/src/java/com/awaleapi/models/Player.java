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
public class Player 
{
    private String name;
    private int score;
    private int nbHole;
    private String playerPosition;
    
   public Player(String name, int score, String playerPosition)/*Constructor*/
   {
       this.name = name;
       this.score = score;
       this.playerPosition = playerPosition;
   }
   
   public void play (int hole)/*Play a hole*/
   {
       
   }
   /*To add point on the player score*/
   public void addScore(int score)
	{
		setScore(this.score + score);
	}
   
        /*Show player name*/
   public String toString()
	{
		return "Joueur [nom : " + name + " , score = " + score + " , side : "
				+ playerPosition + " ]";
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNbHole() {
        return nbHole;
    }

    public void setNbHole(int nbHole) {
        this.nbHole = nbHole;
    }

    public String isPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }
   
}
