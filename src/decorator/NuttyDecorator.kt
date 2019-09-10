package decorator

class NuttyDecorator(var icecream: Icecream) : IcecreamDecorator(icecream) {

    override fun makeIcecream(): String {
        return icecream.makeIcecream() + addNuts()
    }

    private fun addNuts() : String {
        return " + adding nuts"
    }
}