package com.example.kotlinbasic.model

data class Person(var name: String = "", var age: Int = 0, var passport: String = "") {

    fun name(name: String) = apply { this.name = name }

    fun age(age: Int) = apply { this.age = age }

    fun passport(passport: String) = apply { this.passport = passport }

    fun run() = println("run")

    fun jump() = println("jump")

    fun idle() = println("idle")
}
