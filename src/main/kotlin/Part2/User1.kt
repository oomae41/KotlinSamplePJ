package Part2

class User1 {
    var name: String = ""

    //ゲッターとセッターという書き方はKotlinではしなくていい
    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name =name
    }
}