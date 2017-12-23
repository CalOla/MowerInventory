/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 * File Name: PushReelMower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The pushReelMower class extends the walkBehindMower class
 *              The pushReelMower class has a no argument constructor that calls
 *              the constructor of the super class, and set the numWheels
 *              The pushReelMower class toString calls the toString of the super class
 *              before adding new properties to it's toString.
 * 
 */
public class PushReelMower extends WalkBehindMower
{
    private int numWheels;
    
    public PushReelMower()
    {
        super();
        numWheels = 0;
    }

    /**
     * @return the numWheels
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * @param numWheels the numWheels to set
     */
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    
    public String toString()
    {
        String str = "";
        str = super.toString()+System.getProperty("line.separator")
             + getNumWheels() + System.getProperty("line.separator");
        return str;
    }
}
