/**
 *
 * @author kkomac
 * @date 4/26/24
 */
abstract class Beverage {
    var description: String = "제목없음"

    open fun getDes(): String {
        return description
    }

    abstract fun cost(): Double
}