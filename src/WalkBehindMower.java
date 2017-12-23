/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 * File Name: WalkBehindMower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The WalkBehindMower class extends the Mower class
 *              The WalkBehindMower class as a no argument constructor that calls
 *              the super class constructor, sets the cutWidth, the wheelDiameter and type
 *              The WalkBehindMower class has a String type instance variable that stores the type of mower it is
 *              The setType method sets the mower type and the getMower returns the mower type.
 * 
 */
public class WalkBehindMower extends Mower
{
    private double cutWidth;
    private double wheeldiameter;
    private String type;
    
    public WalkBehindMower ()
    {
        super();
        cutWidth = 0.0;
        wheeldiameter = 0.0;
        type ="";
    }

    /**
     * @return the cutWidth
     */
    public double getCutWidth() {
        return cutWidth;
    }

    /**
     * @param cutWidth the cutWidth to set
     */
    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    /**
     * @return the wheeldiameter
     */
    public double getWheeldiameter() {
        return wheeldiameter;
    }

    /**
     * @param wheeldiameter the wheeldiameter to set
     */
    public void setWheeldiameter(double wheeldiameter) {
        this.wheeldiameter = wheeldiameter;
    }
    
    public String toString()
    {
        String str = "";
        str = super.toString()
                +getType() +System.getProperty("line.separator")
                + getCutWidth() + 
                System.getProperty("line.separator")
                + getWheeldiameter();
        return str;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
