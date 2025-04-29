/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   old gold
 * Project Author: Jayden.Mckinlay
 * GitHub Repo:    https://github.com/waimea-Jmckinlay/level-2-programing-assment
 * ---------------------------------------------------------------------
 * Notes:
 * This is a two-player game, played on a one-dimensional grid with coins
 * , where the aim is to win by being the player who **removes the gold coin**.
 *
 * =====================================================================
 */

const val GOLD ="G"
const val SILVER="S"
const val EMPTY = " "
const val GAME_SIZE = 9


fun main() {
    println("----------------------------------------------------------------------")
    println("welcome to the old gold game")
    println("in this 2 player game your goal is")
    println("to be the one to remove the G coin from the board")
    println("you can move one coin as far right as you want as long as")
    println("there are no coins in the way. you can only remove coins if ")
    println("they are on the end space players take turns moving or removing coins ")
    println("the player that remove the coin 1 from the board wins")
    println("---------------------------------------------------------------------")

    //getting player names they can have numbers it they want or only be numbers
    val player1 = getString("Enter your name player1: ")

    val player2 = getString("Enter your name player2: ")
    //prints the list
    println("creating board...")
    val gameBoard = createBoard()
    displayBoard(gameBoard)
    // prints list with coins in it
    println("adding coins...")
    addCoins(gameBoard)
    displayBoard(gameBoard)


    println("good luck $player1 and $player2 may the best player win")
    while (true) {
        takeTurn("Your turn $player1", gameBoard)
        if (GOLD !in gameBoard) {
            println("You win!$player1")
            break
        }

        takeTurn("Your turn $player2", gameBoard)

        if (GOLD !in gameBoard) {
            println("You win! $player2")
            break
        }
    }
}



fun displayBoard(board: MutableList<String>) {
    println (mutableListOf(1,2,3,4,5,6,7,8,9))
    println(board)
}


//getting players names
fun getString(prompt: String): String {
    var userinput: String

    while (true) {
        print(prompt)
        userinput = readln()
        if (userinput.isNotBlank())
            return userinput
        break
    }
    return userinput
}
//printing the gameBord blank/without coins in it
fun createBoard(): MutableList<String> {
    val graph = mutableListOf<String>()
    for (i in 1..GAME_SIZE) graph.add(EMPTY)

    return graph
}




// randoming what slots the coins go in and adding the gold coin last
fun addCoins(board: MutableList<String>)  {
    repeat(4){
        board.remove(" ")  //removing empty space,so we don't remove any silver coins that where added
        board.add(SILVER)
        board.shuffle()
    }
    board.remove(" ")
    board.addLast(GOLD)
}


//getting the player input and filtering out bad inputs
fun playerinput(): Char {
    val validChoices = "mr"
    while (true) {
        println("[m]ove a coin")
        println("[r]emove a coin")

        val input = readln().lowercase().first()


        val validChoices = "mr"
        if (validChoices.contains(input)) return input




    }
}






//making sure the player only inputs a number from 1-9
fun getCoinToMove(board: MutableList<String>) :Int {
    while (true) {
        println("what place is the coin in you want to move")
        println("1-9")
        val Input = readln()


        if (Input.isBlank()) {
            println("a number from 1 to 9")
            continue

        }
        val boardSquare = Input.toInt() - 1

        if(board[boardSquare] == EMPTY) {
            println("You have to pick a coin")
            continue
        }



        if (Input.matches("[1-9]".toRegex())) {
            return Input.toInt() - 1
        }
   }
}
//getting where the coin is going to move
fun getPlaceToMoveCoinTo(coinBeingMoved: Int, board: MutableList<String>): Int {
    while (true) {
        println("what place do you want to move the coin too")
        println("1-9")
        val input = readln()

        val boardSquare = input.toInt() - 1

        if(boardSquare == coinBeingMoved) {
            println("can't move a coin onto the same space")
            continue
        }

        if(board[boardSquare] != EMPTY){
            println("can't move coins onto coins")
            continue
        }
        if(boardSquare >= coinBeingMoved){
            println("can't move coins backwords")
            continue
        }


        if (input.matches("[1-9]".toRegex())) {
            return boardSquare
        }
    }
}
fun moveCoin(board: MutableList<String>) {
    while (true) {
        val coinToMove = getCoinToMove(board)
        val squareToMoveTo = getPlaceToMoveCoinTo(coinToMove, board)

        var coinsInWay = false
        for (i in squareToMoveTo..<coinToMove) {
            if (board[i] != EMPTY) {
                coinsInWay = true
                break
            }
        }

        if (coinsInWay) {
            println("Coin in way")
            continue
        }

        // If we get here, must be a valid move
        board[squareToMoveTo] = board[coinToMove]
        board[coinToMove] = EMPTY
        break
    }

}


 //lets players take turns
fun takeTurn(prompt : String, gameBoard : MutableList<String>)  {
    while(true) {

        println(prompt)
        val action = playerinput()

        if (action == 'm') {
            moveCoin(gameBoard)
            displayBoard(gameBoard)
            break
        }
        if (action == 'r') {
            gameBoard[0] = EMPTY
            displayBoard(gameBoard)
            break
        }



    }

}

