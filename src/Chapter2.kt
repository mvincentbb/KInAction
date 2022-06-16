import java.util.Arrays

import Chapter2.Color.*

class Chapter2 {

    class Rectangle(val height:Int, val width:Int){
        val isSquare: Boolean
        get() = height == width // property getter declaration
    }

    //Declaring enum

    enum class Color(
            var r: Int, val g: Int, val b:Int
    ){
        RED(255,0,0),
        ORANGE(255,0,0),
        YELLOW(255,0,0),
        GREEN(255,0,0),
        BLUE(255,0,0),
        INDIGO(255,0,0),
        VIOLET(255,0,0)
    }

    //" when" to deal with enum classes
    fun getMnemonic(color : Color)= //Returns a "when expression directly"
            when (color){
                RED -> "Richard"
                BLUE -> "Battle"
                GREEN -> "Gave"
                INDIGO -> "Battle"
                VIOLET -> "In"
                INDIGO -> "Vain"
                ORANGE -> "Of"
                YELLOW ->"York"
            }

    //combine options in one when branch

    fun getWarmth(color: Color) = when(color){
        Color.RED, ORANGE, YELLOW ->"warn"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }




    fun main (args: Array<String>){
        val rectangle =  Rectangle(41,43)
        println(rectangle.isSquare)
    }
}