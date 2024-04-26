/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class Decaf : Beverage() {
    init {
        description = "디카프"
    }

    override fun cost(): Double {
        return 1.2
    }
}