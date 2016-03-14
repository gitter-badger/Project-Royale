
/**
 * Class calculates, and makes predictions about upcoming chests.
 */
package com.arminkaric.projectroyale;

/**
 * @author arminkaric
 *
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class main_calculations {
	int h = 0;
	main_output main = new main_output();
	global g = new global();
	
public String[] chestindex = {
		"NULL",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Magic",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Magic",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Magic",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Silver",
		"Silver",
		"Gold",
		"Silver",
		"Silver",
		"Gold",
		"Silver", 
		//240 Chest Total
	};

//Prediction Functions
	//Calibrates the system if chests have been skipped
		public void ifchestchestskipped(){
			
		}
	
	//No skipped Chest
	 public void chestprediction () throws InterruptedException{
		 g.clear();
			//Win Input
		System.out.println(g.ANSI_YELLOW + "Current Wins:");
		Scanner r = new Scanner(System.in);
		int w = r.nextInt();
			// Confirmation 
		h++;
		System.out.print(g.ANSI_YELLOW+"Chest just Recived "+g.ANSI_RESET);System.out.printf(g.ANSI_RED+chestindex[w]);
		System.out.println();
		System.out.println(g.ANSI_YELLOW+"Y/N:");
		Scanner r1 = new Scanner(System.in);
		String x = r1.next();
			
		if(x.equals("Y") || x.equals("y")){
			//Logic
			int e = w+1;
			int t = w;
			int y = w;
			if(chestindex[w].contains("Gold") == true)
				t++;
			if(chestindex[w].contains("Magic") == true)
				y++;
			while(chestindex[t].contains("Gold") != true){
				//Debug System.out.println("Gold" + chestindex[y]);
				t++;
			}
			while(chestindex[y].contains("Magic")!= true){
				//Debug System.out.println(chestindex[y]);
				y++;
			}
			int gl = t-w;
			int m = y-w;
			//Final Output
			System.out.println("Assuming a chest is never skipped,");
			System.out.printf(g.ANSI_YELLOW+"Next Chest is, ");System.out.printf(g.ANSI_RED+chestindex[e]);
			System.out.println();
			System.out.printf(g.ANSI_YELLOW+"Next Gold Chest is in, ");System.out.print(g.ANSI_RED+gl);System.out.printf(g.ANSI_YELLOW+" Wins ");
			System.out.println();
			System.out.printf(g.ANSI_YELLOW+"Next Magic Chest is in, ");System.out.print(g.ANSI_RED+m);System.out.printf(g.ANSI_YELLOW+" Wins ");
			System.out.println();
			Thread.sleep(10000);
			System.exit(0);
			

			
		}
		
		if(x.equals("N") || x.equals("n")){

			if(h == 1)
				chestprediction();
			if(h == 2)
				main.chstpre();
			if(h == 3){
				g.clear();
				//Confirmation
		System.out.println(g.ANSI_RED+"Are you SURE you typed the correct amount of wins? (You Typed: " + w +")");
		Scanner r11 = new Scanner(System.in);
			System.out.println("Y/N:");
			String x1 = r11.next();
				if(x1.equals("Y") || x1.equals("y")){
						System.out.println(g.ANSI_RED+"Are you SURE you never played a game (and won) W/O a open chest slot?");
					Scanner r111 = new Scanner(System.in);
						System.out.println("Y/N");
						String x11 = r111.next();
								if(x11.equals("Y") || x11.equals("y")){
							System.out.println(g.ANSI_YELLOW+"Please check your infomation once more.");
							chestprediction();
					}
								if(x11.equals("N") || x11.equals("n")){
							System.out.println(g.ANSI_YELLOW+"Please calibrate the system."+g.ANSI_RESET);
							Thread.sleep(3000);
								System.exit(0);
							
							
						}
						
				}
				if(x1.equals("N") || x1.equals("n")){
					System.out.println("Please check your infomation once more.");
					chestprediction();
				}
				
			}
					if( h == 4 ){
						System.out.println("Please calibrate the system.");
						Thread.sleep(3000);
						//ifchestskipped();
							System.exit(0);
					}
						
				
			
		
		
		}
	}


}

