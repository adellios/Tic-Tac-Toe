import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

public class TicTacToeModel
{
    // just now
   int index;
   int moves = 1;
   boolean winner = false;
   int player;
//   String playerOne;
//   String playerTwo;

//String x = "WE HAVE A WINNER!!!";
//String y = "     I am A LABEL         ";

   String[] array = new String[9];

   TicTacToeModel()
   {
      for(int i = 0; i < 9; i++)
      {
         array[i] = "";   //----------------------------------------->    

      }
   }

   boolean winningCombination()
   {

         if((array[0] != "") && array[0].equals(array[1]) && array[0].equals(array[2]))
	 {
	    winner = true;	    
//	    return winner;
	 }	

         else if ((array[3] != "") && array[3].equals(array[4]) && array[3].equals(array[5]))
	 {
	    winner = true;
//            return winner;
	 }
//	 else if ((array[6] != "") && array[6].equals(array[7]) && array[6].equals(array[8]))
         else if ((array[6] != "") && array[6].equals(array[7]) && array[6].equals(array[8]))
         {
	    winner = true;
//            return winner;      
         }
//	 else if ((array[0] != "") && array[0].equals(array[3]) && array[0].equals(array[6]))
         else if ((array[0] != "") && array[0].equals(array[3]) && array[0].equals(array[6]))
         {
            winner = true;
//            return winner;      
         }
//	 else if ((array[1] != "") && array[1].equals(array[4]) && array[1].equals(array[7]))
         else if ((array[1] != "") && array[1].equals(array[4]) && array[1].equals(array[7]))
         {
	    winner = true;
//            return winner;      
         }
//	 else if ((array[2] != "") && array[2].equals(array[5]) && array[2].equals(array[8]))
         else if ((array[2] != "") && array[2].equals(array[5]) && array[2].equals(array[8]))
         {
	    winner = true;
//            return winner;      
         }
//	 else if ((array[0] != "") && array[0].equals(array[4]) && array[0].equals(array[8]))
         else if ((array[0] != "") && array[0].equals(array[4]) && array[0].equals(array[8]))
         {      
	    winner = true;
//            return winner;
         }
//	 else if ((array[2] != "") && array[2].equals(array[4]) && array[2].equals(array[6]))
         else if ((array[2] != "") && array[2].equals(array[4]) && array[2].equals(array[6]))
         {
	    winner = true;
//            return winner;      
         }
//      }
	return winner;
   }

   public String checkWin(String str)
   {
      if (winner == true)
      {   
        //    x = player + " IS THE WINNER";
            return "             Player " + Integer.toString(player) + " (  " + str + "  )  " + " IS THE WINNER"; 
      }if((moves == 9) && (winner==false))
	{
		return "                              STALEMATE                   ";
	}  else{
	//return  //"There has been "+Integer.toString(moves)+" moves";
	    if(getPlayer() == 1)
        {
           setPlayer(2); 
        } else {
            setPlayer(1);
        }
	    return "                    It is player " + Integer.toString(player) + " turn";
    }//	return w;}

   }

   public void updateArray(int position, String character)
   {
      array[position] = character;//
   }

   public int getMoves()
   {
      return moves;
   }

   public void updateMove()
   {
      moves++;
   }
        	   
   public boolean getWin()
   {
	return winner;
   }
   
   public void setPlayer(int player)
   {
       this.player = player; 
   }

   public int getPlayer()
   {
       return player;
   }


}
