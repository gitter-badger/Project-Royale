import java.util.Scanner;

public class main_output {
//Methods
	//Menu
	private static int i;
	public static int n;


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
		String x = r.next();
		
		//Y/N Awnser Decision
		if(x == "Y" || x == "y"){
			System.exit(0);
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Init Methods
				main_menu();
	}

}
