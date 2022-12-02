package com.example.helloworld

import com.example.ckotlin.obj.Student

interface Study {

    fun readBooks()

    fun doHomework() {
        println("do homework default implementation.")
    }

}

fun main() {
    val student=Student("Jack",66)
    doStudy(student)
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()

}
