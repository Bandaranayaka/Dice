package com.example.dice02


fun main(){
    val redSixSidedDice = Dice(6, "Red")
    println("My ${redSixSidedDice.color} ${redSixSidedDice.numSide} sided rolled ${redSixSidedDice.roll()}!")

    val blueTwentySideDice = Dice(20, "Biue")
    println("My ${blueTwentySideDice.color} ${blueTwentySideDice.numSide} side rolled ${blueTwentySideDice.roll()}")

    //val myCoin = Coin("Gold")
    //println("My Coin Color is : ${myCoin.color} and Side is ${myCoin.flips()}")

    val myCoin = Coin()
    println("Your ${myCoin.color} coin flipped to: ${myCoin.flip()}")

}

class Dice(val numSide: Int, val color:String){
    fun roll():Int{
        return (1..numSide).random()
    }
}

//class Coin(val color: String) {
//    fun flips(): String{
//         val result = (0..1).random()
//        if (result == 0){
//            println("Heads")
//        }else{
//            println("Tails")
//        }
//
//        return "Result : ${result}"
//    }
//
//}

class Coin{
    val color : String = "Gold"// Coin can also have colors!

    fun flip(): String{
        val result = if ((0..1).random()==0) "Heads" else "Tails"
        return "Results : $result"
    }
}


