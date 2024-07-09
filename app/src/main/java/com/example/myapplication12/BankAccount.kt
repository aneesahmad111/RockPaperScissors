package com.example.myapplication12

class BankAccount(var accountHolder : String, var balance : Double) {

    var transactionalHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        balance += amount
        transactionalHistory.add("$accountHolder deposited $$amount ")

    }
    fun withdraw(amount : Double){
        if (amount<=balance){
            balance -= amount
            transactionalHistory.add("$accountHolder withdrew  $$amount")
        }else{
            println("You can't withdraw money")
        }

    }
    fun displayTransactionHistory(){
        for (transaction in transactionalHistory){
            println(transaction)
        }
    }
}