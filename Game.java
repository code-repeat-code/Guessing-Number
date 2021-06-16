import java.util.Scanner;
import java.lang.Math;
class Game
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  int random_number = 1 + (int)(100*Math.random());// A random number will be generated from 1 to 100 typecasted into int typecasted
	  //14
	  int chances = 5;
	  System.out.println("Guess a number from 1 to 100 within in 5 attempts");
	  while(chances!=0)
	  {
		  System.out.print("Guess a number :: ");
		  int number = sc.nextInt();//24
		  if(number == random_number)
		  {
			  System.out.println("Congratulations! You gussed it right");
			  break;
		  }
		  else if( number > random_number )
		  {
			 System.out.println("The number is less than "+number);
		  }
		  else if (number < random_number)
		  {
			  System.out.println("The number is greater than "+number);
		  }
		  chances--;
	  }
	  if(chances==0)
	  {
		  System.out.println("You loose! the number is "+random_number);
	  }  
  }
}
	  