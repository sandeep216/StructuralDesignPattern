package decorator

class HoneyDecorator(var icecream: Icecream) : IcecreamDecorator(icecream) {

    override fun makeIcecream(): String {
        return icecream.makeIcecream() + addHoney()
    }

    private fun addHoney(): String {
        return " + sweet honey"
    }
}