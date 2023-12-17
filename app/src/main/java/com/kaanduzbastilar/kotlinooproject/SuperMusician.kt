package com.kaanduzbastilar.kotlinooproject

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {
    fun sing(){
        println("nothing else matters")
    }
}