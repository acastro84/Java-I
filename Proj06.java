//Proj06Runner.java   Looks like I am creating a class, 
// Then using that class to create an object from it.
// This object will be created in a different file.  (Proj06.java) 
// In this class, we need a run method that will take an argument, // compare that argument to a switch statement and return the 
// value in the matching case.  

class Proj06Runner extends Proj06 {
	String name;
	String message;
	
	public Proj06Runner(){
		System.out.println("===================");
	}
		
	public String run(String y) {
		String statement;
		statement = "I certify that this program is my own work \n" +
		"and is not the work of others. I agree not \n" +
		"to share my solution with others.";
		//if (y=="certification") {
		return statement;
			
	}
				
	public String run(int num, String s){
		int confirm;
		String name;
		name = "Armando Castro\n";
		//if (s=="name"){
			//confirm = confirm +1;}
		return name;
	}
		
	public byte run(int x) { 
	
		return (byte) (x);
	
	}
}




/*
  
/*File Proj06.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with overloaded methods
and assignment compatibility.
**********************************************************

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;
class Proj06{
  public static void main(String[] args){
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get and save positive random number of type int.
    int valA = Math.abs((generator.nextInt()))/67000 + 1024;
    
    //Instantiate an object from the student's code. Save
    // the reference as the type of the class.
    Proj06Runner obj = new Proj06Runner();

    //Call the run method three times in succession on the
    // object whose reference is stored in the variable
    // named obj. Pass a different argument list to the
    // run method each time it is called. Save the returned
    // values each time the run method is called.
    String valB = obj.run("certificaton");
    String valC = obj.run(1,"name");
    byte valD =   obj.run(valA);

    //Print the original random integer
    System.out.println(valA);
    
    //Print the three values returned from the three calls
    // to the run method.
    System.out.println(valB);
    System.out.println(valC);
    System.out.println(valD);
    
    //Print the original random integer after casting it
    // down to type byte.
    System.out.println((byte)valA);

  }//end main
}//end class Proj06
//End program specifications.

*/
