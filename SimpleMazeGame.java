public class SimpleMazeGame extends GetData {
	SimpleMazeGame() {
		getMatrix();
		getTrap();
        getPlayer();
        System.out.println("Game Started..\nEnter X anytime to quit game..");
        resetMatrix(n, matrix);
        matrix[x][y] = player;
        push();
        showMatrix(n, matrix);
        displayCommands(player);
        do {
            getCommand();
            boolean tc = startGame(command, matrix, player, n, m, trap);
            if(tc) {
            	for(int i = 0; i < m; i++) {
                	int trappos = trap[i];
                	checkTrap(n, trappos);
                }
                resetMatrix(n, matrix);
                matrix[x][y] = player;
                showMatrix(n, matrix);
                push();
                undoRedo(matrix, player, n);
            }
            else
            	System.out.println("Error: Wrong Command!!");
            if(x==(n-1) && y==(n-1))
                break;
        }while(true);
        System.out.println("Player "+player+" won!!");
        newGame();
	}
	
	public static void main(String args[]) {
		new SimpleMazeGame();
	}	
}