package com.angelasanchez.minegocio

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts


class MainActivity : AppCompatActivity() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       fun start ( button1:View){



        //Creation object  con intent por medio de la class R que identification los id para los events  different  botones
       //val indica que este objecto no puede cambiar su valor o su informacion
           // es inmutable

        val inicio= Intent(this,LoginActivity::class.java)
           startActivity(inicio)


       }




    }

}



