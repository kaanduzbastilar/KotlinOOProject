package com.kaanduzbastilar.kotlinooproject

open class Musician(name:String, instrument:String, age:Int) {

    //Encapsulation
    var name : String? = name
        private set
        get

    private var instrument: String? = instrument

    var age: Int? = age
        private set //okunabilir - değiştirilemez
        get

    private var bandName: String = "Metallica"

    fun returnBandName(password: String) : String{
        if (password == "test"){
            return bandName
        }else{
            return "Wrong password!"
        }
    }

}