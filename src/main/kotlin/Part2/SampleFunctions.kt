package Part2

class SampleFunctions {
    fun printOddEvenNumberText(num: Int) {
//        var text = ""
//        if(num%2 == 1){
//            text = "奇数"
//        }else{
//            text = "偶数"
//        }

        val text = if(num%2 == 1){
            "奇数"
        }else{
            "偶数"
        }
        println(text)
    }

    fun printOddNumbers(): String{
        val list = mutableListOf<Int>()
        for (i in 1..10){
            if(i%2 == 1){
                list.add(i)
            }
        }
        val oddNumbers = list.joinToString ( separator = " " )

        return oddNumbers
    }
}

fun main(){
    val sampleFunctions = SampleFunctions()
//    sampleFunctions.printOddEvenNumberText(4)

    println(sampleFunctions.printOddNumbers())
}