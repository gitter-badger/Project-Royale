/**
 * This class was created to hold methods, int's, etc. that all classes would use.
 */
package com.arminkaric.projectroyale;

/**
 * @author arminkaric
 *
 */

public class global {
	//Objects
		//Colored output Framework
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
//Methods
	//Clears all text
	public void clear(){
		int i = 0;
		while(i != 75){
			System.out.println();i++;
			}
	}
	
}
	


