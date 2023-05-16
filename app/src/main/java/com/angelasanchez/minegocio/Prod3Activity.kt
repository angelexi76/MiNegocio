package com.angelasanchez.minegocio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.angelasanchez.minegocio.R.*
import com.angelasanchez.minegocio.R.id.btn_buy1




class Prod3Activity : AppCompatActivity() {

    //button buy
    private lateinit var btn_buy1: Button

    //variables contador
    var contador = 0

    private lateinit var btn_sum: Button
    private lateinit var btn_rest: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layout.activity_prod3)
        setSupportActionBar(findViewById(id.my_barra))

        //button buy
        btn_buy1 = findViewById(id.btn_buy1)

//contador

        btn_sum = findViewById<Button>(/* id = */ id.btn_sum)
        btn_rest = findViewById<Button>(id.btn_rest)


    }
    fun add1(view: View) {



        btn_sum.setOnClickListener{
            contador++

            contador

            btn_sum.text=contador.toString()
        }

    }


    fun subtract1(view: View) {


        btn_rest.setOnClickListener {
            contador--

            contador

            btn_rest.text=contador.toString()
        }

    }
    //la variable contador es un entero,se agrega tostring para convertirla en texto


    @SuppressLint("SuspiciousIndentation")
    fun buttonBuy(view: View) {

        btn_buy1.setOnClickListener {

        }
        val buys = Intent(this, BuyActivity1::class.java)
        startActivity(buys)
    }


    //acciones del menu,sobreescribimos el metodo onCreateOptionsMenu que pide parametros de tipo menu y es bool
//  menuInflater.inflate  convierte el xml en su representacion grafica
    //retorna de la clase padre y el parametro es el menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //when evalua si el item q se pulso coincide con el  R.id.txv_action_search    si es true creamos la funcion anonima  -> q defina la accion a realizar
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        id.txv_action_search -> {
            Toast.makeText(this, string.text_action_search, Toast.LENGTH_LONG).show()
            true

        }

        id.tvx_action_logout -> {
            Toast.makeText(this, string.text_action_logout, Toast.LENGTH_LONG).show()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }




}