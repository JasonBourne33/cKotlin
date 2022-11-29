package com.example.ckotlin

fun main() {


    val list= listOf("Apple","Banana","Pear","Grape")

//    val result= with(StringBuffer()){
//        append("start eating fruits.\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("ate all fruits.")
//        toString()
//    }
//
//    val result= StringBuilder().run{
//        append("start eating fruits.\n")
//        for (fruit in list){
//            append(fruit).append("\n")
//        }
//        append("ate all fruits.")
//        toString()
//    }
//    println(result)

    val result= StringBuilder().apply{
        append("start eating fruits.\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("ate all fruits.")
    }
    println(result.toString())
}

