/*Marielos Guadalupe Sanchez Martinez**/
package com.example.kotlinbasico

fun main(){
    println("Sentencias o Condicionales")
    print("a: ")
    val a = readln().toInt()
    print("b: ")
    val b = readln().toInt()
    println("Sentencia If ")
    if (false)
        println("la sentencia se cumplio")
    else
        println("La sentencia no se cumplio")
    println("Sentencia If Else")
    if (a<b)
        println("a es menor que b")
    else
        println("a es mayor que b")
    var comparacion = (a<b)
    println("Sentencia If Else If")
    if (comparacion)
        println(comparacion)
    else if (a==b)
        println("no se usa la var comparacion")
    else
        println(comparacion)
    println("Sentencia when")
    print("Ingresa tu nombre para ver tu salario")
    val nombre=readln()
    when (nombre ){
        "Lucas"-> println("Tu salario es de 100,000.00")
        "Tommy"-> println("Tu salario es 200,000.00")
        "Jair"-> println("Tu salario es de 300,000.00")
        "Marielos"-> {
            println("Tu salario es de 400,000.00")
            println("Tu salario es de 100,000.00")
            println("Tu salario es de 500,000.00")
        }
        else -> println("Y voz que onda..!")
        }
}