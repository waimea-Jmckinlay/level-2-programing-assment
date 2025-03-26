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
val GAMEBORD = GameGraph()
const val GOLD ="G"
const val SILVER="S"
val win = "W"
val lose="L"
const val EMPTY = " "
const val GAME_SIZE = 9
fun main() {

    println("welcome to the old gold game")
    println("in this 2 player game your goal is")
    println("to be the one to remove the number 1 coin from the board")
    println("you can move one coin as far right as you want as long as")
    println("there are no coins in the way. you can only remove coins if ")
    println ("they are on the end space players take turns moving or removing coins ")
    println ("the player that remove the coin 1 from the board wins")
    println("---------------------------------------------------------------------")
//getting player names they can have numbers it they want or only be numbers
    val player1 = getString ("Enter your name player1")



    val player2 = getString ("Enter your name player2")

    println(GAMEBORD)

    println("adding coins...")

    println (RandomSlot())

    println("good luck $player1 and $player2 may the best player win")

    println("$player1 Your turn to start.")
    println("what would you like to do")
    println("move a coin,or, remove a coin (answer as shown)")


    var PlayerInput = readLine()!!
    




}

//getting players names
fun getString(prompt: String): String {
    var userinput: String

    while (true) {
        println(prompt)
        userinput = readln()
        if (userinput.isNotBlank()) break
    }
    return userinput
}
//printing the gameBord blank/without coins in it
fun GameGraph(): MutableList<String> {
    val graph = mutableListOf<String>()
    for (i in 1..GAME_SIZE) graph.add(EMPTY)

    return graph
}

// randoming what slots the coins go in
fun RandomSlot(): MutableList<String> {
        repeat(4){
            GAMEBORD.remove(" ")  //removing empty space,so we don't remove any silver coins
            GAMEBORD.add(SILVER)
        GAMEBORD.shuffle()

        }
    GAMEBORD.remove(" ")
    GAMEBORD.addLast(GOLD)
    return GAMEBORD
}
