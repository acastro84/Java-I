/* File Proj10Runner
Student must update this file to cause the program
to meet the assignment specifications. Student must
1. Insert his or her name where indicated.
2. Modify only one other physical line of code.
*****************************************************/

class Proj10Runner {

  String var = 
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.";

  //================================================//
  Proj10Runner(){
    System.out.print("My name is ");
    System.out.println(
      "Armando Castro");
    System.out.print("and ");
	
  }// end constructor
  //================================================//
  
  String run(String var){
    return this.var;
  }//end run method
  
}//end class Proj10Runner

/******************************************************
/*File Proj10.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with the this and
super keywords.
**********************************************************

// Student must not modify the code in this file. //

class Proj10{
  public static void main(String[] args){

    Proj10Runner obj = new Proj10Runner();

    System.out.println(obj.run("Hello World"));

  }//end main
}//end class Proj10
//End program specifications.
*/
