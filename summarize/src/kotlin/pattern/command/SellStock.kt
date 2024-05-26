class SellStock(private val stock: Stock) : Command {
    override fun execute() {
        stock.sell()
    }
}