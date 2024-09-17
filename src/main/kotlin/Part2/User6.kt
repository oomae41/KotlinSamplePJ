package Part2

class User6 {
    val id: Int = 1
    val name: String = "masao"

    // 引数がAnyならoverrideになる
    fun equals(other: User2): Boolean{
        return id == other.id && name == other.name
    }

    override fun equals(other: Any?): Boolean{
        println("override")
        return this === other
    }

    override fun hashCode(): Int {
        return 1
    }
}

// User1のクラス変数をnameのままにしておくとエラーになる
fun main(){
    val user2 = User2(1, "masao")
    val user6 = User6()

    println(user6.equals(user2))

    // デフォルト
    println(user2.equals(user6))

    println(user2.hashCode())
    println(user6.hashCode())
}