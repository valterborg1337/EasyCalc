package org.example;

import org.example.FrameHandler.Frame;
import org.example.ProgramHandler.MethodHandler;

import java.awt.*;
import java.util.Scanner;


public class Main {
    // classes
     static MethodHandler mh;
     static Frame frame;


     //Test calculation in terminal
    public static void StartTerminal() {


        // declare the main program with the method to calculate and then start the terminal output and read the input
        mh = new MethodHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a math expression:");
        String string = scanner.nextLine();
        //sends the string from scanner with expression and awaits the return in string format and prints it out
        System.out.println(mh.Calculate(string));



    }


    //creates the frame from the frame class done in jformdesinger
    public static void main(String[] args) {
        frame = new Frame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        StartTerminal();



    }
}