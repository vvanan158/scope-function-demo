package com.example.kotlinbasic

import com.example.kotlinbasic.model.Person

fun main() {
    val person = Person("Võ Văn An", 22)
    person.run()
    person.idle()
    person.jump()

    with(person) {
        run()
        idle()
        jump()
    }

    val array = arrayListOf<Person>()
    with(array) {
        add(Person("Võ Văn An", 22))
        add(Person("Võ Văn Khang", 22))
        add(Person("Trần Huy Hùng", 22))
    }
}
