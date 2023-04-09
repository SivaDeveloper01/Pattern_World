package Part3;
import java.util.*;
public class Patterndriver {
  static Scanner s=new Scanner(System.in);
	 public static void main(String[]args)throws Exception{
		 Patternmethod ref=new  Patternmethod();
	  System.out.println("\t\t\"WELCOME TO PATTERN PROGRAMM\"" );
	  System.out.println("");
	  System.out.println("WE HAVE FOLLOWING PATTERNS......\n1.BACKWARD DECREASE TRIANGLE\n2.BACKWARD INCREASE TRIANGLE\n3.FORWARD DECREASE TRIANGLE\n4.FORWARD INCREASE TRIANGLE\n5.DIAMOND TRIANGLE\n6.HEART PATTERN\n7.EXIT" );
	  System.out.println("SELECT YOU WANT IT.....");
	  int value=s.nextInt();
	  switch (value)
	  {
	  case 1:{System.out.println("YOUR SELECTED PROGRAAMM IS \"BACKWARD DECREASE TRIANGLE\"");
	          ref.pattern1();
	          break;}
	  case 2:{System.out.println("YOUR SELECTED PROGRAAMM IS \"BACKWARD INCREASE TRIANGLE\"");
	           ref.pattern2();
	          break;}
	  case 3:{System.out.println("YOUR SELECTED PROGRAAMM IS \"FORWARD DECREASE TRIANGLE\"");
	            ref.pattern3();
	  break;}
	  case 4:{System.out.println("YOUR SELECTED PROGRAAMM IS \"FORWARD INCREASE TRIANGLE\"");
	            ref.pattern4();
	         break;}
	  case 5:{System.out.println("YOUR SELECTED PROGRAAMM IS \"DIAMOND TRIANGLE\"");
	          ref.pattern5();
	  break;}
	  case 6:{System.out.println("YOUR SELECTED PROGRAAMM IS \"Heart Shape\"");
      ref.heart();
break;}
	  default:{
		  System.out.println("You choosing Exit Thank You!");
	  }
	  } 
	    System.out.println(" IF YOU CONTINUE TO USE AGAIN THE \"PATTERN APP\" PLEASE PRESS \"1\"");
	           System.out.println();
	            System.out.println(" IF YOU DISCONTINUE TO USE THE  \"PATTERN APP\" PLEASE PRESS \"2\"");
	 		  int P=s.nextInt();
	 	       switch (P)
	 	       {
	 	       case 1: Patterndriver.main(args);
	 		         break;
	 	       default: System.out.println("\t\t<<<<<<<<<\"THANK YOU!\">>>>>>>>>");

	 	              
	 		   }
	 		   }
}
