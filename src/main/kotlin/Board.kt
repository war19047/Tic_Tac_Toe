import kotlin.math.pow

class Board(private val n: Int) {

    private val empty = "___"
    private var turnCounter = 0
    var isGameOver = false
    var board = Array(n) { Array(n) {empty} }

    fun resetBoard(){
        // This function makes a fresh board.
        board = Array(n) { Array(n) {empty} }
    }

    fun displayBoard() {
        // This function displays a board to play the gaem
        // tic tac toe.
        board.forEach {row ->
            row.forEach { element  ->

                if (element == empty){
                    print("|$element|")
                }
                else{
                    print("| $element |")
                }

            }
            println()
        }
        println()
    }

    fun makeMove(x: Int, y: Int, move: String) {
        if (!isGameOver && isValidPosition(x,y) && board[x][y] == empty) {

            // Increment a turn counter by 1.
            turnCounter++

            // Update the board in position array[x][y]
            board[x][y] = move

            // Show the player the board.
            displayBoard()

            // Check if game is over.
            isGameOver = winningMove(x, y, move) || isTie()

            if (isGameOver && !isTie()) {
                println("$move is the winner!")
            } else if (isTie()){
                println("The game is a tie!")
            }

        }
    }

    private fun isValidPosition(x: Int, y: Int): Boolean{
        // This method will check if the position entered is within the range
        // 0-9 because the board is 3x3. Note: Until is a function that goes
        // through each element NOT including the last
       return((x in 0 until n) && (y in 0 until n))
    }

    private fun winningMove(x: Int, y: Int, move: String): Boolean{
        // This function will detect if a player has won the game.

        // Check row.
        for (i in 0 until n) {
            if (board[x][i] != move) {
                break
            }

            if (i == n - 1) {
                return true
            }
        }

        // Check for column.
        for (i in 0 until n) {
            if (board[i][y] != move) {
                break
            }

            if (i == n - 1) {
                return true
            }
        }

        // Check for diagonal win from left to right.
        if (x == y){
            for (i in 0 until n){
                if (board[i][i] != move){
                    break
                }

                if (i == n - 1) {
                    return true
                }
            }
        }

        // Check for diagonal win from right to left.
        if (x + y == n - 1) {
            for (i in 0 until n){
                if (board[i][(n - 1) - i] != move){
                    break
                }
                if (i == n - 1) {
                    return true
                }
            }
        }

        return false
    }

    fun isTie(): Boolean {
        // This function will return True when there is a tie.
        return( turnCounter == (n.toDouble().pow(2) - 1).toInt())
    }

    fun newGame(){
        //This function resets the game to its original state.
        resetBoard()
        isGameOver = false
        turnCounter = 0
    }

    fun parseMove(move: Int): Pair<Int, Int> {
        var row = 0
        var col = 0

        if (move == 1) {
            row = 0
            col = 0
            return Pair(row, col)
        }

        if (move == 2) {
            row = 0
            col = 1
            return Pair(row, col)
        }

        if (move == 3) {
            row = 0
            col = 2
            return Pair(row, col)
        }

        if (move == 4) {
            row = 1
            col = 0
            return Pair(row, col)
        }

        if (move == 5) {
            row = 1
            col = 1
            return Pair(row, col)
        }

        if (move == 6) {
            row = 1
            col = 2
        }

        if (move == 7) {
            row = 2
            col = 0
            return Pair(row, col)
        }

        if (move == 8) {
            row = 2
            col = 1
            return Pair(row, col)
        }

        if (move == 9) {
            row = 2
            col = 2
            return Pair(row, col)
        }

        return Pair(row,col)
    }
}
