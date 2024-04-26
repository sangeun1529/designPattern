/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class Soy(var beverage: Beverage) : CondimentDecorator() {
    override fun getDes(): String {
        return beverage.getDes() + ", 두유 "
    }

    override fun cost(): Double {
        return .70 + beverage.cost()
    }
}