package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()

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
}