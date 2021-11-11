package praticeWithJava; ///finding max element of array
import java.util.*;
//import java.awt.SystemColor;
import java.io.*;
public class Pratice 
{
	static ArrayList<Integer>playerPosition=new ArrayList<Integer>();
	static ArrayList<Integer>cpuPosition=new ArrayList<Integer>();
     public static void main(String args[])throws FileNotFoundException
     {
           char [] [] arr= { {' ','|',' ','|',' '}, 
        		             {'-','+','-','+','-'},
        		             {' ','|',' ','|',' '},
        		             {'-','+','-','+','-'}, 
        		             {' ','|',' ','|',' '}};
     
     while(true) 
        { 
    	 
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the place 1to 9");
           int playerPos=sc.nextInt();
           System.out.println(playerPos);
           while(playerPosition.contains(playerPos)|| cpuPosition.contains(playerPosition));{
           System.out.println("Position Taken Plzz Enter Correction Position");
           playerPos=sc.nextInt();
           
           
           
           getValue(arr,playerPos,"players");
           String result = checkWinner();
           if(result.length()>0) {
               System.out.println(result);
               break;
               }

           
           Random rc =new Random();
           int cpuPos=rc.nextInt(9)+1;
           while(playerPosition.contains(cpuPos)|| cpuPosition.contains(cpuPos));{

        	   playerPos=sc.nextInt();
               }
           getValue(arr,cpuPos,"cpu");
           printPattern(arr);
           result = checkWinner();
           if(result.length()>0) {
           System.out.println(result);
           break;
           }
        }
     }
     }
         public static void getValue(char [] [] arr,int pos,String user) {
        	 char symbol = ' ';
        	 if(user.equals("players"))
		        	  {
		        		  symbol='X';
		        		  playerPosition.add(pos);
		        	  }
        	 else if(user.equals("cpu"))
		        	  {
		        		  symbol='o';
		        		  cpuPosition.add(pos);
		        	  }
		        		 
        	 
         switch(pos) {
			         case 1:
					      	     arr[0][0]=symbol;
					      	     break;
			         case 2:
					      	     arr[0][2]=symbol;
					      	     break;
			         case 3:
					      	     arr[0][4]=symbol;
					      	     break;
			         case 4:
					      	     arr[2][0]=symbol;
					      	     break;
			         case 5:
			    	            arr[2][2]=symbol;
			    	            break;
			         case 6:
			    	            arr[2][4]=symbol;
			         	        break;
			         case 7:
			    	            arr[4][0]=symbol;
			    	            break;
			    	 case 8:
			      	            arr[4][2]=symbol;
			      	            break;
			    	 case 9:
			      	            arr[4][4]=symbol;
			      	            break;
			      	default :
			      		   break;
         }
         }

           public static void printPattern(char [] [] arr)
           {
		        	   for(char[] row : arr) 
		               {
		            	   for(char c : row)
		            	   {
		            		   System.out.print(c);
		            	   }  
		            	   System.out.println();
		            	   
		               }
           }
 
           public static String checkWinner() 
           {
        	   List toprow  =Arrays.asList(1,2,3);
        	   List midrow  =Arrays.asList(4,5,6);
        	   List botrow =Arrays.asList(7,8,9);
        	   List leftcal =Arrays.asList(1,4,7);
        	   List midcal  =Arrays.asList(2,5,8);
        	   List rightcal=Arrays.asList(3,6,9);
        	   List oneCross=Arrays.asList(1,5,9);
        	   List twoCross=Arrays.asList(7,5,3);
                
              List<List> winning =new ArrayList<List>();
              winning.add(toprow);
              winning.add(midrow);
              winning.add(botrow); 
              winning.add(leftcal);
              winning.add(midcal);
              winning.add(rightcal);
              winning.add(oneCross);
              winning.add(twoCross); 
              for(List l:winning)
              {
            	  if(playerPosition.containsAll(l))
            	     {
            		     return"You are Winner!!";
            	      }
            	 else if(cpuPosition.containsAll(l))
            		  {
            			  return"Sorry YOU Loss :(";
            		  }
            	 else if(playerPosition.size() + cpuPosition.size()==9)
            	      {
            		      return"CAT!";
            	      } 
              }
              return"";
           }
}    

