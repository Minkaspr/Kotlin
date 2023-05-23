package com.example.kotlin

class Programmer (val name: String,
                  var age: Int,
                  val languages: Array<Language>,
                  val friends: Array<Programmer>? = null) {
    /*
    * Clase programador
    *
    * con 3 propiedades
    * */

    // Enumerado, solo estan permitidos esos parametros
    enum class Language {
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code() {
        for (language in languages){
            println("Estoy programando en $language")
        }
    }


}