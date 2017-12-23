/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * File Name: MowerWareHouse class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The MowerWareHouse aggregates the mower class and adds it to an ArrayList
 *              The readMowerData method opens a file that is passed in that contains mower data
 *              and reads the values in the appropriate order
 *              The saveMowerData method writes the content of the toString to an output file.
 */
public class MowerWareHouse
{
    private String storeName;
    private ArrayList<Mower> mower;
    private Scanner input;
    
    public MowerWareHouse()
    {
       mower= new ArrayList<Mower>(); 
       storeName = "";
    }

    /**
     * @return the storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * @return the mower
     */
    public Mower getMower(int i) {
        return mower.get(i);
    }

    /**
     * @param mower the mower to set
     */
    public void setMower(int i, Mower mow) {
        mower.set(i, mow);
    }
    
    public void addMower(Mower mow)
    {
        mower.add(mow);
    }
    
    public int getNumMower()
    {
        return mower.size();
    }
    
    public void removeMower(int i)
    {
        mower.remove(i);
    }
    
    public void readMowerData(String inputFileName)
    {
        try
        {
            input = new Scanner(new File(inputFileName));
            
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.out.println("File Not found");
            System.exit(1);
        }
       
        String mManufacturer = "";
        int mowerYear = 0;
        String mowerSerialNumber = "";
        String mowerType = "";
        String eManufacturer = "";
        double eHorseP = 0.0;
        int eCylinders = 0;
        String lTractorModel = "";
        double lTractorDW = 0.0;
        String cZeroTR = "";
        double cOperHours = 0.0;
        double wBMCut = 0.0;
        double wBMWheelD = 0.0;
        String gPMSelfP = "";
        int pRMNumwheels = 0;
        
        storeName = input.nextLine();
        
        
        while(input.hasNext())
        {
            
            mManufacturer = input.nextLine();
            
            mowerYear = Integer.parseInt(input.nextLine());
            
            mowerSerialNumber = input.nextLine();
            
            mowerType = input.nextLine();
            
            if(mowerType.equals("L"))
            {
                LawnTractor lawnTractor = new LawnTractor();
                lawnTractor.setManufacturer(mManufacturer);
                lawnTractor.setYear(mowerYear);
                lawnTractor.setSerialNumber(mowerSerialNumber);
                
                eManufacturer = input.nextLine();
                
                eHorseP = Double.parseDouble(input.nextLine());
                
                eCylinders = Integer.parseInt(input.nextLine());
                                
                lawnTractor.addEngine(eManufacturer, eHorseP, eCylinders);
                
                lTractorModel = input.nextLine();
                
                lTractorDW = Double.parseDouble(input.nextLine());
                lawnTractor.setType(mowerType);
                
                lawnTractor.setModel(lTractorModel);
                lawnTractor.setDeckWidth(lTractorDW);
                mower.add(lawnTractor);
            }
            
            if(mowerType.equals("C"))
            {
                CommercialMower commMower = new CommercialMower();
                
                commMower.setManufacturer(mManufacturer);
                commMower.setYear(mowerYear);
                commMower.setSerialNumber(mowerSerialNumber);
                
                eManufacturer = input.nextLine();
                
                
                eHorseP = Double.parseDouble(input.nextLine());
                
                
                eCylinders = Integer.parseInt(input.nextLine());
                
                
                commMower.addEngine(eManufacturer, eHorseP, eCylinders);
                
                lTractorModel = input.nextLine();
                commMower.setModel(lTractorModel);
                
                
                lTractorDW = Double.parseDouble(input.nextLine());
                commMower.setDeckWidth(lTractorDW);
                
                
                cOperHours = Double.parseDouble(input.nextLine());
                
                commMower.setOperatingHours(cOperHours);
                
                cZeroTR = input.nextLine();
                commMower.setZeroTurnRadius(cZeroTR);
                
                commMower.setType(mowerType);
                
                mower.add(commMower);
            }
            
            if(mowerType.equals("G"))
            {
                GasPoweredMower gasMower = new GasPoweredMower();
                
                gasMower.setManufacturer(mManufacturer);
                gasMower.setYear(mowerYear);
                gasMower.setSerialNumber(mowerSerialNumber);
                
                wBMCut = Double.parseDouble(input.nextLine());
                gasMower.setCutWidth(wBMCut);
                
                
                wBMWheelD = Double.parseDouble(input.nextLine());
                gasMower.setWheeldiameter(wBMWheelD);
               
                
                eManufacturer = input.nextLine();
                
                
                eHorseP = Double.parseDouble(input.nextLine());
                
                
                eCylinders = Integer.parseInt(input.nextLine());
                
                
                gasMower.addEngine(eManufacturer, eHorseP, eCylinders);
                
                gPMSelfP = input.nextLine();
                gasMower.setSelfPropelled(gPMSelfP);
                
                gasMower.setType(mowerType);
                
                mower.add(gasMower);
            }
            
            if(mowerType.equals("P"))
            {
                PushReelMower pushMower = new PushReelMower();
                pushMower.setManufacturer(mManufacturer);
                pushMower.setYear(mowerYear);
                pushMower.setSerialNumber(mowerSerialNumber);
                
                wBMCut = Double.parseDouble(input.nextLine());
                pushMower.setCutWidth(wBMCut);
                
                
                wBMWheelD = Double.parseDouble(input.nextLine());
                pushMower.setWheeldiameter(wBMWheelD);
               
                
                pRMNumwheels = Integer.parseInt(input.nextLine());
                pushMower.setNumWheels(pRMNumwheels);
                
                pushMower.setType(mowerType);
               
                
                mower.add(pushMower);
            }
        }
    }
    
    public void saveMowerData(String outputFileName)
    {
           try
        {
            PrintWriter output  = null;
            output = new PrintWriter(new FileOutputStream(outputFileName,false));
            
            output.println(storeName); 
      

            for(Mower mow : mower)
            {
                output.print(mow.toString());       
            }
           
            output.close();
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.out.println("Error opening output file");
        }
    }
    
    
    @Override
    public String toString()
    {
        String str = "";
        for(Mower mow : mower)
        {
            str += System.getProperty("line.separator") + mow.toString() +
                   System.getProperty("line.separator");
        }
        return str;
    }
}
