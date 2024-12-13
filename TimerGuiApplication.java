/*
 * File name: TimerGuiApplication.java
 * Author: Quoc Phong Tran, 041134348
 * Course: CST8284 – OOP
 * Lab: 06
 * Date: November 26, 2024
 * Professor: Moshiur Rahman
 * Purpose: this class provides a simple graphical user interface (GUI) to measure the elapsed time between a "Start" and a "Stop" button press. 
 *   The application calculates the time difference and displays the result to the user.
 * Class list: Driver, TimerGuiApplication
 */

package lab06;
/**
 * The TimerGuiApplication class is a Swing-based graphical user interface (GUI) application 
 *   that allows users to measure the time elapsed between pressing a "Start" button and a "Stop" button.
 *   It displays the result in milliseconds using a message dialog.
 * @author Quoc Phong Tran
 * @version 1.0.0
 * @see javax.swing.JFrame
 * @see java.awt.BorderLayout
 * @see javax.swing.JButton
 * @see java.awt.Color
 * @see javax.swing.JPanel
 * @see javax.swing.JOptionPane
 * @see java.awt.event.ActionListener
 * @see java.awt.event.ActionEvent
 * @see lab06
 * @since 21.0.3
 */

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * TimerGuiApplication is a GUI-based application that allows users to start and stop a timer.
 * It features a user-friendly interface with Start and Stop buttons, styled for intuitive interaction.
 * This class extends JFrame to create a graphical window, utilizes Swing components for the 
 * user interface, and handles button actions through event listeners.
 */
public class TimerGuiApplication extends JFrame {
	// The width of the application window.
    private static final int FRAME_WIDTH = 400; 
    // The height of the application window.
    private static final int FRAME_HEIGHT = 250;
    // The timestamp when the timer is started.
    private long startTime;
    // The timestamp when the timer is stopped.
    private long endTime;
    // Flag indicating if the timer is running.
    private boolean isRunning;

    /**
     * Constructor to set up the TimerApplication GUI.
     */
    public TimerGuiApplication() {
        setLayout(new BorderLayout()); 
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Create the Start and Stop buttons.
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");

        // Set the Start button background color to green.
        startButton.setBackground(Color.GREEN);
        // Set the Stop button background color to red.
        stopButton.setBackground(Color.RED);

        // Create a panel to hold the buttons and add them to the panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton); 

        // Add the panel to the CENTER region of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Action listener for the Start button
        startButton.addActionListener(new ActionListener() {
            /**
             * Starts the timer when the Start button is clicked, 
             * or shows a warning if the timer is already running.
             * @param event the ActionEvent triggered by the Start button
             */
            @Override
            public void actionPerformed(ActionEvent event) {
                if (!isRunning) {
                	// Record the start timestamp.
                    startTime = System.currentTimeMillis();
                    isRunning = true;
                    JOptionPane.showMessageDialog(TimerGuiApplication.this, "The Application started", "Information Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // If the timer is already running, display a warning message.
                    JOptionPane.showMessageDialog(TimerGuiApplication.this, "Timer is already running", "Warning Message", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Action listener for the Stop button
        stopButton.addActionListener(new ActionListener() {
            /**
             * Stops the timer when the Stop button is clicked, 
             * calculates the elapsed time, and displays it, or shows a warning if the timer is not running.
             * @param event the ActionEvent triggered by the Stop button
             */
            @Override
            public void actionPerformed(ActionEvent event) {
                if (isRunning) {
                	// Record the end timestamp.
                    endTime = System.currentTimeMillis();
                    isRunning = false;
                    // Calculate the elapsed time in milliseconds.
                    long elapsedTime = endTime - startTime;
                    JOptionPane.showMessageDialog(TimerGuiApplication.this, "Elapsed time: " + elapsedTime + " milliseconds", "Calculation Result", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // If the timer is not running, display a warning message.
                    JOptionPane.showMessageDialog(TimerGuiApplication.this, "Timer is not running", "Warning Message", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
   