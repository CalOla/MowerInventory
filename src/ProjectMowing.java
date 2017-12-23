/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * File Name: PushReelMower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description:
 * 
 */
public class ProjectMowing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        MowerWareHouse mw = new MowerWareHouse();

        mw.readMowerData("in.txt");
        
        mw.saveMowerData("output.txt");
        
        JFrame frame = new MowerWareHouseFrame(mw);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setTitle(mw.getStoreName());
        frame.setVisible(true);

    }
    
}
