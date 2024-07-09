package com.example.myapplication12

fun main(){

    println("Please Enter Your name ")

    var name = readln()
//    var value = readln().toDouble()

    var AliBankAccount = BankAccount(name,1400.0)

    println("Please Enter 1 for Deposit & 2 for Withdraw")
    var option = readln().toInt()

    when(option){
        1->
        {
            println("Please Enter how much money you want to deposit")
            var DM = readln().toDouble()
            AliBankAccount.deposit(DM)
            AliBankAccount.displayTransactionHistory()
        }
        2->{
            println("you have $${AliBankAccount.balance} balance")
            println("Please Enter how much money you want to withdraw")
            var WDM = readln().toDouble()
            AliBankAccount.withdraw(WDM)
            AliBankAccount.displayTransactionHistory()
        }
        else->
            println("You Select wrong option")


    }
    /*
    AliBankAccount.deposit(1500.0)
    AliBankAccount.withdraw(1000.0)
    AliBankAccount.displayTransactionHistory()

     */

    println("${AliBankAccount.accountHolder} has $${AliBankAccount.balance} balance")

}