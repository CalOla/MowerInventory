/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmowing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/** 
 * File Name: PushReelMower class
 * Author: Caleb Olaoye
 * Course and Section: GEEN 165 002
 * Date: 10-28-2015
 * Description: The MowerWareHouseFrame class extends the JFrame class
 *              The MowerWareHouseFrame class uses the JButton, JTextArea, JTextField
 *              JDialog, JPanel and JLabel classes to create functionality for the GUI Frame.   
 */
public class MowerWareHouseFrame extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 400;
    
    private JButton lawnButton;
    private JButton commButton;
    private JButton gasButton;
    private JButton pushButton;
    private JButton saveButton;
    private JButton exitButton;
    private JButton addButton;
    private JButton viewButton;
    private JButton loadButton;
    
    private JTextArea display;
    
    private JTextField field;
    private JTextField eMField;
    private JTextField eDField;
    private JTextField eCField;
    private JTextField mMField;
    private JTextField mYField;
    private JTextField mSField;
    private JTextField lTMField;
    private JTextField lTDField;
    private JTextField cMOField;
    private JTextField cMZField;
    private JTextField wBMCField;
    private JTextField wBMWField;
    private JTextField gPMSField;
    private JTextField pRMNField;
    
    private JPanel savePanel;
    private JPanel adderPanel;
    private JPanel generalPanel;
    
    private JLabel label;
    private JLabel eMLabel;
    private JLabel eDLabel;
    private JLabel eCLabel;
    private JLabel mMLabel;
    private JLabel mYLabel;
    private JLabel mSLabel;
    private JLabel lTMLabel;
    private JLabel lTDLabel;
    private JLabel cMOLabel;
    private JLabel cMZLabel;
    private JLabel wBMCLabel;
    private JLabel wBMWLabel;
    private JLabel gPMSLabel;
    private JLabel pRMNLabel;
    
    private MowerWareHouse mw;
    
    private String getter;
    
    private int exiter;
 
