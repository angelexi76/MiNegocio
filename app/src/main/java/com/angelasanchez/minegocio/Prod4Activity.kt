package com.angelasanchez.minegocio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class Prod4Activity : AppCompatActivity() {
    private lateinit var btnBuy4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod4)
        setSupportActionBar(findViewById(R.id.my_barra))

        btnBuy4 = findViewById<Button>(R.id.btnBuy4)
    }



    @SuppressLint("SuspiciousIndentation")
    fun buttonBuy(view: View){

        btnBuy4.setOnClickListener {

        }
        val buys = Intent(this, BuyActivity1::class.java)
        startActivity(buys)
    }
    //menu//
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    //when evalua si el item q se pulso coincide con el  R.id.txv_action_search    si es true creamos la funcion anonima  -> q defina la accion a realizar
    override fun onOptionsItemSelected(item: MenuItem): Boolean =when(item.itemId) {
        R.id.txv_action_search-> {
            Toast.makeText(this,R.string.txv_action_search, Toast.LENGTH_LONG).show()
            true

        }

        R.id.tvx_action_logout-> {
            Toast.makeText(this, R.string.txv_action_logout, Toast.LENGTH_LONG).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}