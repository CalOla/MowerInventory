/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 * File Name: LawnTractor class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The LawnTractor class extends the Mower class
 *              The LawnTractor class aggregates the Engine class
 *              The LawnTractor class as a no argument constructor that calls
 *              the super class constructor, sets engine, model, deckWidth and type
 *              The LawnTractor class has a addEngine method that sets the engine Model
 *              the engine deck width and the engine cylinders and adds them to the engine
 *              The lawnTractor class has a String type instance variable that stores the type of mower it is
 *              The setType method sets the mower type and the getMower returns the mower type.
 */
public class LawnTractor extends Mower
{
    private Engine engine;
    private String model;
    private double deckWidth;
    private String type;
    
    public LawnTractor()
    {
        super();
        engine = new Engine();
        model = "";
        deckWidth = 0.0;
        type = "";
        
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * The addEngine adds an Engine and its properties to LawnTractor
     * @param engine 
     */
    public void addEngine(String eModel, double eDeckWidth, int eCylinders ) {
        engine = new Engine(eModel, eDeckWidth, eCylinders);
    }
    
    

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the deckWidth
     */
    public double getDeckWidth() {
        return deckWidth;
    }

    /**
     * @param deckWidth the deckWidth to set
     */
    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
    
    public String toString()
    {
        String str ="";
        str = super.toString()+getType()+ System.getProperty("line.separator") 
                + getEngine() + System.getProperty("line.separator") 
                + getModel()
                 + System.getProperty("line.separator")+getDeckWidth()
                + System.getProperty("line.separator") ;
        return str;
    }

    /**
     * the getMower returns the mower type
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * The setType method sets the mower type 
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
