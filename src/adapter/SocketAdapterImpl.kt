package adapter

/**
 * This form uses Java Composition.
 * An object adapter that contains the source object.
 *
 * <p> Composition is the design technique to implement has-a relationship in classes.
 *     We can use java inheritance or Object composition for code reuse.
 *     Java composition is achieved by using instance variables that refers to other objects.
 *     Composition is a special case of aggregation.
 * </p>
 */
class SocketAdapterImpl : SocketAdapter {

    private var constantSocket = Socket()

    /**
     * Implementation provides returning the 3 volt supply from
     * the constant 240 voltage supply.
     */
    override fun get3Volts(): Volt {
        return convertToVolt(constantSocket.getVolt(), 80)
    }

    /**
     * Implementation provides returning the 12 volt supply from
     * the constant 240 voltage supply.
     */
    override fun get12Volts(): Volt {
        return convertToVolt(constantSocket.getVolt(), 20)
    }

    /**
     * Implementation provides returning the 120 volt supply from
     * the constant 240 voltage supply.
     */
    override fun get120Volts(): Volt {
        return convertToVolt(constantSocket.getVolt(), 2)
    }

    /**
     * Implementation provides returning the 240 volt which is a constant
     * voltage supply.
     */
    override fun get240Volts(): Volt {
        return constantSocket.getVolt()
    }

    /**
     * Function returns the required volt type by dividing it from the range.
     * @param volt : Volt object that contains value which is to be reduced
     *              to the required volts.
     * @param range : Value which helps reducing the constant supply voltage
     *               to the required volts.
     */
    private fun convertToVolt(volt: Volt, range : Int) : Volt {
        return Volt(volt.voltage / range)
    }

}