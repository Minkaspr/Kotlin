package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variablesYConstantes()

        // tiposDeDatos()

        sentenciaIf()

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
         * 3ro - TIPOS DE DATOS
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


    private fun sentenciaIf(){

        /**
         *  4to - SENTENCIA If
         *
         *  Sirve para evaluar condicionoes
         */

        val myNumber = 10
        // Para mostrar el numero usamos el '$' antes del nombre de la variable o constante
        println("$myNumber es menor que 10") // -> 10 es menor que 10

        /*
        * Operadores condicionales
        *
        *   >     mayor que
        *   <     menor que
        *   >=    mayor o igual que
        *   <=    menor o igual que
        *   ==    igual que
        *   !=    desigual que
        *
        * */

        // Evaluamos la condicion, si myNumber es menor que 10
        // Luego mostramos por consola solo si se cumple la condicion

        if (myNumber < 10) {
            // 10 no es menor 10, por ende no se muestra nada por consola
            println("$myNumber es menor que 10")
        }

        var myNumber2 = 4
        if (myNumber2 < 10) {
            println("$myNumber es menor que 10") // -> 4 es menor que 10
        }


        /**
         *  5to - SENTENCIA ELSE
         *
         *  Se puede utilizar solo si anteriormente se usa la sentencia if
         *  y Sirve para designar un bloque de codigo, y se ejecuta solo
         *  cuando no se ejecute la sentencia if
         */

        myNumber2 = 12
        if (myNumber2 <=10) {
            // Sentencia if
            println("$myNumber2 es menor o igual a 10")
        } else {
            // Sentencia else
            println("$myNumber2 es mayor a 10") // -> 12 es mayor a 10
        }


        /*
        * Operadores Logicos
        *
        *   &&  "y"     Todas las condiciones deben ser correctas
        *   ||  "o"     Una de las condiciones debe ser correcta
        *   !   "no"    Se niega la condicion
        *
        * */

        myNumber2 = 7
        if (myNumber2 <=10 && myNumber2 > 5) {
            println("$myNumber2 es menor o igual a 10 y mayor a 5") // -> 7 es menor o igual a 10 y mayor a 5
        } else {
            // Solo se ejecuta el else cuando es opuesto a la condicion del if
            println("$myNumber2 es mayor a 10 o menor o igual a 5")
        }


        myNumber2 = 53
        if ((myNumber2 <=10 && myNumber2 > 5) || myNumber2 == 53) {
            // <- Se muestra esto por consola ->
            println("$myNumber2 es menor o igual a 10 y mayor a 5 o es igual a 53")
        } else {
            println("$myNumber2 es mayor a 10 o menor o igual a 5 y no es igual a 53")
        }


        /**
         *  6to - SENTENCIA ELSE IF
         *
         *  Se usa entre un if y else
         *  Funciona como un nuevo if, donde se pone una condicion
         */

        myNumber2 = 60
        if ((myNumber2 <=10 && myNumber2 > 5) || myNumber2 == 53) {
            println("$myNumber2 es menor o igual a 10 y mayor a 5 o es igual a 53")
        } else if (myNumber2 != 60) {
            // Sentencia else if
            println("$myNumber2 no es igual a 60")
        } else if (!(myNumber2 == 60)) {
            // Sentencia else if
            println("$myNumber2 no es igual a 60")
        } else if (myNumber2 == 60) {
            // Sentencia else if
            println("$myNumber2 es igual a 60") // -> 60 es igual a 60
        } else {
            println("$myNumber2 es mayor a 10 o menor o igual a 5 y no es igual a 53")
        }
    }

}