import java.util.Random;

public class TicTacToeAI
{

	int empty = 0;
	int location = 0;
//	boolean bool = true;
	boolean decide = false;

   String[] compArray = new String[9];
   String value = "";
   int index;

   TicTacToeAI()
   {
      for(int i = 0; i < 9; i++)
      {
	     compArray[i] = "";
      }
   }
	
	
	
	
	
	
	// __________-------> if statements needed to break loop early
	
	
	
	
	
	boolean getAcross()
	{
		boolean bool = true;
		empty = 0;
//		location = 0;
		System.out.println("step1");
		while(bool == true)
		{
			System.out.println("step2");
			if( (compArray[0].equals(compArray[1])) || (compArray[1].equals(compArray[2])) || (compArray[0].equals(compArray[2])) )
			{
				System.out.println("step3");
				for(int i = 0; i < 3; i++)
      			{
      				System.out.println("step4"); 
	  				if(compArray[i] == "")
	  				{
	  					System.out.println("step5");
	  					empty++;
	  				}
	  				System.out.println("step7");
      			}
      			System.out.println("step8");
      			if(empty == 1)
      			{
      			System.out.println("step9");
      				for(int i = 0; i < 3; i++)
      				{
      					System.out.println("step10");
      					if(compArray[i] == "")
      					{
      						System.out.println("step11");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step12");
      				}	
      			}
			System.out.println("step13");
			}
	// removed else if below and just left IF
			if ( (compArray[3].equals(compArray[4])) || (compArray[4].equals(compArray[5])) || (compArray[3].equals(compArray[5])) ) // finish code here and below. The second case of getAcross
			{	
	empty = 0;
				System.out.println("step14");
				for (int i = 3; i < 6; i++)
				{
					System.out.println("step15");
					if(compArray[i] == "")
	  				{
	  					System.out.println("step16");
	  					empty++;
	  				}	
	  			System.out.println("step17");
				}
				System.out.println("step18");
				if(empty == 1)
      			{
      			System.out.println("step19");
      				for(int i = 3; i < 6; i++)
      				{
      					System.out.println("step20");
      					if(compArray[i] == "")
      					{
      						System.out.println("step21");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step22");
      				}	
      			System.out.println("step23");
      			}
			System.out.println("step24");
			}
	// removed else if below and just left IF
			if ( (compArray[6].equals(compArray[7])) || (compArray[7].equals(compArray[8])) || (compArray[6].equals(compArray[8])) )
			{
	empty = 0;	
				System.out.println("step25a");
				for (int i = 6; i < 9; i++)
				{
					System.out.println("step25");
					if(compArray[i] == "")
	  				{
	  					System.out.println("step26");
	  					empty++;
	  				}	
	  			System.out.println("step27");
				}
				System.out.println("step28");
				if(empty == 1)
      			{
      			System.out.println("step29");
      				for(int i = 6; i < 9; i++)
      				{
      					System.out.println("step30");
      					if(compArray[i] == "")
      					{
      						System.out.println("step31");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step32");
      				}	
      			System.out.println("step33");
      			}
      			else
				{	
					System.out.println("step35");
					bool = false;
				}

			System.out.println("step34");
			}
///*			else
//			{	
				System.out.println("step35");
				bool = false;
//			}
//*/
			System.out.println("step36");
		} // end of while loop
		System.out.println("step37");
		return decide;
	} // end of getAcross function

	boolean getDown()
	{
		boolean bool = true;
		empty = 0;
//		location = 0;
		System.out.println("step101");
		while(bool == true)
		{
			System.out.println("step102");
			if( (compArray[0].equals(compArray[3])) || (compArray[3].equals(compArray[6])) || (compArray[0].equals(compArray[6])) )
			{
				System.out.println("step103");
				for(int i = 0; i < 7; i+=3)
      			{
      				System.out.println("step104"); 
	  				if(compArray[i] == "")
	  				{
	  					System.out.println("step105");
	  					empty++;
	  				}
	  				System.out.println("step710");
      			}
      			System.out.println("step108");
      			if(empty == 1)
      			{
      			System.out.println("step109");
      				for(int i = 0; i < 7; i+=3)
      				{
      					System.out.println("step110");
      					if(compArray[i] == "")
      					{
      						System.out.println("step111");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step112");
      				}	
      			}
			System.out.println("step113");
			}
			// removed else if below and just left IF
			if ( (compArray[1].equals(compArray[4])) || (compArray[4].equals(compArray[7])) || (compArray[1].equals(compArray[7])) ) // finish code here and below. The second case of getAcross
			{	
	empty = 0;
				System.out.println("step114");
				for (int i = 1; i < 8; i+=3)
				{
					System.out.println("step115");
					if(compArray[i] == "")
	  				{
	  					System.out.println("step116");
	  					empty++;
	  				}	
	  			System.out.println("step117");
				}
				System.out.println("step118");
				if(empty == 1)
      			{
      			System.out.println("step119");
      				for(int i = 1; i < 8; i+=3)
      				{
      					System.out.println("step120");
      					if(compArray[i] == "")
      					{
      						System.out.println("step121");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step122");
      				}	
      			System.out.println("step123");
      			}
			System.out.println("step124");
			}
	// removed else if below and just left IF
			if ( (compArray[2].equals(compArray[5])) || (compArray[5].equals(compArray[8])) || (compArray[2].equals(compArray[8])) )
			{	
	empty = 0;
				System.out.println("step125a");
				for (int i = 2; i < 9; i+=3)
				{
					System.out.println("step125");
					if(compArray[i] == "")
	  				{
	  					System.out.println("step126");
	  					empty++;
	  				}	
	  			System.out.println("step127");
				}
				System.out.println("step128");
				if(empty == 1)
      			{
      			System.out.println("step129");
      				for(int i = 2; i < 9; i+=3)
      				{
      					System.out.println("step130");
      					if(compArray[i] == "")
      					{
      						System.out.println("step131");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step132");
      				}	
      			System.out.println("step133");
      			}
      			else
				{	
					System.out.println("step35");
					bool = false;
				}
			System.out.println("step134");
			}
///*			
//			else
//			{	
				System.out.println("step135");
				bool = false;
//			}
//*/
			System.out.println("step136");
		} // end of while loop
		System.out.println("step137");
		return decide;
	} // end of getDown Function
	
	boolean getDiagonal()
	{
		boolean bool = true;
		empty = 0;
//		location = 0;
		System.out.println("step201");
		while(bool == true)
		{
			System.out.println("step202");
			if( (compArray[0].equals(compArray[4])) || (compArray[4].equals(compArray[8])) || (compArray[0].equals(compArray[8])) )
			{
				System.out.println("step203");
				for(int i = 0; i < 9; i+=4)
      			{
      				System.out.println("step204"); 
	  				if(compArray[i] == "")
	  				{
	  					System.out.println("step205");
	  					empty++;
	  				}
	  				System.out.println("step207");
      			}
      			System.out.println("step208");
      			if(empty == 1)
      			{
      			System.out.println("step209");
      				for(int i = 0; i < 9; i+=4)
      				{
      					System.out.println("step210");
      					if(compArray[i] == "")
      					{
      						System.out.println("step211");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step212");
      				}	
      			}
			System.out.println("step213");
			}
	// removed else if below and just left IF
			if ( (compArray[2].equals(compArray[4])) || (compArray[4].equals(compArray[6])) || (compArray[2].equals(compArray[6])) ) 
			{	
		empty = 0;
				System.out.println("step214");
				for (int i = 2; i < 7; i+=2)
				{
					System.out.println("step215");
					if(compArray[i] == "")
	  				{
	  					System.out.println("step216");
	  					empty++;
	  				}	
	  			System.out.println("step217");
				}
				System.out.println("step218");
				if(empty == 1)
      			{
      			System.out.println("step219");
      				for(int i = 2; i < 7; i+=2)
      				{
      					System.out.println("step220");
      					if(compArray[i] == "")
      					{
      						System.out.println("step221");
      						location = i;
      						decide = true;
      						bool = false;
      					}
      				System.out.println("step222");
      				}	
      			System.out.println("step223");
      			}
      			else
				{		
					System.out.println("step35");
					bool = false;
				}
			System.out.println("step224");
			}
///*
//			else
//			{	
				System.out.println("step235");
				bool = false;
//			}
//*/
			System.out.println("step236");
		}//end of while loop	
		System.out.println("step237");
		return decide;
	} // end of getDown Function
	
	
	
// ------------------------------------------------------------------------------------ \\

   public int decideMove()
   {
      	if(getAcross() == true)
      	{
      		System.out.println("step300");
      		index = location;
      		decide = false;
      	}
      	else if(getDown() == true)
      	{
      		System.out.println("step301");
      		index = location;
      		decide = false;
      	}
      	else if(getDiagonal() == true)
      	{
      		System.out.println("step302");
      		index = location;
      		decide = false;
      	}
      	else
      	{	System.out.println("step500");
			index = compMove();
	   	}
	   	System.out.println("step333");
	   	return index;
   }

   
   public int compMove()
   {
      int position = 0;
      boolean state = true;    
      Random random = new Random();
      int r = random.nextInt(9);
    
      while(state == true)
      {
         if (compArray[r] == "")
         {
	        position = r;
	        compArray[r] = getCompValue();
            state = false;
         }
         r = random.nextInt(9);
      }
      return position;   
   }
   
   public void  setCompValue(String value)
   {
      this.value = value;
   }

   public String getCompValue()
   {
      return value;
   }

   public void updateCompArray(int index, String str)
   {
      this.index = index;
      compArray[index] = str;
   }	
	
	
	
	


}