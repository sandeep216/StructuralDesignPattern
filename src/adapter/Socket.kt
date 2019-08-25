package adapter

/**
 * Socket class for representing the constant supply
 * of default voltage as 230 for India and 120 for USA.
 */
class Socket {

    fun getVolt() : Volt {
        return Volt(240) //for India
    }
}