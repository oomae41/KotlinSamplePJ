package Part2

class User2 (id: Int, name: String) {
    val id: Int = id
    val name: String = name

    override fun hashCode(): Int {
        return 1
    }
}