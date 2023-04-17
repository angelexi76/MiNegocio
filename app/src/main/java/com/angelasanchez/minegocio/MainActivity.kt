package com.angelasanchez.minegocio


import android.content.Intent


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity() {




  
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




       }
    fun start(btn1:View)
    {

        val inicio= Intent(this,RegisterActivity::class.java)
        startActivity(inicio)
    }

       //val indica que este objecto no puede cambiar su valor o su informacion
           // es inmutable






    }




