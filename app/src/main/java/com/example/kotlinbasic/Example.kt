package com.example.kotlinbasic

import com.example.kotlinbasic.model.House
import com.example.kotlinbasic.model.Person

val map = hashMapOf<String, Person>()

fun update(id: String, person: Person) = map[id]?.let {
    it.apply {
        name = person.name
        age = person.age
    }.also {
        println("update : ${it.name}")
    }
}

inline fun <T, R> T.anything(block: T.(T) -> R): R {
    return block(this)
}

fun main() {
/*  map["1"] = Person("an", 22)
    update("1", Person("Van An", 23))*/

    val house = House("Văn An", "63")
    val a = house.anything {
        //scope
    }
}
