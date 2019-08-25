package adapter

/**
 * Test program to consume our adapter design pattern implementation.
 */
fun main() {
    testObjectAdapter()
}

private fun testObjectAdapter() {
    val sockAdapter = SocketAdapterImpl()
    val v3 = getVolt(sockAdapter, 3)
    val v12 = getVolt(sockAdapter, 12)
    val v120 = getVolt(sockAdapter, 120)
    val v240 = getVolt(sockAdapter,240)
    System.out.println("v3 volts using Object Adapter=" + v3.voltage)
    System.out.println("v12 volts using Object Adapter=" + v12.voltage)
    System.out.println("v120 volts using Object Adapter=" + v120.voltage)
    System.out.println("v240 volts using Object Adapter=" + v240.voltage)
}

private fun getVolt(sockAdapter: SocketAdapter, i: Int): Volt {
    return when (i) {
        3 -> sockAdapter.get3Volts()
        12 -> sockAdapter.get12Volts()
        120 -> sockAdapter.get120Volts()
        else -> sockAdapter.get240Volts()
    }
}