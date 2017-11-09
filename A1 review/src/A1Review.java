/********************************************************************
 * Programmer:	Bedi
 * Class:  CS20S
 *
 * Assignment: Ax Qy
 * Program Name:  name of public class
 *
 * Description: brief description of program
 *
 * Input: data to be input
 *
 * Output: base 2 number to base 10 numbers
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class A1Review {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
        final int ASCII = 48;
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
   	String tabSpace = "      ";	// six spaces
        
        int X;
        int Y; 
        int Z;
        
        
    	
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	BufferedReader fin = new BufferedReader(new FileReader("Data.txt"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		Bedi");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:	A1 review");
    	System.out.println("*******************************************");

    /*  bannerOut = "*******************************************\n";
    	bannerOut += "Name:		Bedi\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	Ax Qy\n";
    	bannerOut += "*******************************************\n\n";
    	
    	fout.println("*******************************************");
    	fout.println("Name:		Bedi");
    	fout.println("Class:		CS30S");
    	fout.println("Assignment:	Ax Qy");
    	fout.println("*******************************************");
 	    	
    // ************************ get input **********************

    /*	prompt = "Enter your prompt text here. \n";	
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";
    
    	
    	strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
    */
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
    	//String[] tokens = strin.split(delim);
    	

    // ************************ processing *************************** 
        
        strin = fin.readLine();  
        
        while (strin !=null ) {      // start of while loop
            Z=0; 
            Y=15;
            
            
            
            for  (int count =0; count <15; count++) { // start of  for loop
                X = 0;
                
                X = strin.charAt(count) - ASCII;
                Z += X * Math.pow(2,Y);
                
                Y--;
            }
            fout.println("%n% The base 2 number is " +strin);
            System.out.println("\nThe base 2 number is " + strin);
            
            System.out.println(Z);
            strin= fin.readLine();
                    }
    
    // ************************ print output ****************************

    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
