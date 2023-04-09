package Part3;
import java.util.*;
public class Patternmethod {
 public	Patternmethod(){
		 
	 }
static Scanner s=new Scanner(System.in);

 static void pattern1()throws Exception
	{   System.out.println("SET YOUR \"N\" RANGE...");
	   System.out.println();
	  System.out.println(" (NOTE:YOUR  SET \"N\" RANGE IS MUST BE ODD NUMBER)");
          int sk=s.nextInt();
		for (int i=0;i<sk;i++)
		{	
		 for (int j=0;j<sk;j++)
			{
			Thread.sleep(50);
		 if (i<=j)
			System.out.print("* ");
          else 
			System.out.print("  ");
			}
		System.out.println();
		}
	}
	static void pattern2()throws Exception
	{    System.out.println("SET YOUR \"N\" RANGE...");
	  System.out.println();
	  System.out.println(" (NOTE:YOUR  SET \"N\" RANGE IS MUST BE ODD NUMBER)");
          int fd=s.nextInt();
		for (int i=0;i<fd;i++)
		{	
		 for (int j=0;j<fd;j++)
			{ 
			Thread.sleep(50);
		 if(i>=j)
	        System.out.print("* ");               
		 else 
		    System.out.print("  ");
		}
		System.out.println();
		}
	}
	static void pattern3()throws Exception
    {    System.out.println("SET YOUR \"N\" RANGE...");
	    System.out.println();
	  System.out.println(" (NOTE:YOUR  SET \"N\" RANGE IS MUST BE ODD NUMBER)");
          int gh=s.nextInt();
		for (int i=0;i<gh;i++)
		{	
		 for (int j=0;j<gh;j++)
			{ 
			Thread.sleep(50);

		 if(i+j>=gh-1)

	   System.out.print("* ");               

			else 
			System.out.print("  ");
				
			}
			System.out.println();
		}
    }
	static void pattern4()throws Exception
	{     System.out.println("SET YOUR \"N\" RANGE...");
	      System.out.println();
	  System.out.println(" (NOTE:YOUR  SET \"N\" RANGE IS MUST BE ODD NUMBER)");
          int hc=s.nextInt();
		for (int i=0;i<hc;i++)
		{	
		 for (int j=0;j<hc;j++)
			{ 
			Thread.sleep(50);

		 if(i+j<=hc-1)

	   System.out.print("* ");               

			else 
			System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	static void pattern5()throws Exception
	{    System.out.println("SET YOUR \"N\" RANGE...");
	     System.out.println();
	  System.out.println(" (NOTE:YOUR  SET \"N\" RANGE IS MUST BE ODD NUMBER)");
          int km=s.nextInt();
		for (int i=0;i<km;i++)
		{	
		 for (int j=0;j<km;j++)
			{ 
			Thread.sleep(50);

           if((i+j>=km-1+km/2) || (i+j<=km-1-km/2) ||(i<=j-km/2) || (i>=j+km/2))
		    System.out.print("* ");               

			else 
			System.out.print("  ");
				
			}
			System.out.println();
		}
	}

	 
    // main() method start  
    public static void heart() {  
      Scanner s=new Scanner(System.in);
        // declare and initialize variable for output size  
        final int size = 8;  
      
       final String msg ="I Love India";  
          
        // nested for loop to print the upper part of Heart  
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 4 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                    System.out.print('*');  
                } else {  
                    System.out.print(' ');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
          
        // for loop to print the lower part of Heart  
        for (int m = 1; m <= 2 * size; m++) {  
            for (int n = 0; n < m; n++) {  
                System.out.print(' ');  
            }  
   
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                if (m >= 2 && m <= 4) {  
                    int position = n - (4 * size - 2 * m - msg.length()) / 2;  
                    if (position < msg.length() && position >= 0) {  
                        if (m == 3) {  
                            System.out.print(msg.charAt(position));  
                        } else {  
                            System.out.print(' ');  
                        }  
                    }  
                    else {  
                        System.out.print('*');  
                    }  
                }  
                else {  
                    System.out.print('*');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        } 
    }
    public static void heart(int num) {  
	      
        // declare and initialize variable for output size  
         int size = num;  
        final String msg = "Thank you";  
          
        // nested for loop to print the upper part of Heart  
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 4 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                    System.out.print('*');  
                } else {  
                    System.out.print(' ');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
          
        // for loop to print the lower part of Heart  
        for (int m = 1; m <= 2 * size; m++) {  
            for (int n = 0; n < m; n++) {  
                System.out.print(' ');  
            }  
   
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                if (m >= 2 && m <= 4) {  
                    int position = n - (4 * size - 2 * m - msg.length()) / 2;  
                    if (position < msg.length() && position >= 0) {  
                        if (m == 3) {  
                            System.out.print(msg.charAt(position));  
                        } else {  
                            System.out.print(' ');  
                        }  
                    }  
                    else {  
                        System.out.print('*');  
                    }  
                }  
                else {  
                    System.out.print('*');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
    }
   
}
	


 


 




 
	
  

