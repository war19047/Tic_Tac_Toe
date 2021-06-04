class Player {

    private var player1= "X"
    private var  player2 = "O"
    var currentPlayer = ""


    fun takeTurns() {
        currentPlayer = if (player1 == currentPlayer) {
            player2
        } else {
            player1
        }
    }

}