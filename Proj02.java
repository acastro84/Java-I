/* 

This contains both Proj02.java and Proj02Runner.java

To be ran separately in the same folder. 

*/

/*File Proj02.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with methods, variables,
and operators.
**********************************************************/

// Student must not modify the code in this file. //

//Import the required class files from the library.
import java.util.Random;
import java.util.Date;
import java.lang.Math;

//Define the class
class Proj02{
  //Define the main method.
  public static void main(String[] args){ //define main
    //Create a random number generator using a seed based
    // on the current date and time.
    Random generator = new Random(new Date().getTime());
    //Get a random integer. Cast it down to type byte
    // simply to reduce the maximum value. Save the
    // absolute value in a variable of type int.
    int randomNumber = Math.abs((byte)generator.nextInt()); 
    //Print the value of the random number.
    System.out.println(randomNumber);
    //Pass the value of the random number to a static 
    // method named run belonging to the student's class 
    // named Proj02Runner.
    System.out.println(Proj02Runner.run(randomNumber));
  }//end main
}//end class Proj02
//End program specifications


/********************************************************
class Proj02Runner{

  static int run(int valIn){
    //Print a required certification on the 
    // command-line screen.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Armando Castro\n");

    int myVar = valIn;
    System.out.println(myVar);
    myVar = --myVar;
    return myVar;
  }//end run

}//end class Proj02Runner

*/
