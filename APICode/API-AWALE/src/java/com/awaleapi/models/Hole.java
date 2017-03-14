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
public class Hole 
{
 private int number;
 private int seedn;
 private Hole next;
 private Hole previous;
 
 public Hole(int number, int seedn) /*Constructeur*/
 {
     
 }
 
 public int pickedUp()/*Function to know the hole where we can pick some seed in case of gain*/
 {
     return 0;
     
 }
 
 public void move(int number, int seedn)/*function to move seed from one hole to the next*/
 {
    
    
 }
 
 public boolean testValid(int number)/*function for testing if the hole the player choose can be played*/
 {
     return false;
     
 }
 
// 

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeedn() {
        return seedn;
    }

    public void setSeedn(int seedn) {
        this.seedn = seedn;
    }

    public Hole getNext() {
        return next;
    }

    public void setNext(Hole next) {
        this.next = next;
    }

    public Hole getPrevious() {
        return previous;
    }

    public void setPrevious(Hole previous) {
        this.previous = previous;
    }
}
