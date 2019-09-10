package decorator

fun main() {
    val icecream = HoneyDecorator(NuttyDecorator(SimpleIcecream()))
    println(icecream.makeIcecream())
}