package com.example.myapplication12

fun main() {

  //  var shoppingList = listOf("Bread","Jam","Milk")
    var shoppingList = mutableListOf("sugar","tea","milk","soap")
    shoppingList.add("vegetables")

    shoppingList.remove("milk")


    shoppingList.add(1,"Bread")

    shoppingList.add(2,"pack Milk")

    println(shoppingList)

    shoppingList[2] = "Milk"
    println(shoppingList)

    println(shoppingList.contains("read"))
/*
    for (i in shoppingList){
        println(i)
        if (i=="Milk"){
            break
        }
    }

 */
    for (items in 0 until  shoppingList.size){
        println(shoppingList[items])
    }




/*
    var d = Dog()
    var detailOfDog = DetailOfDog("pitty", 23)
    d.behaviour(detailOfDog)

 */
}

  /*
    var computerChoice = ""
    var playerChoice = ""
    println("Rock , Paper or Scissors: Please enter a Value!")
    playerChoice = readln()

    var randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)
    var winner = when{

        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "player"
        else -> "computer"


    }
    println("The winner is : $winner")
*/
