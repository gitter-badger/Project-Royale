import java.lang.reflect.Array;
import java.util.Scanner;

public class main_calculations {
	main_output main = new main_output();
	
public String[] chestindex = {
		"Null",
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
		public void ifchestchestskipped(){
			
		}
		
		//if no chest skipped
	 public void chestprediction (){
		System.out.println("Current Wins:");
		Scanner r = new Scanner(System.in);
		int w = r.nextInt();
		System.out.printf("Chest just Recived ", chestindex[w]);
		System.out.println();
		System.out.println("Is this correct?");
		System.out.println("Y/N:");
		Scanner r1 = new Scanner(System.in);
		int x = r1.nextInt();
			//Yes
		if(x == 1){
			int e = w+1;
			int t = w;
			int y = w;
			int u = w;
			while(chestindex[t] != "Gold"){
				t++;
			}
			while(chestindex[y] != "Magic"){
				y++;
			}
			while(chestindex[u] != "Giant"){
				u++;
			}
			System.out.printf("Next Chest is ", chestindex[e]);
			System.out.println();
			System.out.printf("Next Gold Chest ", chestindex[t], " Wins");
			System.out.println();
			System.out.printf("Next Magic Chest ", chestindex[y], " Wins");
			System.out.println();
			System.out.printf("Next Giant Chest ", chestindex[u], " Wins");
			
		}
			//No
		if(x == 0){
			System.exit(0);
		}
	}

}
