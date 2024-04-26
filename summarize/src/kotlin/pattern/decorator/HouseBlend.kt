/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class HouseBlend : Beverage() {
    init {
        description = "하우스 브렌드 커피"
    }

    override fun cost(): Double {
        return .89
    }
}