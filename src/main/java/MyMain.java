public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col] == true){
             System.out.println("There was a hit!");
        }
        else {
             System.out.println("You missed a boat!"); }
        
             return board[row][col];
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if (direction == "down"){
            for (int i = 0; i <= boatLength; i++) {
			    board[i][col] = true;
		    }
            return board;
        }
        if (direction == "right"){
            for (int j = 0; j < boatLength; j++) {
			    board[row][j] = true;
		    }
            return board;
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        int longestInRow = 0;
        int lowChar = 'a';
        for (int row = 0; row < words.length; row++){
            for (int col = 0; col < words[0].length; col++){
                String word = words[row][col];
                    if (word.charAt(0) >= lowChar && word.length() >= longestInRow)
                        { longestInRow = word.length();
                        lowChar = word.charAt(0);
                }
                else {return false;}
            }
            longestInRow = 0;
             lowChar = 'a';
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[][] battleship = { {false, false, false, false, false, false},
                            {false, false, false, false, false, false},
                            {false, false, false, false, false, false},
                            {false, false, false, false, false, false},
                            {false, false, false, false, false, false},
                            {false, false, false, false, false, false}, };
        System.out.println(placeBoat(battleship, "down", 3, 3, 4));
        String[][] test = {{"apple", "banana", "coconut"}, {"asparagus", "green beans", "pomegranate seeds"}};
        System.out.println(inOrder(test));
    }
}
