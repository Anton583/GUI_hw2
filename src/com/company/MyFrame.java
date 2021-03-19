package com.company;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    private Application app;
    private JLabel stateLabel;
    private JMenuBar menuBar;

    public MyFrame(Application application) {
        super("Combo box");
        app = application;
        setVisible(true);
        setSize(400, 300);

        // menu bar with one item for quitting the program
        menuBar = new JMenuBar ();
        JMenu fileMenu = new JMenu ("File");
        JMenuItem quitItem = new JMenuItem ("Quit");
        quitItem.addActionListener ((ActionEvent e) -> {
            int result =
                    JOptionPane.
                            showConfirmDialog(this,
                                    "Are you sure you want to exit?",
                                    null, JOptionPane.OK_CANCEL_OPTION );
            if(result == JOptionPane.YES_OPTION)
                    System.exit (0);
                }
                );
        fileMenu.add (quitItem);
        menuBar.add (fileMenu);
        setJMenuBar (menuBar);

        // a label for showing the boolean state of the program
        stateLabel = new JLabel ();
        showState ();
        add (stateLabel, BorderLayout.BEFORE_FIRST_LINE);



    }
    // a method which shows the state
    public void showState () {
        stateLabel.setText (String.valueOf (app.getState ()));
    }
}
