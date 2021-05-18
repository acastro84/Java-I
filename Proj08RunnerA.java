/*
Proj08.java
Proj08RunnerA.java
Proj08RunnerB.java
Proj08x.java

*/

//Proj08RunnerA  This class file subtracts 1 from an int and then returns that int.


class Proj08RunnerA implements Proj08X {
	private int randomData;
	public Proj08RunnerA(){}
	public Proj08RunnerA(int randomData){
		this.randomData = randomData;
		System.out.println("I certify that this program is my own work \n" +
	    "and is not the work of others. I agree not \n" +
	    "to share my solution with others.");
		System.out.println("Armando");
		
	}//End Constructor
	
	
	
	public int getModifiedData() {
		return randomData  - 1;
	}//End of getModifiedDataB from interface Proj08x
	
	public int getData() {
		return randomData;
	}
	
	public String toString() {
		return (randomData + 5) + "";
	}
	
		
	
}//End Proj07RunnerA definition
	
/*********************************************************************/
/*

//Proj08RunnerB  This class file adds 1 to an int and then returns that int.


class Proj08RunnerB implements Proj08X {
	
	private int randomData;
	public Proj08RunnerB(){}
	public Proj08RunnerB(int randomData){
		this.randomData = randomData;
		System.out.println("Castro");
		
	}//End Constructor
	
	
	public int getModifiedData() {
		return randomData + 1;
	}//End of getModifiedDataA from interface Proj08x
	
	public int getData() {
		return randomData;
	}
	
	public String toString() {
		return (randomData + 5) + "";
	}
	
	
	
}//End Proj07RunnerA definition
	
*/



// This is the first crack at the interface problem.  We will create an
// interface named Proj08X and include 2 methods. One method will be 
// implemented in Proj08RunnerA.java to add one to the int a from 
// Proj08.randomdata.  The other method will be implemented in 
// Proj08RunnerB.java to add one to int b from Proj08.randomdata


interface Proj08X{
	int getModifiedData();
	int getData();
	
}// end interface



/*******************************************************************************************/


/*File Proj08.java
The purpose of this assignment is to assess the student's
ability to write programs involving interfaces.

More specifically, the assignment requires the student
  to understand and to write programs that require the 
  following:
  Create interface definitions
  Implement interfaces in class definitions
  Store references to new objects in elements of an
    array of type Object
  Cast elements to interface types in order to
    invoke interface methods
  Define interface methods in class definition
  Override the toString method
***********************************************************/

/* Student must not modify the code in this file. 

import java.util.*;

class Proj08{
  public static void main(String[] args){

    //Create a random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get a random int value, cast it to type byte, save
    // in a variable of type int, and guaratee that the
    // value in the variable is positive.
    int randomData = (byte)generator.nextInt();
    if(randomData < 0){
      randomData = -randomData;
    }//end if

    //Create a two-element array of type Object
    Object[] var1 = new Object[2];

    //Populate the array with references to new objects
    var1[0] = new Proj08RunnerA(randomData);
    var1[1] = new Proj08RunnerB(randomData);

    //Display four lines of text on the screen.
    System.out.println("randomData = " + randomData);
    
    System.out.print(
             ((Proj08X)var1[0]).getModifiedData() + " ");
    System.out.print(randomData + " ");
    System.out.println(
                   ((Proj08X)var1[1]).getModifiedData());

    System.out.print(((Proj08X)var1[0]).getData() + " ");
    System.out.print(randomData + " ");
    System.out.println(((Proj08X)var1[1]).getData());

    System.out.print(((Proj08X)var1[0]) + " ");
    System.out.print(randomData + 5 + " ");
    System.out.println(((Proj08X)var1[1]));

  }//end main
}//end class Proj08
//End program specifications
*/
