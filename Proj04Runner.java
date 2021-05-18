/* File Proj03Runner
This is skeleton code for Proj03. It will compile and
run, but it won't meet the assignment specifications.
*****************************************************/

class Proj03Runner{

  static double run(byte[] byteArray){
    //Print a required certification on the 
    // command-line screen.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Armando Castro\n");

    //Insert code to get and display the length of the array
    
     int sizeOfArray = byteArray.length;

    //Print the length of the array from Proj03.java
    System.out.println(
      "Array length = " +sizeOfArray);



    //Insert code to get and display the value in the 
    // last element in the array.
    System.out.println("Value in the last element = " +
    byteArray[byteArray.length - 1]);

    //Insert code to determine and display whether the
    // last element in the array is odd or even.
    

    double val = byteArray[byteArray.length - 1];
    if(val % 2 == 0){
      System.out.println("The value in the last element is Even");
    }else{
      System.out.println("The value in the last element is Odd");
    }


    System.out.println("Begin loop at index = 0");
    System.out.println("End loop at index = 99");
    

    double sum = 0;    
    //Insert code to compute and display the sum of all the
    // values stored in the array as type double.
    for(int cnt = 0; cnt < byteArray.length ; cnt++)
    sum = (sum + byteArray[cnt]);

    System.out.println("The sum is " + sum);


    
    double avg = 9999;
    //Insert code to compute and display the average of all
    // the values in the array.
    
    avg = (sum / byteArray.length);
    return avg;

  }//end run method

}//end class Proj03Runner


/*
/*File Proj04.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with the String and
StringBuffer classes.
*********************************************************

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;
class Proj04{
  public static void main(String[] args){ //define main
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get a random number of type int. Cast it down to
    // type byte simply to reduce the maximum value.
    // Store it in a variable named val of type byte.
    byte val = (byte)(generator.nextInt());
    
    //Create a String object and display it. Use 
    // string concatenation to convert the value to
    // a String and concatenate it to the characters
    // shown in the quotation marks.
    String stringVal = "Random byte value = " + val;
    System.out.println(stringVal);
    
    //Pass the String object to the student's method
    // named run and save the returned value in a
    // variable named result of type StringBuffer.
    StringBuffer result = Proj04Runner.run(stringVal);
    
    //Display the value returned from the student's code.
    // Note that it must include a period followed by
    // a space and the student's name.
    System.out.println(result);

  }//end main
}//end class Proj04
//End program specifications

*/
