package com.example.kotlinbasic

import com.example.kotlinbasic.model.House


fun main() {
    val house = House("Võ Văn An", "63").also {
        it.owner = "Văn An"
    }

    val numbers = mutableListOf("1", "2", "3", "4")
    numbers.also {
        print("Size trước khi thêm vào : ${it.size}")
    }.add("5")
}
