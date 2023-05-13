package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast


class ProdActivity : AppCompatActivity() {

    private lateinit var fruit:TextView
    private lateinit var them:TextView
    private lateinit var favor:TextView
    private lateinit var cup1:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod)
        setSupportActionBar(findViewById(R.id.my_barra))


        fruit = findViewById<TextView>(R.id.fruit)
        them  = findViewById<TextView>(R.id.them)
        favor = findViewById<TextView>(R.id.favor)
        cup1  = findViewById<TextView>(R.id.cup1)


    }

    fun fruit1(View: View) {

        fruit.setOnClickListener {

        }
        val fruit1 = Intent(this, Prod1Activity::class.java)
        startActivity(fruit1)

    }

    fun theme(View: View) {

        them.setOnClickListener {

        }
        val themes = Intent(this, Prod2Activity::class.java)
        startActivity(themes)

    }

    fun cake(View: View) {

        favor.setOnClickListener {

        }
        val cakes = Intent(this, Prod3Activity::class.java)
        startActivity(cakes)

    }

        fun cup(View: View) {

            cup1.setOnClickListener {

            }
            val cups = Intent(this, Prod4Activity::class.java)
            startActivity(cups)
        }






    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    //when evalua si el item q se pulso coincide con el  R.id.txv_action_search    si es true creamos la funcion anonima  -> q defina la accion a realizar
    override fun onOptionsItemSelected(item: MenuItem): Boolean =when(item.itemId) {
        R.id.action_search -> {
            Toast.makeText(this,R.string.text_action_search, Toast.LENGTH_LONG).show()
            true

        }

        R.id.action_logout -> {
            Toast.makeText(this, R.string.text_action_logout, Toast.LENGTH_LONG).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
    }

