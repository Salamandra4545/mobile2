import kotlin.math.sqrt

fun main(){
    val base = Base(2, 2)
    base.info()
    val base1 = Base(1, 9)
    base1.info()
}

class Base(number1:Int, number2:Int){
    val number1:Int
    val number2:Int
    var answer: Double = 0.0

    init {
        this.number1 = number1
        this.number2 = number2
    }

    fun info(){
        answer = sqrt((number1.toDouble()* number2.toDouble()))
        println("√($number1 * $number2) = $answer")
    }
}



