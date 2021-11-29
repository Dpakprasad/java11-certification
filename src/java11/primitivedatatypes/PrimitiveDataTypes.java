/*
* 8 primitive data types are available in java
* Numeric Data types is classified into 2 ---> Integral data type and floating point data type
* Integral Data Types ---> byte, short, int, long.
* floating point data types ---> float, double
* ---------------------------------------------------------------------
* |data type |      range                |      size      |
* ---------------------------------------------------------------------
* |  byte    | -128 to 127               | 1 byte         |
* |  short   | -32768 to 32767           | 2 bytes        |
* |  int     | -2147486348 to 2147483647 | 4 bytes        |
* |  long    | -2^63 to 2^63-1           | 8 bytes        |
* |  float   | -3.4e38 to 3.4e38         | 4 bytes        |
* |  double  | -1.7e308 to 1.7e308       | 8 bytes        |
* |  boolean | not applicable            | not applicable |
* |  char    | 0 to 65535                | 2 bytes        |
* 
* float data type is used for 5 to 6 decimal place accuracy. 
* double data type is used for 14 to 15 decimal place accuracy.
* 
* There are multiple ways to write integral values ---> decimal, octal, hexa-decimal, binary but floating point values can
* be specified only in the decimal form.
* 
* 
*/

package java11.primitivedatatypes;

public class PrimitiveDataTypes {

	static char c = 65535;

	public static void main(String[] args) {

		// byte b = 128; // Remember: if you try to assign value outside of the range
		// you will get type mismatch error.

		System.out.println("Value in the char c: " + c);

		// If you want more accurate precision, go for double otherwise for 5-6
		// precision go

		// for float

	}

}