package com.example.kotlin

open class Person (name: String, age: Int) : Work(), Game{

    // Cualquier clase tiene una superclase comun "Any"
    open fun work(){
        println("Esta persona está trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }


    // -----------------------------------------------
    // Game Interface
    override val game: String = "Among Us"

    override fun play() {
        println("Esta persona está jugando a $game")
    }
}