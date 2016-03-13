package com.arminkaric.projectroyale;
import java.util.Scanner;

public class main_output {
//Int's 
	private static int i;
	public static int n;
//Easy Recall 
static main_calculations main = new main_calculations();


	//Methods
		//Menu
	public static void main_menu() throws InterruptedException{
		
		//Selection
		System.out.println("Project Royale");
		System.out.println();
		System.out.println("[1] Chest Prediction");
		System.out.println("[0] Exit");
		Scanner s = new Scanner(System.in);
			System.out.println("Pick a Number:");
		int n = s.nextInt();
		while(i != 70){
			System.out.println();i++;
			}
		//Redirect Chest Prediction
		if(n == 1){
			chstpre();
			}
		//Terminate Program
		if(n == 0){
			System.exit(0);
		}
	}
	
	
	//Director
	public static void main_director() throws InterruptedException{
		//Clear
	while(i != 75){
		System.out.println();i++;
		}
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
			//Clear
		while(i != 75){
			System.out.println();i++;
			}
		System.out.println("Have you skipped a chest?");
		Scanner r = new Scanner(System.in);
		System.out.println("Y/N:");
		String x = r.next();
		
		//Y/N Awnser Decision
			//Yes
		if(x.equals("Y") || x.equals("y")){
			System.exit(0);
		}
			//No
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
