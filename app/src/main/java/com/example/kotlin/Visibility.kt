package com.example.kotlin


private class Visibility {
    // Public ↓
    var name: String? = null

    fun sayName() {
        name?.let {
            println("Mi nombre es $it")
        } ?: run {
            println("No tengo nombre")
        }
    }
}


open class VisibilityTwo {
    protected fun sayNameTwo() {
        val visibility = Visibility()
        visibility.name = "MK"
    }
}

class  VisibilityThree: VisibilityTwo() {

    internal val age: Int? = null
    fun sayMyNameThree() {
        sayNameTwo()
    }
}