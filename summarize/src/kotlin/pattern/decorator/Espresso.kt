/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class Espresso : Beverage() {
    init {
        description = "에스프레소"
    }

    override fun cost(): Double {
        return 1.99
    }
}