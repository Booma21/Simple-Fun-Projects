import java.util.Scanner;

public class MovePlayer extends Constraints {
	int capacity = 1000, xtop = -1, ytop = -1, x = 0, y = 0;
	int x1[] = new int[1000];
	int y1[] = new int[1000];
	Scanner scan = new Scanner(System.in);
	
	void push() {
		x1[++xtop] = x;
		y1[++ytop] = y;
	}
    
    boolean movePlayer(int n, String command, int player) {
    	if(player == 1 || player == 3 || player == 6 || player == 8) {
    		if(command.equals("WL")) {
    			if(y == 0)
    				System.out.println("End of path!! Left Movement not possible..");
    			else
    				y--;
    			return true;
    		}
    		if(command.equals("WR")) {
    			if(y == n-1)
    				System.out.println("End of path!! Right Movement not possible..");
    			else
    				y++;
    			return true;
    		}
    		if(command.equals("WU")) {
    			if(x == 0)
    				System.out.println("End of path!! Up Movement not possible..");
    			else
    				x--;
    			return true;
    		}
    		if(command.equals("WD")) {
    			if(x == n-1)
    				System.out.println("End of path!! Down Movement not possible..");
    			else
    				x++;
    			return true;
    		}
    	}
    	if(player == 2 || player == 3 || player == 5 || player == 8) {
    		if(command.equals("RDL")) {
    			if(x < n && y == 0)
    				System.out.println("End of path!! Run Down Left Movement not possible..");
    			else if(x == n && y < n)
    				System.out.println("End of path!! Run Down Left Movement not possible..");
    			else{
    				x++;
    				y--;
    			}
    			return true;
    		}
    		if(command.equals("RDR")) {
    			if(x < n && y == (n - 1))
    				System.out.println("End of path!! Run Down Left Movement not possible..");
    			else if(x == (n - 1) && y < n)
    				System.out.println("End of path!! Run Down Left Movement not possible..");
    			else{
    				x++;
    				y++;
    			}
    			return true;
    		}
    		if(command.equals("RTL")) {
    			if(x == 0 && y < n)
    				System.out.println("End of path!! Run Top Left Movement not possible..");
    			else if(x < n && y == 0)
    				System.out.println("End of path!! Run Top Left Movement not possible..");
    			else{
    				x--;
    				y--;
    			}
    			return true;
    		}
    		if(command.equals("RTR")) {
    			if(x == 0 && y < (n-1))
    				System.out.println("End of path!! Run Top Right Movement not possible..");
    			else if(x < n && y == (n-1))
    				System.out.println("End of path!! Run Top Right Movement not possible..");
    			else{
    				x--;
    				y++;
    			}
    			return true;
    		} 
    	}
    	if(player == 4 || player == 6 || player == 7 || player == 8) {
    		if(command.equals("JL")) {
    			if(y <= 1)
    				System.out.println("End of path!! Jump Left Movement not possible..");
    			else
    				y = y - 2;
    			return true;
    		}
        	if(command.equals("JR")) {
        		if(y >= n-2)
        			System.out.println("End of path!! Jump Right Movement not possible..");
        		else
        			y = y + 2;
        		return true;
        	}
        	if(command.equals("JU")) {
        		if(x <= 1)
        			System.out.println("End of path!! Jump Up Movement not possible..");
        		else
        			x = x - 2;
        		return true;
        	}
        	if(command.equals("JD")) {
        		if(x >= n-2)
        			System.out.println("End of path!! Jump Down Movement not possible..");
        		else
        			x = x + 2;
        		return true;
        	}
    	}
    	if(player == 5 || player == 7) {
    		if(command.equals("FDL")) {
    			if(x >= (n-2) && y <= 1)
    				System.out.println("End of path!! Fly Down Left Movement not possible..");
    			else{
    				x = x + 2;
    				y = y - 2;
    			}
    			return true;
    		}
    		if(command.equals("FDR")) {
    			if(x >= (n-2) && y >= (n-2))
    				System.out.println("End of path!! Fly Down Right Movement not possible..");
    			else{
    				x = x + 2;
    				y = y + 2;
    			}
    			return true;
    		}
    		if(command.equals("FTL")) {
    			if(x >= 1 && y <= 1)
    				System.out.println("End of path!! Fly Top Left Movement not possible..");
    			else{
    				x = x - 2;
    				y = y - 2;
    			}
    			return true;
    		}
    		if(command.equals("FTR")) {
    			if(x >= 1 && y >= (n-2))
    				System.out.println("End of path!! Fly Top Right Movement not possible..");
    			else{
    				x = x - 2;
    				y = y + 2;
    			}
    			return true;
    		}
    	} 
    	return false;
    }
    
    void resetMatrix(int n, int matrix[][]) {
    	for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                matrix[i][j] = 0;
    }
    
    void showMatrix(int n, int matrix[][]) {
    	for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }

    void undo(int n, int matrix[][], int player) {  
    	if(x1[xtop] == 0 && y1[ytop] == 0)
    		System.out.println("Undo Not Possible!!");
    	else
    		if(xtop == 0) {
    			x = 0;
    			y = 0;
    			xtop = 0;
    			ytop = 0;
    			x1[xtop] = 0;
    			y1[ytop] = 0;
    			resetMatrix(n, matrix);
    			matrix[x][y] = player;
    			showMatrix(n, matrix);
    		} else if(xtop > 0) {
    			xtop--;
    			ytop--;
    			x = x1[xtop];
    			y = y1[ytop];
    			resetMatrix(n, matrix);
    			matrix[x][y] = player;
    			showMatrix(n, matrix);
    		} 	    	
    }
    
    void redo(int n, int matrix[][], int player) {
    	xtop++;
		ytop++;
    	if(x1[xtop] == 0 && y1[ytop] == 0) {
    		xtop--;
			ytop--;
    		System.out.println("Redo Not Possible!!");
    	} else {
    		x = x1[xtop];
    		y = y1[ytop];
    		resetMatrix(n, matrix);
    		matrix[x][y] = player;
    		showMatrix(n, matrix);
    	}
    }
    
    void checkTrap(int n, int trappos) {
        int z = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                z++;
                if(z == trappos) 
                    if(i == x && j == y) {
                        System.out.println("Caught on a trap!!");
                        x = (int)(Math.random()*((n-1)-0+1)+0);
                        y = (int)(Math.random()*((n-1)-0+1)+0);
                        break;
                    }
            }
    }
    
    void undoRedo(int matrix[][], int player, int n) {
    	String ur = "";
        System.out.print("Enter U to Undo / R to redo: ");
        ur = scan.next();
        if(ur == "x") {
        	System.out.println("Game exited..");
        	System.exit(0);
        }
        while(ur.equals("U") || ur.equals("u") || ur.equals("R") || ur.equals("r")) {
        	if(ur.equals("U") || ur.equals("u"))
        		undo(n, matrix, player);
        	else if(ur.equals("R") || ur.equals("r"))
        		redo(n, matrix, player);
        	System.out.print("Enter U to Undo / R to redo: ");
        	ur = scan.next();
        }
    }
    
    boolean startGame(String command, int matrix[][], int player, int n, int m, int trap[]) {
    	return movePlayer(n, command, player);
    }    
}