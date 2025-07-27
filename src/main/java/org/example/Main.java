

package org.example;

import java.awt.Component;
import java.util.Scanner;
import org.example.FrameHandler.Frame;
import org.example.ProgramHandler.MethodHandler;

public class Main {
    static MethodHandler mh;
    static Frame frame;

    public static void StartTerminal() {
        mh = new MethodHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a math expression:");
        String string = scanner.nextLine();
        System.out.println(mh.Calculate(string));
    }

    public static void main(String[] args) {
        frame = new Frame();
        frame.setVisible(true);
        frame.setLocationRelativeTo((Component)null);
        frame.setResizable(false);
        StartTerminal();
    }
}
