package decorator

/**
 * [Icecream] implementation that returns simple ice cream.
 * This class is a concrete implementation of this interface.
 * This is the base class on which the decorators will be added.
 */
class SimpleIcecream : Icecream {

    /**
     * Function that makes simple ice cream.
     * @return simple ice cream of type String.
     */
    override fun makeIcecream(): String {
        return "Simple Ice cream"
    }
}