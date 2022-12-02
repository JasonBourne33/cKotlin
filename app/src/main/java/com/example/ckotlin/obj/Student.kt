package com.example.ckotlin.obj

import com.example.helloworld.Study

//2.5.3 接口
class Student(name: String, age: Int) : Person(name,age),Study{
    override fun readBooks() {
        println(name+" is reading.")

    }

//    override fun doHomework() {
//        println(name+" is doing homework.")
//    }
}


//2.5.2 继承与构造函数
//class Student(val sno: String, val grade: Int, name: String, age: Int) :
//    Person(name, age) {
//    constructor(name: String, age: Int) : this("", 0, name, age){
//
//    }
//    constructor(): this("",0){
//
//    }
//
//    init {
//        println("sno is" + sno)
//        println("grade is" + grade)
//    }
//}
//
//fun main() {
//    val student1=Student()
//    val student2=Student("Jack",33)
//    val p = Student("a123", 66, "Jack", 19)
////    p.name = "Jack"
////    p.age = 19
//}