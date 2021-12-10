import java.util.*;

class SimpleMazeGame {
    
    public static int x = 0;
    public static int y = 0;
    
    public static int playerSelect() {
        System.out.println("Player 1: Actions -> Walk\n" +
                    "Player 2: Actions -> Run\n" +
                    "Player 3: Actions -> Walk and Run\n" +
                    "Player 4: Actions -> Run and Jump\n" +  
                    "Player 5: Actions -> Run and Fly\n" + 
                    "Player 6: Actions -> Walk and Jump\n" + 
                    "Player 7: Actions -> Jump and Fly\n" + 
                    "Player 8: Actions -> Walk, Run and Jump");
        System.out.print("Choose a player: ");
        Scanner scan = new Scanner(System.in);
        int player = scan.nextInt();
        return player;
    }
    
    public static void commands(int player) {
        if(player == 1) {
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down");
        } else if(player == 2) {
            System.out.println("RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal");
        } else if(player == 3) {
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down\n" +
                            "RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal");
        } else if(player == 4) {
            System.out.println("RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal\n" +
                            "JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down");
        } else if(player == 5) {
            System.out.println("RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal\n" +
                            "FDL -> Fly Down Left Diagonal\n" +
                            "FDR -> Fly Down Right Diagonal\n" +
                            "FTL -> Fly Top Left Diagonal\n" +
                            "FTR -> Fly Top Left Diagonal");
        } else if(player == 6) {
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down" +
                            "JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down");
        } else if(player == 7) {
            System.out.println("JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down\n" +
                            "FDL -> Fly Down Left Diagonal\n" +
                            "FDR -> Fly Down Right Diagonal\n" +
                            "FTL -> Fly Top Left Diagonal\n" +
                            "FTR -> Fly Top Left Diagonal");
        } else if(player == 8) {
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down\n" +
                            "RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal\n" +
                            "JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down");
        }
    }
    
    public static void movePlayer(int n, String command) {
        if(command.equals("WL")) {
            if(y == 0)
                System.out.println("End of path!! Left Movement not possible..");
            else
                y--;
        }
        if(command.equals("WR")) {
            if(y == n-1)
                System.out.println("End of path!! Right Movement not possible..");
            else
                y++;
        }
        if(command.equals("WU")) {
            if(x == 0)
                System.out.println("End of path!! Up Movement not possible..");
            else
                x--;
        }
        if(command.equals("WD")) {
            if(x == n-1)
                System.out.println("End of path!! Down Movement not possible..");
            else
                x++;
        }
        if(command.equals("RDL")) {
            if(x == (n-1) && y == 0)
                System.out.println("End of path!! Run Down Left Movement not possible..");
            else{
                x++;
                y--;
            }
        }
        if(command.equals("RDR")) {
            if(x == (n-1) && y == (n-1))
                System.out.println("End of path!! Run Down Left Movement not possible..");
            else{
                x++;
                y++;
            }
        }
        if(command.equals("RTL")) {
            if(x == 0 && y == 0)
                System.out.println("End of path!! Run Top Left Movement not possible..");
            else{
                x--;
                y--;
            }
        }
        if(command.equals("RTR")) {
            if(x == 0 && y == (n-1))
                System.out.println("End of path!! Run Top Right Movement not possible..");
            else{
                x--;
                y++;
            }
        }
        if(command.equals("JL")) {
            if(y <= 1)
                System.out.println("End of path!! Jump Left Movement not possible..");
            else
                y = y - 2;
        }
        if(command.equals("JR")) {
            if(y >= n-2)
                System.out.println("End of path!! Jump Right Movement not possible..");
            else
                y = y + 2;
        }
        if(command.equals("JU")) {
            if(x <= 1)
                System.out.println("End of path!! Jump Up Movement not possible..");
            else
                x = x - 2;
        }
        if(command.equals("JD")) {
            if(x >= n-2)
                System.out.println("End of path!! Jump Down Movement not possible..");
            else
                x = x + 2;
        }
        if(command.equals("FDL")) {
            if(x >= (n-2) && y <= 1)
                System.out.println("End of path!! Fly Down Left Movement not possible..");
            else{
                x = x + 2;
                y = y - 2;
            }
        }
        if(command.equals("FDR")) {
            if(x >= (n-2) && y >= (n-2))
                System.out.println("End of path!! Fly Down Right Movement not possible..");
            else{
                x = x + 2;
                y = y + 2;
            }
        }
        if(command.equals("FTL")) {
            if(x >= 1 && y <= 1)
                System.out.println("End of path!! Fly Top Left Movement not possible..");
            else{
                x = x - 2;
                y = y - 2;
            }
        }
        if(command.equals("FTR")) {
            if(x >= 1 && y >= (n-2))
                System.out.println("End of path!! Fly Top Right Movement not possible..");
            else{
                x = x - 2;
                y = y + 2;
            }
        }
    }
    
    public static void checkTrap(int n, int trappos) {
        int i, j;
        int z = 0;
        for (i = 0; i < n; i++){ 
            for (j = 0; j < n; j++) {
                z++;
                if(z == trappos) {
                    if(i == x && j == y) {
                        System.out.println("Caught on a trap!!");
                        x = (int)(Math.random()*((n-1)-0+1)+0);
                        y = (int)(Math.random()*((n-1)-0+1)+0);
                        break;
                    }
                }
            }
        }
    }
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        int m;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                matrix[i][j] = 0;
        do {
            System.out.print("Enter the m value: ");
            m = scan.nextInt();
            if(m < (n * n)-1)
                break;
            else {
                System.out.println("ERROR: Enter value lesser than "+(n*n));
                continue;
            }
        }while(true);
        int[] trap = new int[m];
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
                System.out.print("ERROR: Enter value lesser than "+(n*n));
        } while(k < m);
        int player = playerSelect();
        System.out.println("Player "+player+" selected..");
        System.out.println("Game Started..");
        matrix[x][y] = player;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
        commands(player);
        do {
            System.out.print("Enter the command: ");
            String command = scan.next();
            if(command.equals("WL") || command.equals("WR") || command.equals("WU") || command.equals("WD") || 
                command.equals("RDL") || command.equals("RDR") || command.equals("RTL") || command.equals("RTR") || 
                command.equals("JL") || command.equals("JR") || command.equals("JU") || command.equals("JD") || 
                command.equals("FDL") || command.equals("FDR") || command.equals("FTL") || command.equals("FTR")) {
                int x1 = x;
                int y1 = y;
                movePlayer(n, command);
                for(int i = 0; i < m; i++) {
                    int trappos = trap[i];
                    checkTrap(n, trappos);
                }
                for (int i = 0; i < n; i++) 
                    for (int j = 0; j < n; j++) 
                        matrix[i][j] = 0;
                matrix[x][y] = player;
                for(int i = 0; i<n; i++){
                    for(int j = 0; j<n; j++)
                        System.out.print(matrix[i][j]);
                    System.out.println();
                }
                if(x==(n-1) && y==(n-1))
                    break;
                System.out.print("Enter 1 to undo: ");
                int undo = 2;
                undo = scan.nextInt();
                if(undo == 1) {
                    x = x1;
                    y = y1;
                    for (int i = 0; i < n; i++) 
                        for (int j = 0; j < n; j++) 
                            matrix[i][j] = 0;
                    matrix[x][y] = player;
                    for(int i = 0; i<n; i++){
                        for(int j = 0; j<n; j++)
                            System.out.print(matrix[i][j]);
                        System.out.println();
                    }
                }
            }
            else{
                System.out.println("ERROR: Wrong Command..");
                continue;
            }
        }while(true);
        System.out.println("Player "+player+" won!!");
    }
}