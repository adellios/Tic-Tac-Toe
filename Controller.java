import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JPanel
{

        public static void main(String[] args)
        {

        JFrame main = new JFrame("TicTacToe");
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.setPreferredSize(new Dimension(800,600));

	TicTacToePanel T = new TicTacToePanel();



   pane.add(T);

   main.add(pane);
   main.pack();
    main.setVisible(true);
    }

}