/**
 * Constructs the user interface of the Mower Warehouse Frame 
 * @param mwh 
 */    
    public MowerWareHouseFrame(MowerWareHouse mwh)
    {
        mw = mwh;
        exiter = 0;
        
        //Construct components 
        JPanel displayPanel = new JPanel();
        display = new JTextArea(4,20);
        display.setVisible(false);
        displayPanel.add(display,BorderLayout.CENTER);
        
        lawnButton = new JButton("Lawn Tractor");
        lawnButton.setVisible(false);
        lawnButton.addActionListener(new lawnButtonListener());
        
        
        commButton = new JButton("Commercial Mower");
        commButton.setVisible(false);
        commButton.addActionListener(new commButtonListener());
        
        gasButton = new JButton("Gas Powered Mower");
        gasButton.setVisible(false);
        gasButton.addActionListener(new gasButtonListener());
        
        pushButton = new JButton("Push Reel Mower");
        pushButton.setVisible(false);
        pushButton.addActionListener(new pushButtonListener());
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(new saveButtonListener());
        
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new exitButtonListener());
        
        addButton = new JButton("Add");
        addButton.addActionListener(new addButtonListener());
        
        viewButton = new JButton("View");
        viewButton.addActionListener(new viewButtonListener());
        
        loadButton = new JButton("Load");
        loadButton.addActionListener(new loadButtonListener());
        
        //Add components
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,1));
        buttonPanel.add(lawnButton);
        buttonPanel.add(commButton);
        buttonPanel.add(gasButton);
        buttonPanel.add(pushButton);
        displayPanel.add(buttonPanel);
        
        savePanel = new JPanel();
        
        savePanel.add(saveButton);
        savePanel.add(exitButton);
        savePanel.add(addButton);
        savePanel.add(viewButton);
        savePanel.add(loadButton);

        
        generalPanel = new JPanel();
        generalPanel.setLayout(new GridLayout(2,1));
        generalPanel.add(displayPanel);
        generalPanel.add(savePanel);
        add(generalPanel);
        
    }
    
    class lawnButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
            for(int i =0; i < mw.getNumMower(); i++)
            {
                if((mw.getMower(i) instanceof LawnTractor) && !(mw.getMower(i) instanceof CommercialMower))
                {
                    display.setText(mw.getMower(i)+"");
                }
                
            }
            
            
        }    
    }
    
    class commButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
            for(int i =0; i < mw.getNumMower(); i++)
            {
                if(mw.getMower(i) instanceof CommercialMower)
                {
                    display.setText(mw.getMower(i)+"");
                }
            }
        }    
    }
    
    class gasButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
            for(int i =0; i < mw.getNumMower(); i++)
            {
                if(mw.getMower(i) instanceof GasPoweredMower)
                {
                    display.setText(mw.getMower(i)+"");
                }
            }
        }    
    }
    
    class pushButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
            for(int i =0; i < mw.getNumMower(); i++)
            {
                if(mw.getMower(i) instanceof PushReelMower)
                {
                    display.setText(mw.getMower(i)+"");
                }
            }
        }    
    }
    
    class loadButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        { 
            JFileChooser fileChooser = new JFileChooser();
                int val = fileChooser.showOpenDialog(fileChooser);
                if(val == JFileChooser.APPROVE_OPTION)
                {
                    mw.readMowerData(fileChooser.getSelectedFile()+"");
                }
        }
    }
    class saveButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
              mw.saveMowerData(JOptionPane.showInputDialog("Enter name of file")+".txt");
              exiter = 0;
        }    
    }
  
    class exitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  if(exiter == 0)
            {
                System.exit(0);
            }
            else if(exiter == 1)
            {
                String str = JOptionPane.showInputDialog("Enter Y to save N to not save");
                if(str.equalsIgnoreCase("Y"))
                {
                    mw.saveMowerData(JOptionPane.showInputDialog("Enter name of file")+".txt");
                    System.exit(0);
                }
                else if(str.equalsIgnoreCase("N"))
                {
                   System.exit(0);      
                }
            }
        }    
    }
  
    class addButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
           
            
            exiter = 1;
            label = new JLabel();
            field = new JTextField(10);
            
            adderPanel = new JPanel();
            adderPanel.setLayout(new GridLayout(12,2));
            
            String type = JOptionPane.showInputDialog("Enter type of mower: L,C,G, or P");
            display.setVisible(false);
            lawnButton.setVisible(false);
            gasButton.setVisible(false);
            pushButton.setVisible(false);
            commButton.setVisible(false);
            saveButton.setVisible(true);
            viewButton.setVisible(true);
            label.setVisible(true);
            
            
            
            if(type.equalsIgnoreCase("L"))
            {
                label = new JLabel("Mower Type");
                field = new JTextField("L");
                eMLabel = new JLabel("Enter engine manufacturer");
                eMField = new JTextField(10);
                 System.out.println("before");
                eMField.addActionListener(new textFieldListener());
                
                eDLabel = new JLabel("Enter engine deck width");
                eDField = new JTextField(10);
                eDField.addActionListener(new textFieldListener());
                
                eCLabel = new JLabel("Enter number of engine cylinders");
                eCField = new JTextField(10);
                eCField.addActionListener(new textFieldListener());
                
                mMLabel = new JLabel("Enter mower manufacturer");
                mMField = new JTextField(10);
                mMField.addActionListener(new textFieldListener());
                
                mYLabel = new JLabel("Enter mower year");
                mYField = new JTextField(10);
                mYField.addActionListener(new textFieldListener());
                
                mSLabel = new JLabel("Enter mower serial number");
                mSField = new JTextField(10);
                mSField.addActionListener(new textFieldListener());
                
                lTMLabel = new JLabel("Enter Lawn tractor model");
                lTMField = new JTextField(10);
                lTMField.addActionListener(new textFieldListener());
                
                lTDLabel = new JLabel("Enter lawn tractor deck width");
                lTDField = new JTextField(10);
                lTDField.addActionListener(new textFieldListener());
                
                  adderPanel.add(label);
                  adderPanel.add(field);
                  adderPanel.add(eMLabel);
                  adderPanel.add(eMField);
                  adderPanel.add(eDLabel);
                  adderPanel.add(eDField);
                  adderPanel.add(eCLabel);
                  adderPanel.add(eCField);
            
                  adderPanel.add(mMLabel);
                  adderPanel.add(mMField);
                  adderPanel.add(mYLabel);
                  adderPanel.add(mYField);
                  adderPanel.add(mSLabel);
                  adderPanel.add(mSField);
            
                  adderPanel.add(lTMLabel);
                  adderPanel.add(lTMField);
                  adderPanel.add(lTDLabel);
                  adderPanel.add(lTDField);
            }
            
            else if(type.equalsIgnoreCase("C"))
            {
                label = new JLabel("Mower Type");
                field = new JTextField("C");
                eMLabel = new JLabel("Enter engine manufacturer");
                eMField = new JTextField(10);
                 
                eMField.addActionListener(new textFieldListener());
                
                eDLabel = new JLabel("Enter engine horse power");
                eDField = new JTextField(10);
                eDField.addActionListener(new textFieldListener());
//                
                
                eCLabel = new JLabel("Enter number of engine cylinders");
                eCField = new JTextField(10);
                eCField.addActionListener(new textFieldListener());
//              
                
//                lt.addEngine(eMField.getText(),Double.parseDouble(eDField.getText()),Integer.parseInt(eCField.getText()));
                
                mMLabel = new JLabel("Enter mower manufacturer");
                mMField = new JTextField(10);
                mMField.addActionListener(new textFieldListener());
//                lt.setManufacturer(getter);
                
                
                mYLabel = new JLabel("Enter mower year");
                mYField = new JTextField(10);
                mYField.addActionListener(new textFieldListener());
                
                mSLabel = new JLabel("Enter mower serial number:");
                mSField = new JTextField(10);
                mSField.addActionListener(new textFieldListener());
                
                lTMLabel = new JLabel("Enter Lawn tractor model: ");
                lTMField = new JTextField(10);
                lTMField.addActionListener(new textFieldListener());
                
                lTDLabel = new JLabel("Enter lawn tractor deck width: ");
                lTDField = new JTextField(10);
                lTDField.addActionListener(new textFieldListener());
                
                cMOLabel = new JLabel("Enter commercial mower operating hours: ");
                cMOField  = new JTextField(10);
                cMOField.addActionListener(new textFieldListener());
                
                cMZLabel = new JLabel("Is there a turn radius: ");
                cMZField = new JTextField(10);
                cMZField.addActionListener(new textFieldListener());
                
                
                
                adderPanel.add(label);
                adderPanel.add(field);
                adderPanel.add(eMLabel);
                adderPanel.add(eMField);
                adderPanel.add(eDLabel);
                adderPanel.add(eDField);
                adderPanel.add(eCLabel);
                adderPanel.add(eCField);
            
                adderPanel.add(mMLabel);
                adderPanel.add(mMField);
                adderPanel.add(mYLabel);
                adderPanel.add(mYField);
                adderPanel.add(mSLabel);
                adderPanel.add(mSField);
            
                adderPanel.add(lTMLabel);
                adderPanel.add(lTMField);
                adderPanel.add(lTDLabel);
                adderPanel.add(lTDField);
            
                adderPanel.add(cMOLabel);
                adderPanel.add(cMOField);
                adderPanel.add(cMZLabel);
                adderPanel.add(cMZField);
                
                
            }
            
            if(type.equalsIgnoreCase("G"))
            {
                label = new JLabel("Mower Type");
                field = new JTextField("G");
             
                eMLabel = new JLabel("Enter engine manufacturer");
                eMField = new JTextField(10);
                eMField.addActionListener(new textFieldListener());
                eDLabel = new JLabel("Enter engine horse power");
                eDField = new JTextField(10);
                eDField.addActionListener(new textFieldListener());
                eCLabel = new JLabel("Enter number of engine cylinders");
                eCField = new JTextField(10);
                eCField.addActionListener(new textFieldListener());
//                
                
                eCLabel = new JLabel("Enter number of engine cylinders");
                eCField = new JTextField(10);
                eCField.addActionListener(new textFieldListener());
                
                mMLabel = new JLabel("Enter mower manufacturer");
                mMField = new JTextField(10);
                mMField.addActionListener(new textFieldListener());
                
                mYLabel = new JLabel("Enter mower year");
                mYField = new JTextField(10);
                mYField.addActionListener(new textFieldListener());
                
                mSLabel = new JLabel("Enter mower serial number");
                mSField = new JTextField(10);
                mSField.addActionListener(new textFieldListener());
                
                wBMCLabel = new JLabel("Enter the walk behind mower cut width:");
                wBMCField = new JTextField(10);
                wBMCField.addActionListener(new textFieldListener());
                
                wBMWLabel = new JLabel("Enter the walk behind mower wheel diameter:");
                wBMWField = new JTextField(10);
                wBMWField.addActionListener(new textFieldListener());
                
                gPMSLabel = new JLabel("Is gaspowered mower propelled:");
                gPMSField = new JTextField(10);
                gPMSField.addActionListener(new textFieldListener());
                
                adderPanel.add(label);
                adderPanel.add(field);
                
                adderPanel.add(eMLabel);
                adderPanel.add(eMField);
                adderPanel.add(eDLabel);
                adderPanel.add(eDField);
                adderPanel.add(eCLabel);
                adderPanel.add(eCField);
            
                adderPanel.add(mMLabel);
                adderPanel.add(mMField);
                adderPanel.add(mYLabel);
                adderPanel.add(mYField);
                adderPanel.add(mSLabel);
                adderPanel.add(mSField);
                
                adderPanel.add(wBMCLabel);
                adderPanel.add(wBMCField);
                adderPanel.add(wBMWLabel);
                adderPanel.add(wBMWField);
                
                adderPanel.add(gPMSLabel);
                adderPanel.add(gPMSField);
            }
            
            if(type.equalsIgnoreCase("P"))
            {
                label = new JLabel("Mower Type");
                field = new JTextField("P");
                
                mMLabel = new JLabel("Enter mower manufacturer");
                mMField = new JTextField(10);
                mMField.addActionListener(new textFieldListener());
                
                mYLabel = new JLabel("Enter mower year");
                mYField = new JTextField(10);
                mYField.addActionListener(new textFieldListener());
                
                mSLabel = new JLabel("Enter mower serial number");
                mSField = new JTextField(10);
                mSField.addActionListener(new textFieldListener());
                
                wBMCLabel = new JLabel("Enter the walk behind mower cut width:");
                wBMCField = new JTextField(10);
                wBMCField.addActionListener(new textFieldListener());
                
                wBMWLabel = new JLabel("Enter the walk behind mower wheel diameter:");
                wBMWField = new JTextField(10);
                wBMWField.addActionListener(new textFieldListener());
                
                pRMNLabel = new JLabel("Enter the number of wheels on the push reel mower:");
                pRMNField = new JTextField(10);
                pRMNField.addActionListener(new textFieldListener());
                
                adderPanel.add(label);
                adderPanel.add(field);
            
                adderPanel.add(mMLabel);
                adderPanel.add(mMField);
                adderPanel.add(mYLabel);
                adderPanel.add(mYField);
                adderPanel.add(mSLabel);
                adderPanel.add(mSField);
                
                adderPanel.add(wBMCLabel);
                adderPanel.add(wBMCField);
                adderPanel.add(wBMWLabel);
                adderPanel.add(wBMWField);
                
                adderPanel.add(pRMNLabel);
                adderPanel.add(pRMNField);
            }
            
                JFrame frame = new JFrame();
                frame.add(adderPanel, BorderLayout.CENTER);
                frame.setVisible(true);
                frame.setTitle(mw.getStoreName());
                frame.setSize(800, 300);
        
        }
                
                
        
    }
    
    class viewButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {  
            lawnButton.setVisible(true);
            commButton.setVisible(true);
            gasButton.setVisible(true);
            pushButton.setVisible(true);
            display.setVisible(true);
           
        }    
    }
    
    class textFieldListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
          try{
            field.getText();
            
            if(field.getText().equalsIgnoreCase("L"))
            {
                LawnTractor lt = new LawnTractor();
                lt.setType(field.getText());
                lt.addEngine(eMField.getText(), Double.parseDouble(eDField.getText()), Integer.parseInt(eCField.getText()));
                lt.setManufacturer(mMField.getText());
                lt.setYear(Integer.parseInt(mYField.getText()));
                lt.setSerialNumber(mSField.getText());
                lt.setModel(lTMField.getText());
                lt.setDeckWidth(Double.parseDouble(lTDField.getText()));
                mw.addMower(lt);
            }
            
            else if(field.getText().equalsIgnoreCase("C"))
            {
                CommercialMower cm = new CommercialMower();
                cm.setType(field.getText());
                cm.addEngine(eMField.getText(), Double.parseDouble(eDField.getText()), Integer.parseInt(eCField.getText()));
                cm.setManufacturer(mMField.getText());
                cm.setYear(Integer.parseInt(mYField.getText()));
                cm.setSerialNumber(mSField.getText());
                cm.setModel(lTMField.getText());
                cm.setDeckWidth(Double.parseDouble(lTDField.getText()));
                cm.setOperatingHours(Double.parseDouble(cMOField.getText()));
                cm.setZeroTurnRadius(cMZField.getText());
                mw.addMower(cm);
            }
            
            else if(field.getText().equalsIgnoreCase("G"))
            {
                GasPoweredMower gp = new GasPoweredMower();
                gp.setType(field.getText());
                gp.addEngine(eMField.getText(), Double.parseDouble(eDField.getText()), Integer.parseInt(eCField.getText()));
                gp.setManufacturer(mMField.getText());
                gp.setYear(Integer.parseInt(mYField.getText()));
                gp.setSerialNumber(mSField.getText());
                gp.setCutWidth(Double.parseDouble(wBMCField.getText()));
                gp.setWheeldiameter(Double.parseDouble(wBMWField.getText()));
                gp.setSelfPropelled(gPMSField.getText());
                mw.addMower(gp);
            }
            
            else if(field.getText().equalsIgnoreCase("P"))
            {
                PushReelMower gp = new PushReelMower();
                gp.setType(field.getText());
                gp.setManufacturer(mMField.getText());
                gp.setYear(Integer.parseInt(mYField.getText()));
                gp.setSerialNumber(mSField.getText());
                gp.setCutWidth(Double.parseDouble(wBMCField.getText()));
                gp.setWheeldiameter(Double.parseDouble(wBMWField.getText()));
                gp.setNumWheels(Integer.parseInt(pRMNField.getText()));
                mw.addMower(gp);
            }
          }
          catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null,"Carefully re-enter values");
            
        }
        }
       
    }
}
