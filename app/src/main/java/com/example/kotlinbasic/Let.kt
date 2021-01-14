package com.example.kotlinbasic

import com.example.kotlinbasic.model.House

fun main(args: Array<String>) {
    val something = House("Võ Văn An", "63").let { it ->
        it.owner
    }

    val isAddress = House("Võ Văn An", "63").let {
        it.owner == "Võ Văn An"
    }
    println(isAddress)

    val house: House? = null
    var owner: String = ""
    if (house != null) {
        owner = house.owner
        print("owner : $owner")
    }

    var value = house?.let {
        print("owner : ${it.owner}")
        it.owner
    }
}
