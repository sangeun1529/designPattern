/**
 *
 * @author kkomac
 * @date 4/26/24
 */
class StarBuzzApps {
    fun run() {
        val beverage: Beverage = Espresso()
        println("기본 에스프레소 = " + beverage.getDes() + " : " + beverage.cost())

        var beverage1: Beverage = DarkRoast()

        beverage1 = Mocha(beverage1)
        beverage1 = Mocha(beverage1)
        beverage1 = Whip(beverage1)

        println("다크로스트에 모카 추가, 휘핑 추가 = " + beverage1.getDes() + " : " + beverage1.cost())


        var beverage2: Beverage = HouseBlend()

        beverage2 = Mocha(beverage2)
        beverage2 = Soy(beverage2)
        beverage2 = Whip(beverage2)

        println("하우스에 모카 추가, 두유 추가, 휘핑 추가 = " + beverage2.getDes() + " : " + beverage2.cost())
    }
}