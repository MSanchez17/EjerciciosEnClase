/* Marielos Guadalupe Sanchez Martinez **/
package com.example.kotlinbasico
fun main(){
    println("Operador Elvis")
    var version: Int?=3
    println("La version actual de Android es: $version")
    version=null
    println("La version actual de Android  es: $version")
    println("La version actual de Android es: ${version?:-8}")
    println("Operadores Aritmeticos")
    print("Ingrese el primer numero")
    var num1=readln().toInt()
    print("Ingrese el segundo numero")
    var num2=readln().toInt()
    println("La suma es: ${num1+num2}")
    println("Operadores de incremento")
    var x:Int=10
    var xmas = ++x
    var xmenos=x++
    println(xmas)
    println(xmenos)
    println("Operadores Logicos")
    var esIgual: Boolean = (3==3)
    println(esIgual)
    var noEsIgual: Boolean =(3!=2)
    println(noEsIgual)
    println("Operadores Logicos")
    val valorO=(1==1 || 1==5)
    println("or: $valorO")
    val valorY =(1==1 && 1==5)
    println("an: $valorY")
    val valorMenorOIgualque =(1<=2)
    println("Menor que: $valorMenorOIgualque")
    val  valorMayorOIgualque =(3>=1)
    println("Mayor que: $valorMayorOIgualque")
    val valorMenor = (3<1)
    println("Menor: $valorMenor")
    val valorMayor = (5>1)
    println("Mayor: $valorMayor")
}