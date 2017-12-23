/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 *File Name: CommercialMower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 *Date: 10-28-2015
 * Description: The commercial mower extends the Lawn tractor class
 *              it has a no argument constructor that call the super
 *              class constructor, set the operatingHours and the 
 *              zeroTurnRadius.
 */
public class CommercialMower extends LawnTractor
{
    private double operatingHours;
    private boolean zeroTurnRadius;
    
    
    public CommercialMower()
    {
        super();
        operatingHours = 0.0;
        zeroTurnRadius = false;
        
    }

    /**
     * @return the operatingHours
     */
    public double getOperatingHours() {
        return operatingHours;
    }

    /**
     * @param operatingHours the operatingHours to set
     */
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    /**
     * @return the zeroTurnRadius
     */
    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    /**
     * @param zeroTurnRadius the zeroTurnRadius to set
     */
    public void setZeroTurnRadius(String state) {
        if(state.equals("false"))
        {
            zeroTurnRadius = false;
        }
        if(state.equals("true"))
        {
            zeroTurnRadius = true;
        }
    }
    
    public String toString()
    {
        String str = "";
        str = super.toString()+getOperatingHours()+
              System.getProperty("line.separator") + isZeroTurnRadius()
                +System.getProperty("line.separator");
        return str;
    }

}
