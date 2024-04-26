/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class Whip(var beverage: Beverage) : CondimentDecorator() {
    override fun getDes(): String {
        return beverage.getDes() + ", 휘핑크림"
    }

    override fun cost(): Double {
        return .50 + beverage.cost()
    }
}