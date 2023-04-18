package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button

class Prod3Activity : AppCompatActivity() {

    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod3)
        setSupportActionBar(findViewById(R.id.my_barra))

        button2 = findViewById<Button>(R.id.button2)
        button3 = findViewById<Button>(R.id.button3)
    }

    fun card3(View: View) {


        val cakes = Intent(this, Prod3Activity::class.java)
        startActivity(cakes)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}