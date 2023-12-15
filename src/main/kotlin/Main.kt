import kotlin.math.sqrt

fun main(){
    val base = Base(2, 2)
    base.info()
    val base1 = Base(1, 9)
    base1.info()
    val child = Child(3, 2, 3f)
    child.childInfo()
}

open class Base(
    val number1:Int,
    val number2:Int){

    fun info(){
        val answer = sqrt((number1.toDouble()* number2.toDouble()))
        println("√($number1 * $number2) = $answer")
    }
}

class Child(
    number1:Int,
    number2:Int,
    val fNumber: Float) : Base(number1, number2){

   fun childInfo(){
       val answer = sqrt((number1.toFloat()* number2.toFloat() + fNumber))
       println("√($number1 * $number2 + $fNumber) = $answer")
   }

}

