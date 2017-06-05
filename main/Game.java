package main;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Main driver for game.
 * 
 * @author Drew
 *
 */
public class Game extends JFrame {

   // Gets screen resolution and stores it
   public static Dimension screenSize = new Dimension(
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth(),
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight());

   public static Dimension resolution = new Dimension(800, 600);
   private int fullScreen = 2;

   public Game() {
      setTitle("Knight Slayer Jorig");

      if (fullScreen == 1) {
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setUndecorated(true);
      } else if (fullScreen == 2) {
         setUndecorated(true);
         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(this);
      }
      setContentPane(new GamePanel(fullScreen));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      pack();
      setVisible(true);
   }

   public static void main(String[] args) {
      new Game();
   }
}
