/*
 * 2 types of type casting :- Implicit and Explicit type casting.
 * 
 * Implicit type casting (Automatic) :--> When we assign smaller sized data type value to bigger sized data type value, 
 * the required conversion is automatically done by the compiler.
 * 
 * Explicit type casting (Manual) :--> To avoid loss of information, implicit type casting is not allowed when storing 
 * bigger sized data type to smaller sized data type.
 * 
 * 
 */
package java11.primitivedatatypes;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int x = 'a'; // here we assigning char data type to int data type (2 bytes to 4 bytes)
		System.out.println(x); // returns 97
		
		double d = 10; // assigning int data type to double (4 bytes to 8 bytes)
		System.out.println(d); //10.0
		
		float f = 10L;
		
		byte b = (byte)130; // Explicit type casting.
		System.out.println(b);
	}
}
