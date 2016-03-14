/**
 * Class handles the Main menu, and directs the user.
 */
package com.arminkaric.projectroyale;

/**
 * @author arminkaric
 *
 */
import java.util.Scanner;
import com.arminkaric.projectroyale.global;
public class main_output {
	private static int i;
	public static int n;
static main_calculations main = new main_calculations();
static global g = new global();


	//Functions
		//Menu
	public static void main_menu() throws InterruptedException{
		g.clear();
		//Selection
		System.out.println("Project Royale");
		System.out.println();
		System.out.println(g.ANSI_PURPLE+"[1]"+g.ANSI_YELLOW +"Chest Prediction");
		System.out.println(g.ANSI_PURPLE+"[0] Exit");
		Scanner s = new Scanner(System.in);
			System.out.println("Pick a Number:");
		int n = s.nextInt();
		g.clear();
		//Redirect Chest Prediction
		if(n == 1){
			chstpre();
			}
		//Terminate Program
		if(n == 0){
			System.exit(0);
		}
	}
	
	
	//Directs User
	public static void main_direct() throws InterruptedException{
		g.clear();
	//Redirect Chest Prediction
	if(n == 1){
		chstpre();
		}
	//Terminate Program
	if(n == 0){
		System.exit(0);
	}
}
	
	public static void chstpre() throws InterruptedException {
		// TODO Auto-generated method stub
		g.clear();
		System.out.println(g.ANSI_RED+"Have you skipped a chest?");
		Scanner r = new Scanner(System.in);
		System.out.println("Y/N:");
		String x = r.next();
		
		if(x.equals("Y") || x.equals("y")){
			//Placeholder
			System.exit(0);
		}
		
		if(x.equals("N") || x.equals("n")){
			main.chestprediction();
		}
		else
			r.next();
		
		
	}


	
	//initialization of methods 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				main_menu();
	}

}
