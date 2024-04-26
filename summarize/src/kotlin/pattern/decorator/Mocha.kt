/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class Mocha(var beverage: Beverage) : CondimentDecorator() {
    override fun getDes(): String {
        return beverage.getDes() + ", 모카"
    }

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}