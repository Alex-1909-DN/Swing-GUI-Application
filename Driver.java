/*
 * File name: Driver.java
 * Author: Quoc Phong Tran, 041134348
 * Course: CST8284 – OOP
 * Lab: 06
 * Date: November 26, 2024
 * Professor: Moshiur Rahman
 * Purpose: this class serves as the entry point to launch the Timer application.
 * It initializes the main application window (TimerGuiApplication) and makes it visible.
 * Class list: Driver, TimerGuiApplication
 */

package lab06;
/**
 * The Driver class is responsible for initializing and launching the TimerGuiApplication, which is a Swing-based GUI for tracking elapsed time between start and stop actions.
 * It sets the properties of the main window, such as the close operation, title, and visibility.
 * @author Quoc Phong Tran
 * @version 1.0.0
 * @see javax.swing.JFrame
 * @see lab06
 * @since 21.0.3
 */
import javax.swing.JFrame;
/**
 * Driver class to launch the TimerApplication.
 */
public class Driver {
    /**
     * The main method that serves as the entry point to the Timer application.
     * It creates an instance of the TimerGuiApplication frame, sets the default 
     * close operation, sets the window title, and makes the frame visible.
     * 
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
    	// Create an instance of the TimerGuiApplication
        JFrame frame = new TimerGuiApplication();
        // Set the default close operation to exit the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the title of the application window
        frame.setTitle("Timer Application (Program By Quoc Phong Tran)");
        // Make the frame visible on the screen
        frame.setVisible(true);
    }
}