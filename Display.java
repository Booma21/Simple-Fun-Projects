public class Display extends MovePlayer {
	void displayPlayer() {
        System.out.println("Player 1: Actions -> Walk\n" +
                    "Player 2: Actions -> Run\n" +
                    "Player 3: Actions -> Walk and Run\n" +
                    "Player 4: Actions -> Run and Jump\n" +  
                    "Player 5: Actions -> Run and Fly\n" + 
                    "Player 6: Actions -> Walk and Jump\n" + 
                    "Player 7: Actions -> Jump and Fly\n" + 
                    "Player 8: Actions -> Walk, Run and Jump");
        System.out.print("Choose a player: ");
    }
	
	void displayCommands(int player) {
        if(player == 1) 
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down");
        else if(player == 2) 
            System.out.println("RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal");
        else if(player == 3) 
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down\n" +
                            "RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal");
        else if(player == 4) 
            System.out.println("RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal\n" +
                            "JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down");
        else if(player == 5)
            System.out.println("RDL -> Run Down Left Diagonal\n" +
                            "RDR -> Run Down Right Diagonal\n" + 
                            "RTL -> Run Top Left Diagonal\n" + 
                            "RTR -> Run Top Left Diagonal\n" +
                            "FDL -> Fly Down Left Diagonal\n" +
                            "FDR -> Fly Down Right Diagonal\n" +
                            "FTL -> Fly Top Left Diagonal\n" +
                            "FTR -> Fly Top Left Diagonal");
        else if(player == 6)
            System.out.println("WL -> walk left\n" +
                            "WR -> walk right\n" +
                            "WU -> walk Up\n" +
                            "WD -> walk Down" +
                            "JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down");
        else if(player == 7)
            System.out.println("JL -> Jump Left\n" +
                            "JR -> Jump Right\n" +
                            "JU -> Jump Up\n" +
                            "JD -> Jump Down\n" +
                            "FDL -> Fly Down Left Diagonal\n" +
                            "FDR -> Fly Down Right Diagonal\n" +
                            "FTL -> Fly Top Left Diagonal\n" +
                            "FTR -> Fly Top Left Diagonal");
        else if(player == 8)
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