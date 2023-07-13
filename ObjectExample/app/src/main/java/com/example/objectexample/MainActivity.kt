package com.example.objectexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.objectexample.Objects.User

class MainActivity : AppCompatActivity() {
    lateinit var testUser : User
    dni = testUser.dni

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testUser = User("jony","46919450")





    }
}




//inicialización tardio
// lateinit var name : String

//inicialización en el momento
//var name : String = "pepe"
//var dni : Int = 1234