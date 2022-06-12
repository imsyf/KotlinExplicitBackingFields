class Model {
    private val _names: MutableList<String> = mutableListOf()
    val names: List<String>
        get() = _names

    fun addName(name: String) {
        _names.add(name)  // has access to `add` method
    }
}

fun main(args: Array<String>) {
    val model = Model()

    // model.names.add("Kevin")  // doesn't have access to `add` method, should crash here
    // println(model.names)

    model.addName("Kevin")   // this is how it can be done
    println(model.names)
}