/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class DarkRoast : Beverage() {
    init {
        description = "다크로스트"
    }

    override fun cost(): Double {
        return 2.8
    }
}