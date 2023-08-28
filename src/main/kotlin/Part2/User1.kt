package Part2

class User1 {
    var nam: String = ""

    //ゲッターとセッターという書き方はKotlinではしなくていい
    fun getName(): String {
        return this.nam
    }

    fun setName(name: String) {
        this.nam =name
    }
}