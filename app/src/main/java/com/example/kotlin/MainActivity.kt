package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList

typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variablesYConstantes()

        // tiposDeDatos()

        // sentenciaIf()

        // sentenciaWhen()

        // arrays()

        // maps()

        // loops()

        // nullSafety()

        // funciones()

        // classes()

        // enumClasses()

        // nestedAndInnerClasses()

        // classInheritance()

        // interfaces()

        // visibilityModifiers()

        // dataClasses()

        // typeAliases()

        // destructuringDeclarations()

        // extensions()

         lambda()
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


    private fun variablesYConstantes() {

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


    private fun sentenciaIf() {

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


    private fun sentenciaWhen() {

        /**
         *  7mo - SENTENCIA WHEN
         */

        // When con String
        val country = "Peru"

        when (country) {
            /*
            "Peru" -> {
                println("El idioma es Español")
            } "Argentina" -> {
                println("El idioma es Español")
            } "Bolivia" -> {
                println("El idioma es Español")
            } "Chile" -> {
                println("El idioma es Español")
            } "EEUU" -> {
                println("El idioma es Ingles")
            } "Francia" -> {
                println("El idioma es Frances")
            } else -> {
                // Se ejecuta este bloque si no se cumple con ninguna de las condiciones
                println("No conocemos el idioma")
            }
             */

            // Optimizamos el When

            "Peru", "Argentina", "Bolivia", "Chile" -> {
                println("El idioma es Español") // -> El idioma es Español
            } "EEUU" -> {
                println("El idioma es Ingles")
            } "Francia" -> {
                println("El idioma es Frances")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        // When con Int
        val age = 10
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            } in 3..10 ->{ // in 3..10 es un rango entre 3 y 10 y se consideran ambos
                println("Eres un niño") // -> Eres un niño
            } in 11..17 ->{
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres un adulto")
            } in 70..99 -> {
                println("Eres un anciano")
            } else -> {
                println("🤔")
            }
        }


    }


    private fun arrays() {

        /**
         *  8vo - ARRAY
         *
         *  A un array, solo se le puede añadir valores del mismo tipo definido
         *  Es de una estructura ordenada
         */

        val name = "Min"
        val surname = "Kasper"
        val age = "24"

        // Creacion de un array
        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(age)
        myArray.add(age) // Permite añadir elementos repetidos

        println(myArray) // -> [Min, Kasper, 24, 24]

        // Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "¿Como estas?"))

        println(myArray) // -> [Min, Kasper, 24, 24, Hola, ¿Como estas?]

        // Acceso a datos
        val myElement = myArray[0]
        println(myElement) // -> Min

        // Modificacion de datos
        myArray[5] = "¿Que haces?"
        println(myArray) // -> [Min, Kasper, 24, 24, Hola, ¿Que haces?]

        // Eliminar datos
        myArray.removeAt(3)
        println(myArray) // -> [Min, Kasper, 24, Hola, ¿Que haces?]

        // Recorrer datos
        myArray.forEach {
            println(it)
            /*
            * -> Min
            *   Kasper
            *   24
            *   Hola
            *   ¿Que haces?
            * */
        }

        // Otras operaciones

        println(myArray.first())
        // -> Min
        // Acceder al 1er elemento

        println(myArray.last())
        // -> ¿Que haces?
        // Acceder al ultimo elemento

        println(myArray.count())
        // -> 5
        // Nos muestra la cantidad de elementos de un array

        myArray.clear()
        // Se eliminan todos los elementos de un array

        println(myArray.count())
        // -> 0
    }


    private fun maps() {

        /**
         *  9no - MAP - DICCIONARIOS
         *
         * Los mapas tienen una clave y valor, las claves son unicas
         * solo aparecen una vez en el mapa, pero los valores pueden repetirse
         */

        // Mapa con Tipo de clave (String) y tipo de Valor (Int)
        var myMap: Map<String, Int> = mapOf()
        println(myMap) // -> {}

        // Añadir elementos
        myMap = mapOf("Min" to 1,"Kasper" to 2, "Dario" to 9) // clave: Min y valor: 1
        println(myMap) // -> {Min = 1, Kasper = 2, Dario = 9}
        // El mapOf en realidad elimina los datos anteriores y los crea


        // Para añadir un solo valor, primero debemos hacer mutable el mapOf
        var myMap2: Map<String, Int> = mapOf()
        myMap2 = mutableMapOf("Lunes" to 1, "Martes" to 2, "Viernes" to 5)

        // Añadimos un solo valor
        myMap2["Sabado"] = 6
        myMap2.put("Domingo",7)
        println(myMap2) // -> {Lunes = 1, Martes = 2, Viernes = 5, Sabado = 6, Domingo = 7}

        // Actualizar el valor
        myMap2.put("Lunes",3)
        myMap2["Domingo"] = 3
        println(myMap2) // -> {Lunes = 3, Martes = 2, Viernes = 5, Sabado = 6, Domingo = 3}

        // Acceso a un dato
        println(myMap2["Lunes"]) // ->  3

        // Eliminar un dato
        myMap2.remove("Lunes")
        println(myMap2) // -> {Martes = 2, Viernes = 5, Sabado = 6, Domingo = 3}
    }


    private fun loops() {

        /**
         * 10mo - BUCLES
         */

        val myArray = listOf("A","B","C","D")
        val myMap = mutableMapOf("Lunes" to 1, "Martes" to 2, "Viernes" to 5)

        /*
         For
         Se va a ejecutar tantas veces como elementos tenga
        */

        for (myString in myArray) {
            println(myString)
            /*
            * -> A
            *   B
            *   C
            *   D
            * */
        }

        for (myElement in myMap){
            println("${myElement.key} - ${myElement.value}")
            /*
            * -> Lunes - 1
            *   Martes - 2
            *   Viernes - 5
            * */
        }

        // Recorrer rangos contanto desde el 1ro y ultimo
        for (x in 0..4){
            println(x)
            /*
            * -> 0
            *   1
            *   2
            *   3
            *   4
            * */
        }

        // Recorrer rango desde el 1ro sin contar el ultimo
        for (x in 0 until 4){
            println(x)
            /*
            * -> 0
            *   1
            *   2
            *   3
            * */
        }

        // Recorrer con incremento de 2 en 2
        for (x in 0..4 step 2){
            println(x)
            /*
            * -> 0
            *   2
            *   4
            * */
        }

        // Recorrer de manera regresiva
        for (x in 6 downTo 0 step 3){
            println(x)
            /*
            * -> 6
            *   3
            *   0
            * */
        }

        // Llenar un array con un rango
        val myNumericArray = (0..4)
        for (myNum in myNumericArray){
            println(myNum)
            /*
            * -> 0
            *   1
            *   2
            *   3
            *   4
            * */
        }

        /*
         While
        */

        var x = 0

        while (x < 4){
            println(x)
            x++ // x=x+1  o  x+=1

            /*
            * -> 0
            *   1
            *   2
            *   3
            * */
        }
    }


    private fun nullSafety() {

        /**
         * 11 - NULL SAFETY
         *
         * Seguridad contra nulos
         */

        var myString = "MinKa"
        println(myString) // -> MinKa
        // myString = null // -> ERROR

        // Declaramos una variable null safety
        var mySafetyString: String? = "Minka null safety"
        mySafetyString = null
        println(mySafetyString) // -> null

        mySafetyString = "Hola"
        println(mySafetyString) // -> Hola

        // Asegurarnos que la variable no sea nula
        if (mySafetyString != null) {
            println(mySafetyString!!)
        // <- al incorporar !! obligamos a que no sea nulo pero solo cuando verifiquemos que no sea nula->
        }

        mySafetyString = null
        // Llamada segura - Safe call
        println(mySafetyString?.length) // ->
        //<-la variable es nula pero al incorporar '?', verifica primero si es o no nula
        // , en caso lo fuera, no lo ejecuta->

        mySafetyString = "Ya no soy nulo"
        println(mySafetyString?.length) // -> 15

        //Otra forma elegante de verificar
        mySafetyString?.let {
            println(it) // -> Ya no soy nulo
        } ?: kotlin.run {
            // <- Se ejecuta cuando es nulo ->
            println(mySafetyString)
        }
    }


    fun funciones() {

        /**
         * 12 - FUNCIONES
         *
         * Nos permite reutilizar el codigo
         * Realiza una tarea muy concreta
         * No puede exister 2 funciones con el mismo nombre y parametros de entrada
         */

        // Queremos decir 3 veces Hola
        sayHello()  // -> Hola
        sayHello()  // -> Hola
        sayHello()  // -> Hola

        sayMyName("Minka")  // -> Hola, mi nombre es Minka
        sayMyName("July")  // -> Hola, mi nombre es July

        sayMyNameAndAge("Minka", 24)

        val resultado = sumTwoNumbers(5, 10)
        println(resultado)  // -> 15

        println(sumTwoNumbers(5, 10))   // -> 15

        println(sumTwoNumbers(5, sumTwoNumbers(5, 10))) // -> 20
    }

    // Funcion Simple
    fun sayHello(){
        println("Hola")
    }

    // Funciones con un parametro de entrada
    fun sayMyName(name: String){
        println("Hola, mi nombre es $name")
    }

    // Funciones con un parametro de entrada
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    // Funcion con un valor de retorno (retorna un entero - Int)
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int{
        val sum = firstNumber + secondNumber
        return sum
    }


    fun classes(){

        /**
         * 13 - CLASES
         *
         * Conocida tambien como objeto.
         * Es una contrusccion flexible, de uso general, para definir nuevos tipos.
         * Pueden contener en su interior propiedades y metodos, y Funciones
         *
         * Usaremos la clase: Programmer
         */

        // Llamamos a la clase programmer pasandole parametros
        val mk = Programmer("Minka",24, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))

        println(mk.name)    // -> Minka
        mk.age = 18

        // Invocamos la funcion de la clase
        mk.code()   // -> Estoy programando en KOTLIN
                    // -> Estoy programando en SWIFT

        val itai = Programmer("Itai",25, arrayOf(Programmer.Language.JAVA), arrayOf(mk))
        itai.code() // -> Estoy programando en JAVA
        println("${itai.friends?.first()?.name} es amigo de ${itai.name}") // -> Minka es amigo de Itai
    }

    // -------------------------------------------------------------------------

    enum class Direccion(val dir: Int) {
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun descripcion(): String {
//            if (this == NORTH) {
//                return "La direccion es norte"
//            }

            return when (this) {    // el when debe abarcar todos los valores, para este caso son 4
                NORTH -> "La direccion es Norte"
                SOUTH -> "La direccion es Sur"
                EAST -> "La direccion es Este"
                WEST -> "La direccion es Oeste"
            }
        }
    }


    private fun enumClasses() {

        /**
         * 14 - ENUM
         *
         * El uso mas principal de las clases de enumeracion es implementar
         * enumeracion type-safe (con seguridad de tipos)
         * Siempre debe estar el 'enum class' antes de las funciones
         */

        var userDireccion: Direccion? = null
        println("Direccion: $userDireccion")  // -> Direccion: Null

        userDireccion = Direccion.NORTH
        println("Direccion: $userDireccion")  // -> Direccion: NORTH

        userDireccion = Direccion.EAST
        println("Direccion: $userDireccion")  // -> Direccion: EAST

        // Propiedades por defecto
        println("Propiedad name: ${userDireccion.name}")    // -> EAST
        println("Propiedad ordinal: ${userDireccion.ordinal}")    // -> 2

        // Funciones
        println(userDireccion.descripcion())    // -> La direccion es Este

        // Inicializacion
        println(userDireccion.dir)  // -> 1

    }


    private fun nestedAndInnerClasses() {

        /**
         * 15 - CLASES ANIDADAS
         *
         * Una clase puede contener clases dentro de ella
         * Nos sirven para que sea mas seguro, eficiente, estructurado
         *
         * Usaremos las clases: MyNestedAndInnerClass.kt
         */

        // Clase anidada (mested)
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum = myNestedClass.sum(10,5)
        println("El resultado de la suma es: $sum") // -> El resultado de la suma es: 15

        // Clase interna (inner)
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(10)
        println("El resultado de la 2da suma es: $sumTwo") // -> El resultado de la 2da suma es: 12    }

    }


    private fun classInheritance() {

        /**
         * 16 - HERENCIA
         *
         * La herencia es un mecanismo de los lenguajes de POO basados en clases
         * por medio del cual una clase se deriva de ora de manera que
         * extiende su funcionalidad o la especializa
         *
         * Usaremos las clases: Work.kt - Person.kt - Developer.kt - Designer.kt
         * Interface: Vehiculo.kt
         */

        val person = Person("MK",20)

        val developer = Developer("Minka", 24,"Java")
        developer.work()    // -> Esta persona esta desarrollando y programando
        developer.sayLanguage() // -> Este desarrrollador usa el lenguaje Java
        developer.goToWork()    // -> Esta persona va  a estudiar
        developer.drive()       // -> Esta persona conduce un coche

        val designer = Designer("Itai", 26)
        designer.work()     // -> Esta persona esta diseñando
    }


    private fun interfaces() {

        /**
         * 17 - INTERFACES
         *
         * Pueden contener declaraciones abstractas o implementaciones de funciones o propiedades
         * La diferencia con las clases abstractas es que las interfaces nunca
         * pueden almacenar estado.
         *
         * Usaremos la interface: Game.kt
         * Clase: Person.kt
         */

        val gamer = Person("Minka",24)
        gamer.play()    //-> Esta persona esta jugando Among Us
        gamer.stream()  //-> Estoy haciendo stream de mi juego Among Us
    }


    private fun visibilityModifiers() {

        /**
         * 18 - MODIFICADORES DE VISIBILIDAD
         *
         * Las clases, objetos, interfaces, constructores, funciones y propiedades
         * y accesos get/set pueden tener modificadores de visibilidad
         *
         * Tenemos 4:
         *  Private - Protected - Internal - Public
         *
         *  Usaremos las clases: Visibility.kt
         */

        // La clase es privada, si fuese publica podriamos acceder
        /*
        val visibility = Visibility()
        visibility.sayName()        // -> No tengo nombre
        visibility.name = "Minka"
        visibility.sayName()        // -> Mi nombre es Minka
        */

    }


    private fun dataClasses() {

        /**
         * 19 - DATA CLASSES
         *
         * Son unicamente para almacenar datos
         *
         * Data class: Worker.kt
         *
         */

        val mk = Worker("Minka",24,"Desarrollador")
        mk.lastWord = "Musico"

        val it = Worker("Itai")

        // equals & hashCode - Comparar objetos
        if (mk.equals(it)) {
            println("Son iguales")
        } else {
            println("No son iguales")   // -> No son iguales
        }

        val min = Worker("Minka",24,"Desarrollador")
        min.lastWord = "Musico"
        if (mk == it) {
            println("Son iguales")      // -> Son iguales
        } else {
            println("No son iguales")
        }

        // toString
        println(mk.toString())  // -> Worker(name=Minka, age=24, work=Desarrollador)

        // copy
        val mk2 = mk.copy(age=25)
        println(mk.toString())  // -> Worker(name=Minka, age=24, work=Desarrollador)
        println(mk2.toString()) // -> Worker(name=Minka, age=25, work=Desarrollador)

        // componentN
        val(name,age) = mk
        println(name)   // -> Minka
        println(age)    // -> 24
    }

    var myMap: MyMapList = mutableMapOf()
    private fun typeAliases() {

        /**
         * 20 - TYPE ALIASES
         */
        var myNewMap: MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Minka","mk")
        myNewMap[2] = arrayListOf("Abcdef","ab")
        myMap= myNewMap
    }


    private fun destructuringDeclarations() {

        /**
         * 21 - DESTRUCTURING DECLARATIONS
         *
         * Estructurar en varios fragmentos
         *
         * Data Class: Worker.kt
         */

        val (name, _ , work) = Worker("Minka",24,"Desarrollador")
        println("$name, $work")   // -> Minka, Desarrollador

        val mk =  Worker("Minka",24,"Desarrollador")
        println(mk.component1())    // -> Minka

        val (nameW, ageW) = myWorker()
        println("$nameW, $ageW")    // -> Minka, 24

        val myMap = mapOf(1 to "Minka",2 to "Brisa", 3 to "Magui")
        for ((id,name) in myMap) {
            println("$id, $name")
        }
        // -> 1, Minka
        // -> 2, Brisa
        // -> 3, Magui
    }

    fun myWorker(): Worker{
        return Worker("Minka",24,"Desarrollador")
    }

    fun extensions(){

        /**
         * 22 - EXTENSIONS
         *
         * Nuevas funciones de librerias de terceros
         *
         * File: Extensions.kt
         */
        val myDate = Date()
        println(myDate.customFormat())
        println(myDate.formatSize)

        var myDateNullable: Date? = null

        println(myDateNullable.customFormat())
    }


    private fun lambda() {

        /**
         * 23 - LAMBDA
         *
         * Nos permite trabajar una funcion de orden superior con otras funciones
         */

        var myIntList = arrayListOf(1,2,3,4,5,6,7,8,9,10)

        var myFilterIntList = myIntList.filter{ myInt ->

            println(myInt)
            if (myInt == 1) {
                return@filter true
            }
            myInt > 5
        }

        println(myFilterIntList)    // -> [1,6,7,8,9,10]

        val mySumFun = fun (x: Int, y: Int): Int = x + y
        val myMulFun = fun (x: Int, y: Int): Int = x * y

        println(myOperateFun(5,10,mySumFun))    // -> 15
        println(myOperateFun(5,10,myMulFun))    // -> 50

        println(myOperateFun(5,10){ x, y -> x-y})   // -> -5
    }

    private fun myOperateFun (x: Int, y: Int, myFun: (Int, Int) -> Int) :Int {
        return myFun(x,y)
    }
}