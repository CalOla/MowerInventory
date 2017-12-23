/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 * File Name: GasPoweredMower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The GasPoweredMower class extends the walkBehindMower
 *              The GasPoweredMower aggregates the Engine class
 *              The GasPoweredMower class has a no argument constructor
 *              that calls the super class constructor, sets the engine 
 *              and the selfPropelled instance variable
 *              The GasPoweredMower class has a addEngine method that sets the engine Model
 *              the engine deck width and the engine cylinders and adds them to the engine.
 */
public class GasPoweredMower extends WalkBehindMower
{
    private Engine engine;
    private boolean selfPropelled;
    
    
    public GasPoweredMower()
    {
        super();
        engine = new Engine();
        selfPropelled = false;
        
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void addEngine(String eModel, double eDeckWidth, int eCylinders)
    {
        engine = new Engine(eModel, eDeckWidth, eCylinders);
    }

    /**
     * @return the selfPropelled
     */
    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    /**
     * @param selfPropelled the selfPropelled to set
     */
    public void setSelfPropelled(String state) {
        if(state.equals("false"))
        {
            selfPropelled = false;
        }
        if(state.equals("true"))
        {
            selfPropelled = true;
        }
    }
    
    public String toString()
    {
        String str = "";
        str = super.toString()+System.getProperty("line.separator")+getEngine()
            + System.getProperty("line.separator") + isSelfPropelled() 
            +System.getProperty("line.separator");
        return str;
    }

   
}
