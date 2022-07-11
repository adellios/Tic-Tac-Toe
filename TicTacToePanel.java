import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
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

public class TicTacToePanel extends JPanel implements  ActionListener
{
    
   public GameButton[] buttons = new GameButton[9];
   public String symbol = "";  
   final String blank = "";
   public TicTacToeModel model = new TicTacToeModel();
   public TicTacToeAI mind = new TicTacToeAI();
   public InfoPanel info = new InfoPanel();
   JLabel messageBoard = new JLabel();
   JPanel boardPanel = new JPanel();
  
   TicTacToePanel()
   {

     JPanel panelGrid = new JPanel();
      Font font = new Font("Arial",Font.BOLD, 42);

      for(int i = 0; i < 9; i++)
      {
         buttons[i] = new GameButton(i);
	     buttons[i].setFont(font);
         buttons[i].setText("");
	     buttons[i].addActionListener(this);
         buttons[i].btnClicked();
         panelGrid.add(buttons[i]);
     }
	 panelGrid.setLayout(new GridLayout(3,3));
     panelGrid.setPreferredSize(new Dimension(300,300));

     boardPanel.setLayout(new BorderLayout());
     boardPanel.add(messageBoard, BorderLayout.NORTH);
     boardPanel.add(panelGrid);

     this.add(boardPanel);
     this.add(info);
     

   }


   @Override
   public void actionPerformed(ActionEvent event)
   {
	
      if((info.getTrigger() == true))
      {
	 resetBoard();
         info.setTrigger(false);

      } 
      else 
      {
         if (info.getPlayerBtn() == 1)
         {
            int r;
            if(model.getMoves() == 1)
            {
                setSymbol(info.getInfo());
                model.setPlayer(1);
            }
            GameButton src = (GameButton) event.getSource();
            buttons[src.getPosition()] = src;
            src.setText(getSymbol()); 
            model.updateArray(src.getPosition(), getSymbol());
            mind.updateCompArray(src.getPosition(), getSymbol());
            model.winningCombination();
           messageBoard.setText(model.checkWin(getSymbol()));
           model.updateMove();
           this.updateState();
           if( (model.getWin() == false)&& (model.getMoves() < 9))
           {
              boolean btn = false;
              r = mind.decideMove();
              while(btn == false)
              {
                 if(buttons[r].getText() == "")
    	         {
	            buttons[r].setText(getSymbol()); 
		    buttons[r].setEnabled(false);
		    btn = true;
	         } 
	         else
	         {  
	            r = mind.decideMove();
                 }
	      }  

              model.updateArray(r, getSymbol());
              mind.updateCompArray(r, getSymbol());
              model.winningCombination();
              messageBoard.setText(model.checkWin(getSymbol()));
              if (model.getWin()==true){this.setButtonsEnabled(false);}

             model.updateMove();
             this.updateState();
         }  
         else 
         {
            setButtonsEnabled(false);
         }

         }  // if statement END of one player

      else        // beginning of two players
      {
         if(model.getMoves() == 1)
	 {
            setSymbol(info.getInfo());
	    model.setPlayer(1);
	 }  
         GameButton src = (GameButton) event.getSource();
         buttons[src.getPosition()] = src;
         src.setText(getSymbol()); 
         model.updateArray(src.getPosition(), getSymbol());
         model.winningCombination();
         messageBoard.setText(model.checkWin(getSymbol()));
	 if (model.getWin()==true)
	 {
	    this.setButtonsEnabled(false);
         }
         model.updateMove();
         this.updateState();
  
      }   // end of two players
 
   } // end of non refresh button


   }   // end of action method


   public  void updateState()
   { 
      if (symbol == "X")
      {
         symbol ="O";
      } else {
         symbol = "X";
      }

   }
	
   public void setSymbol(String s)
   { 
      symbol = s;
   }

   public String getSymbol()
   {
      return symbol;
   }

   public String arrayValue(int i)
   {
	return buttons[i].getText();
   }

   public void resetBoard()
   {
      setButtonsEnabled(true);
      for(int i = 0; i<9; i++)
      {
         model.updateArray(i, blank);
      }

      for(int i = 0; i < 9; i++)
      {
 	mind.updateCompArray(i, blank);
      }

      for(int i = 0; i < 9; i++)
      {

//         buttons[i].setFont(font);
         buttons[i].setText("");
         buttons[i].addActionListener(this);
//         buttons[i].btnClicked();
      }


   }

   private void setButtonsEnabled(boolean enabled) 
   {
      for(int i=0;i<9;i++)
      {
         buttons[i].setEnabled(enabled);
         if(enabled) buttons[i].setText("");
      }
   }  

}

