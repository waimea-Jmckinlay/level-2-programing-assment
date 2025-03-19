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

val goldCoin=1
val slivercoin=2
val win = "W"
val lose="L"
const val EMPTY = "[-]"
const val NUMgraph = 9
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
    println("nice to meet you $player1")

    val player2 = getString ("Enter your name player2")
    println("nice to meet you $player2")

   val gamebord = GameGraph()
    //change when game is working
    println(gamebord)


}

//getting players names
fun getString(prompt: String): String {
    var userinput: String

    while (true) {
        print(prompt)
        userinput = readln()
        if (userinput.isNotBlank()) break
    }
    return userinput
}
//printing the gamebord blank/without coins in it
fun GameGraph(): MutableList<String> {
    val graph = mutableListOf<String>()
    for (i in 1..NUMgraph) graph.add(EMPTY)

    return graph
}