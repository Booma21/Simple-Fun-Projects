import java.util.Scanner;

public class GetData extends Display {	
	Scanner scan = new Scanner(System.in);
	int[][] matrix;
	int n, m, player;
	String command = "";
	int[] trap;

	void getMatrix() {
		System.out.print("Enter the n value: ");
		n = scan.nextInt();
		matrix = new int[n][n];
	}
	
	void getTrap() {
		do {
            System.out.print("Enter the m value: ");
            m = scan.nextInt();
            if(m < (n * n)-1)
                break;
            else {
                System.out.println("ERROR: Enter value lesser than "+(n*n));
                continue;
            }
        } while(true);
        trap = new int[m];
        int k = 0;
        System.out.println("Note: Trap Position value must be lesser than "+(n*n)+" and greater than 1");
        do{
            System.out.print("Enter Trap Position "+(k+1)+" : "); 
            int a =scan.nextInt();
            if(a < (n * n) && a != 1) {
                trap[k] = a;
                k++;
            } else if(a == 1) 
                System.out.println("Error: Enter value greater than 1");
            else 
                System.out.println("ERROR: Enter value lesser than "+(n*n));
        } while(k < m);
	}
	
	void getPlayer() {
		displayPlayer();
		player = scan.nextInt();
        System.out.println("Player "+player+" selected..");
	}
	
	void getCommand() {
		System.out.print("Enter the command: ");
        command = scan.next();
        if(command.equals("x")) {
        	System.out.println("Game exited..");
        	System.exit(0);
        }
	}
	
	void newGame() {
		String again = "No";
        System.out.print("Would you like to start a new Game? Type Y to start a new Game: ");
        again = scan.next();
        if(again.equals("Y") || again.equals("y")) {
        	new SimpleMazeGame();
        } else {
        	System.out.println("Game exited..");
        	System.exit(0);
        }
	}
}