package com.example.kotlinbasic

import com.example.kotlinbasic.model.House
import java.util.*

fun main() {
    val name = House("Võ Văn An", "63").run {
        this.owner
    }

    val nameSecond = run {
        House("Võ Văn An", "63").owner
    }

    val something = "Sun*"
    run {
        val something = "Sun*-asterisk"
    }
    println(something)

    val date: Int = Calendar.getInstance().run {
        set(Calendar.YEAR, 2020)
        get(Calendar.DAY_OF_MONTH)
    }
    println("date : $date")
}
