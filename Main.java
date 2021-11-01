package com.jacobcodes;

import javax.swing.*;
import java.awt.*;



public class Main {

    public Main()
    {
        // creating frame
        JFrame frame = new JFrame();
        //creating panel
        JPanel panel = new JPanel();

        // setting border & layout of panel
        panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 20, 60));
        panel.setLayout(new GridLayout(0, 1));

        // adding panel to frame
        frame.add(panel, BorderLayout.CENTER);
        // setting operation to close panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Jacobs GUI");
        // set window to match certain size
        frame.pack();
        // setting visible and in focus
        frame.setVisible(true);


    }

    public static void main(String[] args) {
	new Main();
    }
}
