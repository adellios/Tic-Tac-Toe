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

public class InfoPanel extends JPanel
{

public int player;
public String x = "";
public boolean trigger = false; 
   InfoPanel()
   {
      // Infotainment represents  the panel with instructions \\
      
      JPanel infotainment = new JPanel();
Font font = new Font("Arial",Font.BOLD, 42);
 
      this.setBorder(BorderFactory.createLineBorder(Color.black));
      this.setLayout(new BorderLayout());
      this.setPreferredSize(new Dimension(200,525));

//    -------- ISS is an acronym for International Space Station -------

      JPanel topPane = new JPanel();
      topPane.setLayout(new BorderLayout());
      topPane.setPreferredSize(new Dimension(133,175));
      JLabel headPane = new JLabel("Player 1   |   Player 2", JLabel.CENTER);
      
topPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      JLabel playerOneScore = new JLabel();
      JLabel playerTwoScore = new JLabel();
	playerOneScore.setFont(font);
        playerTwoScore.setFont(font);      

      // head pane is attached to TopPane \\
      headPane.setBorder(BorderFactory.createLineBorder(Color.black));
      topPane.add(headPane, BorderLayout.NORTH);
      topPane.add(playerOneScore, BorderLayout.WEST);
      topPane.add(playerTwoScore, BorderLayout.EAST);

// -------------------- Center Pane ------------------------\\
      JPanel centerPane = new JPanel();
      centerPane.setLayout(new BorderLayout());
      centerPane.setBorder(BorderFactory.createLineBorder(Color.black));




// ------------------------ One Player Pane   ---------------------------- 
      JPanel onePlayerPane = new JPanel();
      onePlayerPane.setLayout(new BorderLayout());
      onePlayerPane.setBorder(BorderFactory.createLineBorder(Color.black));
      onePlayerPane.setPreferredSize(new Dimension(133,175));

      JLabel onePlayer = new JLabel("One Player", JLabel.CENTER);
      onePlayer.setBorder(BorderFactory.createLineBorder(Color.black));

      JPanel XOButtons = new JPanel();

JButton XButton = new JButton("X");   // BIG X
JButton OButton = new JButton("O"); 
JButton xButton = new JButton("X"); 
JButton oButton = new JButton("O"); 

XButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {

                x=(XButton.getText());
                
                player = 1;
		playerOneScore.setText(XButton.getText());
		playerTwoScore.setText(OButton.getText());
		XButton.setEnabled(false);
		OButton.setEnabled(false);
	        xButton.setEnabled(false);
                oButton.setEnabled(false);
           
		 
	   }
        });

//      JButton OButton = new JButton("O");   // BIG O
      OButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {
//                T.setSymbol(xButton.getText());
                x=(OButton.getText());
                player = 1;
                playerOneScore.setText(OButton.getText());
                playerTwoScore.setText(XButton.getText());
		XButton.setEnabled(false);
		OButton.setEnabled(false);
                xButton.setEnabled(false);
                oButton.setEnabled(false);
            }
        });

      XOButtons.add(XButton);
      XOButtons.add(OButton);    
      onePlayerPane.add(onePlayer, BorderLayout.NORTH);
      onePlayerPane.add(XOButtons, BorderLayout.SOUTH);
      centerPane.add(onePlayerPane, BorderLayout.CENTER);
    
  
      JPanel twoPlayerPane = new JPanel();
      twoPlayerPane.setLayout(new BorderLayout());
      twoPlayerPane.setBorder(BorderFactory.createLineBorder(Color.black));
      twoPlayerPane.setPreferredSize(new Dimension(133,175));
      
      JPanel XOBUTTONS = new JPanel();
      
      JLabel twoPlayers = new JLabel("Two PLayers", JLabel.CENTER);
      twoPlayers.setBorder(BorderFactory.createLineBorder(Color.black));


      xButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {
//                T.setSymbol(xButton.getText());
		x=(xButton.getText());
                playerOneScore.setText(XButton.getText());
                playerTwoScore.setText(OButton.getText());
		player = 2;
                xButton.setEnabled(false);
                oButton.setEnabled(false);
		XButton.setEnabled(false);
		OButton.setEnabled(false);
            }
        });

//      JButton oButton = new JButton("O");   // BIG O
      oButton.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e)
            {
//                T.setSymbol(xButton.getText());
                x=(oButton.getText());
                playerOneScore.setText(OButton.getText());
                playerTwoScore.setText(XButton.getText());
                player = 2;
                xButton.setEnabled(false);
                oButton.setEnabled(false);
                XButton.setEnabled(false);
				OButton.setEnabled(false);
            }
        });


      XOBUTTONS.add(xButton);
      XOBUTTONS.add(oButton);
      twoPlayerPane.add(twoPlayers, BorderLayout.NORTH);
      twoPlayerPane.add(XOBUTTONS, BorderLayout.SOUTH); 
      centerPane.add(twoPlayerPane, BorderLayout.SOUTH);
/*

      JPanel gamePlay = new JPanel();
      gamePlay.setPreferredSize(new Dimension(133, 200));
      JLabel label = new JLabel(" # of Game Plays ");
      gamePlay.add(label);
      JButton three = new JButton("2 out of 3 ");
      JButton five = new JButton("3 out of 5");
      gamePlay.add(three);
      gamePlay.add(five);
      centerPane.add(gamePlay, BorderLayout.NORTH);
  */   
/*
      JPanel bottomPane = new JPanel();    
      JButton exitGame = new JButton("Reset");
      exitGame.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
	    setTrigger(true);
            exitGame.setEnabled(false);      
         }
      });
      bottomPane.add(exitGame);
  */    
      this.add(topPane, BorderLayout.NORTH);
      this.add(centerPane, BorderLayout.CENTER);
//      this.add(bottomPane, BorderLayout.SOUTH);
	}	

	public String getInfo()
	{	
		return x;
	}	

    
	
	public int getPlayerBtn()
	{
	    return player;
	}


	public void setTrigger(boolean bool)
	{
		this.trigger = bool;
	}

	public boolean getTrigger()
	{
		return trigger;
	}
}
