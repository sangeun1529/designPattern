import Beverage



/**
 *
 * @author kkomac
 * @date 4/26/24
 */
abstract class CondimentDecorator : Beverage() {
    abstract override fun getDes(): String
}