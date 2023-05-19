package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variablesYConstantes()
        tiposDeDatos()

    }

    // Comentario en Linea

    /*
    Comentario en Bloque
    */

    /*
    * Comentario de bloque simple
    * */

    /**
     * Documentacion de comentario
     */


    private fun variablesYConstantes(){

        /**
         * 1RO - VARIABLES
         */

        var myFirstVariable = "Esto es una cadena de texto"

        // Imprimir por consola la variable
        println(myFirstVariable) // ->  Esto es una cadena de texto

        // Se reemplaza la variable por otro texto
        myFirstVariable = "Hola mundo, ya estoy aquí"
        println(myFirstVariable) // -> Hola mundo, ya estoy aquí

        /*
        Error
         No se se puede modificar una variable de
         tipo string a un tipo int,
         Sólo se puede modificar del mismo tipo:

        myFirstVariable = 1
        */

        var mySecondVariable = "¿Cómo estás?"
        println(mySecondVariable) // -> ¿Cómo estás?

        mySecondVariable = myFirstVariable
        println(mySecondVariable) // -> Hola mundo, ya estoy aquí

        myFirstVariable = "¿Qué haces?"
        println(myFirstVariable) // -> ¿Qué haces?


        /**
         * 2DO - CONSTANTES
         */

        val myFirstConstant = "¿Quieres dormir?"
        println(myFirstConstant)

        /*
        * Error
        *
        * myFirstVariable = "¿Te volviste a equivocar?"
        *
        * Una constante no puede modificar su valor
        * */

        // Se asigna un valor de una variable a una constante
        val mySecondConstant = myFirstVariable
        println(mySecondConstant) // -> ¿Qué haces?

    }


    private fun tiposDeDatos() {

        /**
         * 3ro - Tipos de Datos
         */


        /*
         STRING
        */

        // Android Studio emite una advertencia porque kotlin infiere el tipo de dato
        val myString1: String = "Hola Developer"
        // Kotlin deduce automaticamente que es de tipo String
        val myString2 = "Haz vuelto"

        // Concatenar
        val myString3 = myString1 + ", " +myString2
        // Mostrar por consola
        println(myString3) // -> Hola Developer, Haz vuelto


        /*
         Enteros (Byte, Short, Int, Long)
        */

        val myInt1: Int = 1
        val myInt2 = 2
        val myInt3 = myInt1 + myInt2
        println(myInt3) // -> 3


        /*
         Decimales (Float, Double)
        */

        val myFloat: Float = 1.5f
        val myDouble1: Double = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 // <>  1.0 pero en realidad es un Int
        val myDouble4 = myDouble1 + myDouble2 + myDouble3
        println(myDouble4) // -> 5.1


        /*
         Boolean (Bool)
        */

        val myBool1: Boolean = true
        val myBool2 = false

        /*
        *  val myBool3 = myBool1 + myBoll2 // -> Error
        *
        * Error:
        *   No se puede efectuar en algunas operaciones
        *   solo en operaciones logicas
        * */

        println(myBool1 == myBool2) // -> false
        println(myBool1 && myBool2) // -> false

    }

}