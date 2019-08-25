package adapter

/**
 * An Adapter interface that can produce 3 volts, 12 volts, 120 volts and default 240 volts.
 */
interface SocketAdapter {

    /**
     * @return [Volt] instance for 3 volts supply.
     */
    fun get3Volts() : Volt

    /**
     * @return [Volt] instance for 12 volts supply.
     */
    fun get12Volts() : Volt

    /**
     * @return [Volt] instance for 120 volts supply.
     */
    fun get120Volts() : Volt

    /**
     * @return [Volt] instance for 240 volts supply.
     */
    fun get240Volts() : Volt

}