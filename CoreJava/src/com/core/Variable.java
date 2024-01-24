/*
 * Primitive Data Type
 * 
 * 1. byte - 1	Byte
 * 2. short - 2 Short
 * 3. int - 4 Integer
 * 4. long - 8 Long
 * 5. float - 4 Float
 * 6. double - 8 Double
 * 7. char - 'a', ' ',';' Character
 * 8. boolean - true/false Boolean
 * 
 * Variable : It is a data name & is used to store the data value.
 * int a=10;
 * 
 * 1. Must start with an alphabet
 * 2. Upper case & lower case are significant
 * int a;
 * System.out.println(A);
 * ASCII : American Standard Code For Information Interchange
 * A-Z : 65 to 90
 * a-z : 97 to 122
 * 0-9 : 48 to 57 
 * 3. Keyword is not allowed as a variable name.
 * int Public;
 * 4. Space is Not allowed between variable name.
 * int a_b;
 * 
 * */

package com.core;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		long a,c;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextLong();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
		c=a-b;
		System.out.println("Subtraction : "+c);
		c=a*b;
		System.out.println("Multiplication : "+c);
		c=a/b;
		System.out.println("Division : "+c);
	}
}
