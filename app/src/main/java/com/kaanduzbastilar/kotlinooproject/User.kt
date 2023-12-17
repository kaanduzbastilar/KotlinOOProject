package com.kaanduzbastilar.kotlinooproject

class User : People {
    //property
    var name : String? = null
    var age : Int? = null
    //contructor vs init

    constructor(nameInput:String, ageInput:Int){
        this.name = nameInput
        this.age = ageInput
    }

    init {
        println("init")
    }


}