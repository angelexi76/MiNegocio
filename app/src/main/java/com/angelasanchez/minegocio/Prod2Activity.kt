package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button

class Prod2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod2)
        setSupportActionBar(findViewById(R.id.my_barra))


    }

    fun card2(View: View) {


        val cakes = Intent(this, Prod3Activity::class.java)
        startActivity(cakes)

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}