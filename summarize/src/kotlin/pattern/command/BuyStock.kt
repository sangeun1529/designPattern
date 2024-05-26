class BuyStock(stock: Stock) : Command {
    private val stock: Stock = stock

    override fun execute() {
        stock.buy()
    }
}