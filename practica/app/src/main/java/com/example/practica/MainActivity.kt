package com.example.practica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var user : EditText
    lateinit var password : EditText
    lateinit var btnlog : Button
    var pass : String = "hola"
    var use : String = "jony"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        user = findViewById(R.id.user)
        password = findViewById(R.id.password)
        btnlog = findViewById(R.id.btnLog)



        btnlog.setOnClickListener(new View.OnClickListener){
            @Override





          //  Toast.makeText(getApplicationContext(), "bienvenido", Toast.LENGTH_SHORT).show()
        }


    }
   /* fun showSnackbar(message:String){

        val snackbar = Snackbar.make(findViewById<View>(android.R.id.content),message, Snackbar.LENGTH_SHORT)
        snackbar.show()
    }*/

}