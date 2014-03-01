package org.rcd.mvc;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import net.miginfocom.swing.MigLayout;

public class CaesarView extends JFrame{
    //create our Components using MigLayout
    private JButton btnCopy = new JButton("Copy");
    private JButton btnExit = new JButton("Exit");

    private JLabel lblAskString = new JLabel("Enter String:");
    private JTextField txtInputStr = new JTextField();
    private JTextArea txtOutputStr = new JTextArea();

	public CaesarView(String title) {
        JPanel cPanel = new JPanel(new MigLayout());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //initialize settings for text area
        txtOutputStr.setLineWrap(true);
        txtOutputStr.setWrapStyleWord(true);
        txtOutputStr.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		txtOutputStr.setEditable(false);


        cPanel.add(lblAskString,"align left,wrap");
        cPanel.add(txtInputStr,"growx");
        cPanel.add(btnCopy, "wrap, growx");
        cPanel.add(new JScrollPane(txtOutputStr),"w 300,h 300");
        cPanel.add(btnExit, "growx,top");


        this.setLocationRelativeTo(null);
        cPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        this.add(cPanel);

        this.setTitle(title);
        this.setResizable(false);

        this.pack();
    }

    //getters
    public String getInputString(){
        return txtInputStr.getText();

    }
    public String getOutputString(){
        return txtOutputStr.getText();
    }



    //setters
    public void setInputString(String toSet){
        txtInputStr.setText(toSet);
    }

    public void setOutputString(String toSet){
        txtOutputStr.setText(toSet);
    }

    //event handlers
    void copyBtnListener(ActionListener listenForCopyButton){
        btnCopy.addActionListener( listenForCopyButton);
    }

    void exitBtnListener(ActionListener listenForExitButton){
        btnExit.addActionListener( listenForExitButton);
    }

	void txtInputKeyListener(KeyListener listenForKeyPress){
		txtInputStr.addKeyListener( listenForKeyPress);
	}


    //utility methods

    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }
    public void moveToCenter()
    {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();

        this.setBounds(center.x - windowWidth/2, center.y- windowHeight/2,windowWidth,windowHeight);

    }


    public static void main(String[] args)
    {
        //CaesarView v = new CaesarView("Caesar Encryption Demo");
        //v.setVisible(true);
    }

}