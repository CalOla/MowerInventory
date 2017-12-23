/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

/**
 * File Name: Mower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The Mower class has two constructors, a no argument constructor
 *              and a constructor that accepts three arguments
 *              The no argument constructor set the manufacturer, the year and the
 *              serial number to default values
 *              The second constructor sets the manufacturer, the year and the
 *              serial number to passed in values.
 */
public class Mower
{
    private String manufacturer;
    private int year;
    private String serialNumber;
    
    public Mower()
    {
        manufacturer = "";
        year = 0;
        serialNumber = "";
    }
    
    public Mower(String man, int yr, String sN)
    {
        manufacturer = man;
        year = yr;
        serialNumber = sN;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public String toString()
    {
        String str ="";
        str = getManufacturer() + System.getProperty("line.separator") 
               + getYear() + System.getProperty("line.separator")
                + getSerialNumber() + System.getProperty("line.separator");
        return str;
    }
}
