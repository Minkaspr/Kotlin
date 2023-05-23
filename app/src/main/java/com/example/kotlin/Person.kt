package com.example.kotlin

open class Person (name: String, age: Int) : Work(){

    // Cualquier clase tiene una superclase comun "Any"
    open fun work(){
        println("Esta persona está trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }
}