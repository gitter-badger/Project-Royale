import java.util.Scanner;

public class main_output {
//Int's 
	private static int i;
	public static int n;
//Easy Recall 
static main_calculations main = new main_calculations();


	//Methods
		//Menu
	public static void main_menu(){
		
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
	public static void main_director(){
		//Clear Text
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
	
	public static void chstpre() {
		// TODO Auto-generated method stub
		System.out.println("Have you played a game W/O an open chest slot?");
		System.out.println("Y/N:");
		Scanner r = new Scanner(System.in);
		int x = r.nextInt();
		
		//Y/N Awnser Decision
			//Yes
		if(x == 1){
			System.exit(0);
		}
			//No
		if(x == 0){
			main.chestprediction();
		}
		
		
	}


	
	//initialization of methods 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				main_menu();
	}

}
