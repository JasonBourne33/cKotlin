package com.example.ckotlin.obj

open class Person(val name: String, val age: Int) {
//    var name = ""
//    var age = 0

    fun eat() {
        println(name + " is eating. He is " + age + " years old")
    }
}

fun main() {
    val p = Person("Jack",19)
//    p.name = "Jack"
//    p.age = 19
    p.eat()
}