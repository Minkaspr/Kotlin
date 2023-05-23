package com.example.kotlin

class Developer(name: String, age: Int, val language: String) :Person(name,age), Vehiculo{

    // Sobreescritura en Herencia
    override fun work() {
        println("Esta persona esta desarrollando y programando")
    }

    fun sayLanguage(){
        println("Este desarrrollador usa el lenguaje $language")
    }

    override fun goToWork() {
        println("Esta persona va a estudiar")
    }

    override fun drive() {
        println("Esta persona conduce un coche")
    }
}