/* Marielos Guadalupe Sanchez Martinez **/
package com.example.kotlinbasico
import kotlinx.coroutines.processNextEventInCurrentThread
fun main(){
    //booleanos
    val soyPatepluma=true
    println("Soy Patepluma $soyPatepluma")
    println("Numeros enteros")
    var entero: Int = 120
    println("Valor de la variable entero: $entero")
    val milisegundos: Long = 21_474_836_471L
    println("El valor de la variable milisegundos: $milisegundos")
    println("Numero Decimales")
    val pi: Float =3.1416F
    println("Valor de la variable pi: $pi")
    println("Cadenas de caracteres")
    val nombre: String = "Carlos"
    println("El valor de la variable nombre: $nombre")
    val casosespeciales: String = "Hola, soy \\n\" Carlos"
    println(": $casosespeciales")
    println("Concatenacion")
    print("Ingresa tu nombre: ")
    val nombrecompleto =readln()
    println("Hola $nombrecompleto")
    println("Hola" +nombrecompleto)
    println("NULABILIDAD")
    var sobreNombre: String?=null
    sobreNombre="Macaco"
    println("La longitud de la variable nombres es: ${sobreNombre!!.length}")
    sobreNombre=null
    println("La longitud de la variable nombre es: ${sobreNombre?.length}")
}