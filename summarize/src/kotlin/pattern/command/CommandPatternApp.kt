class CommandPatternApp {
    fun run() {
        val stock = Stock()

        val buyStock = BuyStock(stock)
        val sellStock = SellStock(stock)

        val broker = Broker()

        broker.takeOrder(buyStock)
        broker.takeOrder(sellStock)

        broker.placeOrders()
    }
}