package com.example.myapplication12

data class CoffeeDetails(val sugarCount: Int,
                         val name: String,
                         val size :String ,
                         val creamAmount : Int
){

}

fun main(){

    var coffeeDetails = CoffeeDetails(1,"Khalid","xml",0)
    makeCoffee(coffeeDetails)
}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount ==1){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    }else if (coffeeDetails.sugarCount  == 0){
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    }else{
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    }
}