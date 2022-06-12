class Model {
    val names: List<String>
        field: MutableList<String> = mutableListOf()

    fun addName(name: String) {
        names.add(name)  // has access to `add` method
    }
}

fun main(args: Array<String>) {
    val model = Model()

    // model.names.add("Kevin")  // doesn't have access to `add` method, should crash here
    // println(model.names)

    model.addName("Kevin")   // this is how it can be done
    println(model.names)
}