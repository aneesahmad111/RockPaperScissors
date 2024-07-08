package com.example.myapplication12

fun main(){


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

}