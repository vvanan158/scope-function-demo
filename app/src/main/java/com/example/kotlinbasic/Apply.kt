package com.example.kotlinbasic

import com.example.kotlinbasic.model.Person

fun main() {
    Person().apply {
        name = "Võ Văn An"
        age = 22
        passport = "3692"
    }

    val person = Person()
            .name("Võ Văn An")
            .age(22)
            .passport("3692")
    print(person)
}
