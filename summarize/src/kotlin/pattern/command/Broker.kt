class Broker {
    private val commandList: MutableList<Command> = ArrayList()

    fun takeOrder(command: Command) {
        commandList.add(command)
    }

    fun placeOrders() {
        for (command in commandList) {
            command.execute()
        }

        commandList.clear()
    }
}