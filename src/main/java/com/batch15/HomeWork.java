package com.batch15;

public class HomeWork {

public static void main(String[] args) {
	// TODO Auto-generated method stub

//===============================================	
/* 
 main.java is here HomeWork.java
main method======public static void main(String[] args) 
println method===System.out.println(); 
*/
/*Java Variables- data types
//============================
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
*/
/*Data Type	Size	Description
//=============================
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
*/
	
//================================================
/*  System.out.println("Hello Java");
	 // create a simple program    //run -Hello Java
*/
//------------------------------------------
 /*   String a = "John";//string variable
		    System.out.println(a);  // run-john
*/
//----------------------------------    
/*   int b=10;  //integer variable 
	  System.out.println(b);    //run-10
*/
//--------------------------------------   
 /* int c;   //create a variable without 
                //assigning the value,
        c=4;    //and assign the value later
       System.out.println(c);    //run-4 
 */
//--------------------------------------------
 /*    int d = 15;   //over write an existing variable value
       d = 20;       // myNum d is now 20
       System.out.println(d);	   //run-20 
  */
//--------------------------------------------	
 /*   final int x =12;   //create a final variable
                      //(unchangeable and read only)
          x = 32;    // will generate an error
           System.out.println(x);  //run -error 
 */
//----------------------------------------------
/* String name = "John";    //combine text and a varibale 
                                   //on display
        System.out.println("Hello " + name); 
		                           //run -Hello john
 */
//------------------------------------------------       
/*  String firstName = "John "; //add a variable
        String lastName = "Doe";    //to another variable
        String fullName = firstName + lastName;
        System.out.println(fullName);  
		                          //run-John Doe 
*/
//----------------------------------------------
/* int x = 5, y = 6, z = 50; //with a comma separated list
System.out.println(x + y + z);// declare many variable of same type
	                                  // run-61
*/
//-------------------------------------------------
/* Data types are divided into two group:
//======================================
Primitive data types=includes byte, short, int, 
           long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes;         

Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative(such as 123 or -456),
without decimals. Valid types are byte, short, int and long.
Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, 
containing one or more decimals. There are two types: float and double.
*/
//---------------------------------------------------	
 /*  int myNum = 5;           // integer (whole number)
    float myFloatNum = 5.99f;  // floating point number
    char myLetter = 'D';       // character
    boolean myBool = true;     // boolean
    String myText = "Hello";    // String    
    System.out.println(myNum);      //run=5
    System.out.println(myFloatNum); //run=5.99 
    System.out.println(myLetter);    //run=D
    System.out.println(myBool);       //run=true
    System.out.println(myText);       //run=Hello
 */
//-------------------------------------------------
/*    byte myNum1 = 100;    //create a byte type
	 short myNum2 = 5000;  //-------a short type
	 int myNum3 = 100000;  //-------a int type
	 long myNum4 = 15000000000L; //-a long type
	 float myNum5 = 5.75f;  //------a float type  
	 double myNum6 = 19.99d; //-----a double type                       
	 boolean isJavaFun = true;//----a boolean type
	 boolean isFishTasty = false;    
	                            
	 char myGrade = 'B'; //---------a char type
	 String greeting = "Hello World";//--a String type
	 
	    System.out.println(myNum1);
	    System.out.println(myNum2);
	    System.out.println(myNum3);
	    System.out.println(myNum4);
	    System.out.println(myNum5);
	    System.out.println(myNum6);
	    System.out.println(isJavaFun);
		System.out.println(isFishTasty);  
		System.out.println(myGrade);
		System.out.println(greeting);
*/
//-----------------------------------------
/*  In Java, there are two types of casting:
//===========================================
Widening Casting (automatically)----  
  converting a smaller type to a larger type size
  byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually)------ 
  converting a larger type to a smaller size type
  double -> float -> long -> int -> char -> short -> byte
*/
//---------------------------------------------	
// ====Widening casting
/*  int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0    
  */
  
 //=====Narrowing casting
  /*  double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
   */
//-------------------------------------------------
/*  Java divides the operators into the following groups:
 //=====================================================
	    Arithmetic operators
		Assignment operators
		Comparison operators
		Logical operators
		Bitwise operators
  Arithmetic Operators
  //==================
   Arithmetic operators are used to perform common mathematical operations.

Operator   Name	          Description	                  Example	
  +	    Addition	    Adds together two values	        x + y	
  -	    Subtraction	    Subtracts one value from another	x - y	
  *	    Multiplication	Multiplies two values	            x * y	
  /	    Division	    Divides one value by another	    x / y	
  %	    Modulus	        Returns the division remainder	    x % y	
 ++	    Increment	    Increases the value of a variable by 1	++x	
 --	    Decrement	    Decreases the value of a variable by 1	--x	 	  
*/
//-------------------------------------------------------------------
/*  A list of all assignment operators:
   //==================================
 Operator Example Same As	public static void main(String[] args) 
   =	x = 5	x = 5	    int x = 5; System.out.println(x);
  +=	x += 3	x = x + 3	int x = 5;  x += 3;   run=8
  -=	x -= 3	x = x - 3	int x = 5;  x -= 3;   run=2
  *=	x *= 3	x = x * 3	int x = 5;  x *= 3;   run=15
  /=	x /= 3	x = x / 3	int x = 5;  x /= 3;   run=1.6666666666666667
  %=	x %= 3	x = x % 3	int x = 5;  x %= 3;   run=2
  &=	x &= 3	x = x & 3	int x = 5;  x &= 3;   run=1
  |=	x |= 3	x = x | 3	int x = 5;  x |= 3;   run=7
  ^=	x ^= 3	x = x ^ 3	int x = 5;  x ^= 3;   run=6
  >>=	x >>= 3	x = x >> 3	int x = 5;  x >>= 3;  run=0
  <<=	x <<= 3	x = x << 3	int x = 5;  x <<= 3;  run=40
*/
//-------------------------------------------------	/
/*Comparison operators are used to compare two values:	
 //==================================================
Operator Name	         Example	int x = 5; int y = 3;Try it  System.out.println(x == y); 
 ==	 Equal to	         x == y	  (x == y) // returns false because 5 is not equal to 3
 !=	  Not equal	         x != y	  (x != y);// returns true because 5 is not equal to
  >	Greater than         x > y	  (x > y); // returns true because 5 is greater than 3
  <	Less than	         x < y	  (x < y); // returns false because 5 is not less than 3
  >=Greater than equal to x >= y  (x >= y);// returns true because 5 is greater, or equal, to 3
  <=Less than or equal to x <= y  (x <= y);// returns false because 5 is neither less than or equal to 3
*/
//-------------------------------------------------------------------------	
/*Logical operators are used to determine the logic between variables or values:
 //======================================================
Operator	Name	Description	Example	
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        int x = 5; System.out.println(x > 3 && x < 10);
        // returns true because 5 is greater than 3 AND 5 is less than 10	

|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        int x = 5; System.out.println(x > 3 || x < 4); 
        // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)	

!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	
        int x = 5; System.out.println(!(x > 3 && x < 10)); 
        // returns false because ! (not) is used to reverse the result	
*/	
	/*	int x = 6;        
    int y = 2;
    System.out.println(x + y); // addition operator   run=8
    System.out.println(x - y); //subtraction operator  run=4
    System.out.println(x * y); // multiplication operator run=12                    
    System.out.println(x / y); //division operator    run=3
    System.out.println(x % y); //modulus operator   run=0
    System.out.println(x);     // assignment operator  run=6
    System.out.println(x == y); // comparison operator   run=false
    // returns false because 6 is not equal to 2
    System.out.println(x > 3 && x < 10); //logical operator
    // returns true because 6 is greater than 2 AND 5 is less than 10
    
    int z = 5;  //increment
    ++z;
    System.out.println(z);  // run=6
    
    int m= 5;   //decrement
    --m;                
    System.out.println(m);  //run=4
*/    
//-------------------------------------
/*	    int x = 100 + 50;
	    System.out.println(x);// run-150
	    int sum1 = 100 + 50;
	    int sum2 = sum1 + 250;
	    int sum3 = sum2 + sum2;
	    System.out.println(sum1);//run-150
	    System.out.println(sum2);//run-400
	    System.out.println(sum3); //run-400 
*/	    
//--------------------------------------------	
	
/*	String greeting = "create a string";
    System.out.println(greeting);//run-create a string
	
    String txt1 = "quotes inside a string";//run-quotes inside a string
    String txt2 = "That's great";//run-That's great
    System.out.println(txt1);
    System.out.println(txt2);
	
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
     // run-The length of the txt string is: 26
    
    String txt3 = "Hello World";
    System.out.println(txt3.toUpperCase());//run-HELLO WORLD
    System.out.println(txt3.toLowerCase());//run-hello world
       //using methods to convert strings to uppercase and lowercase
    
    String txt4 = "find a string in a string!";//find a string in a string
    System.out.println(txt4.indexOf("string"));// run 7

    String firstName = "string";  //run-string concatenation
    String lastName = "concatenation";
    System.out.println(firstName + " " + lastName);
   
    String x = "10";//if u ad a number and a string
    int y = 20;  //the result will be a string concatenation
    String z = x + y;
    System.out.println(z);//run-1020
  */   
 //--------------------------------------------------
/* System.out.println(Math.max(5, 10)); //run= 10
	 System.out.println(Math.min(5, 10));//run=5
	 System.out.println(Math.sqrt(64));//run=8.0
	 System.out.println(Math.abs(-4.7));//run= 4.7 absolute (positive)
	 System.out.println(Math.random()); //run=0.8549133138811146 any value in condition
	 
	 int randomNum = (int)(Math.random() * 101);  // 0 to 100
	    System.out.println(randomNum); //run =77 any value in condition
*/
//---------------------------------------------------
/*	//Java Booleans
	//==============
	//create a boolean type
    
    boolean isJavaFun = true;//run=true
    boolean isFishTasty = false;//run=false 
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
	
    //find out if an expression is true or false
    int x = 10;
    int y = 9;
    System.out.println(x > y); //run=true
    // returns true, because 10 is higher than 9  
	
    //use the equal to operator to evaluate a boolean expression
    int x1 = 10;
    System.out.println(x1 == 10); //run=true
    // returns true, because the value of x is equal to 10
 */
//---------------------------------------------


}
		}


//------------------------------------------------
      /* public static void main(String[] args) {
        
          System.out.println("hello Java");
        
          HomeWork abc = new  HomeWork();// create object for non static method
            abc.catMethod();
             dogMethod(); 
          }
             void catMethod() {  // non static method
            System.out.println("cat");

          }
             static void dogMethod() { //static method
	        System.out.println("dog");         
           }	

          }*/

	





