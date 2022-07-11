import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GameButton extends JButton //implements ActionListener
{


	public int position;
	public String str;
	String[] array = new String[9];
        GameButton(int position)
        {

		this.position = position;

		this.addActionListener(new ActionListener()
        	{
        		public void actionPerformed(ActionEvent e)
            		{
       			setEnabled(false);
		        }
         	});
	}

     	public int getPosition()
        {
             	return position;
     	}

	public void setValue(String str)
	{
		this.str = str;
	}


	public void btnClicked()
	{
		this.addActionListener(new ActionListener()
		{			
			public void actionPerformed(ActionEvent e)
			{
				if(array[getPosition()] == "X"){setValue(array[getPosition()]);}
				else {setValue(array[getPosition()]);}
			}
		});
	}

	public String getValue()
	{
		return str;
	}

}
