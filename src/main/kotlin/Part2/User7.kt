package Part2

data class User7(
    // コンストラクタ
    val id: Int,
    var name: String,

    val sum: (Int, Int) -> Int = {num1: Int, num2: Int -> num1 + num2}
)

fun main(){
    val user = User7(1, "default")
    user.name = "masao"
    println(user.name)

    println(user.sum(1,1))
}
