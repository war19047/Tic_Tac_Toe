import java.util.Scanner

// Create an object of the class Board initialize its size to 0.
private var board = Board(0)
// Create an object of teh class Player.
private var player = Player()


fun main() {

    // Initialize a scanner.
    val inputScanner = Scanner(System.`in`)

    // Create a 3x3 board to play on.
    val size = 3
    board = Board(size)

    fun gamePlay() {
        // Display Board.
        println("Lets play Tic Tac Toe! ")
        board.displayBoard()

        // Initiate players turn. Either X or O
        player.takeTurns()

        // Print current players turn and get a move from that player
        println("It is ${player.currentPlayer}'s turn ")
        println("Enter a move 1-9. ")
        val move = Integer.parseInt(inputScanner.nextLine())

        // Deconstruct the return values of parseMove
        val position = board.parseMove(move)

        val row = position.component1()
        val col = position.component2()

        // Update the board.
        board.makeMove(row , col , player.currentPlayer)
    }

    var playAgain = ""
    // Check if turns are in sync.
    while (!board.isGameOver && playAgain != "N"){
          // Play the game.s
          gamePlay()

        if (board.isGameOver) {
            println("Would you like to play again? Y/N? ")
            var playAgain = readLine()
            playAgain = playAgain.toString().uppercase()

            if (playAgain == "N") {
                println("Goodbye! ")
            } else {
                // Start over with a new board and play again.
                board.newGame()
                // Play the game.
                gamePlay()

            }
        }

    }

}
