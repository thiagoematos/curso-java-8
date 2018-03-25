package _02_lambda_basico.prints._01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static util.Console.print;

public class Main {

    public static void main(String[] args) {
        Button ok = new Button();

        //Pré-Lambda
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print( e );
            }
        });

        // Lambda
        ok.addActionListener(e -> print( e ));
    }

}
