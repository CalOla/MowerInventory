/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 *File Name: Engine class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 *Date: 10-28-2015
 * Description: The Engine class has two constructors
 *              The first is a no argument, while the second constructor
 *              has three formal parameters.
 * 
 */
public class Engine
{
    private String manufacturer;
    private double horsePower;
    private int cylinders;
    
    public Engine()
    {
        manufacturer = "";
        horsePower = 0.0;
        cylinders = 0;
    }
    
    public Engine(String mauf, double hPower, int cyl)
    {
        manufacturer = mauf;
        horsePower = hPower;
        cylinders = cyl;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the horsePower
     */
    public double getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower the horsePower to set
     */
    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    /**
     * @return the cylinders
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * @param cylinders the cylinders to set
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    
    public String toString()
    {
        String str = "";
        str = getManufacturer() + System.getProperty("line.separator")
              + getHorsePower() + System.getProperty("line.separator") +
                getCylinders();
        return str;
    }
}
