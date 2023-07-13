package com.example.loginuser1

class User(username: String, pass: String, email: String, dni: Double) {
    var username : String
    var pass : String
    var email : String
    var dni : Double

    init{
        this.username = username
        this.pass = pass
        this.email = email
        this.dni = dni
    }
}