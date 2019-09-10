package decorator

abstract class IcecreamDecorator(private var icecream : Icecream) : Icecream {

    override fun makeIcecream() : String {
        return icecream.makeIcecream()
    }
}