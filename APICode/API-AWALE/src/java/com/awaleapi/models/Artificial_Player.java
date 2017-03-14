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
public class Artificial_Player extends Player
{
 private int depth;
 
    public Artificial_Player(String name, int score, String playerPosition, int depth) {
        super(name, score, playerPosition);
        this.depth = depth;
    }
 
 public void play(int prof, float time)
 {
     
 }
}
