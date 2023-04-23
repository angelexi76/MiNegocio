package com.angelasanchez.minegocio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.angelasanchez.minegocio.R.*


//private operator fun Int.plus(s: String) {

//}

class Prod1Activity : AppCompatActivity() {

    //button buy
    private lateinit var btnBuy1:Button

    //variables contador
    var contador: Int =0
    private lateinit var textBox:TextView
    private lateinit var btn_sum:Button
    private lateinit var btn_rest:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layout.activity_prod1)
        setSupportActionBar(findViewById(id.my_barra))

        //button buy
          btnBuy1 = findViewById<Button>(id.btnBuy1)

//contador

          btn_sum = findViewById<Button>(id.btn_sum)

          btn_rest = findViewById<Button>(id.btn_rest)

          //textBox=findViewById<TextView>(id.textBox)

    }



    fun add1(view: View){
        contador ++

        btn_sum.setOnClickListener{
            textBox.text.toString()
        }
    }


     fun subtract1(view: View) {
         contador--
         btn_rest.setOnClickListener{

         }
         textBox.text.toString()
     }
   //la variable contador es un entero,se agrega tostring para convertirla en texto al actualizar el   textbox q es el textview







        @SuppressLint("SuspiciousIndentation")
        fun buttonBuy(view: View){

            btnBuy1.setOnClickListener {

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
         override fun onOptionsItemSelected(item: MenuItem): Boolean =when(item.itemId) {
             id.txv_action_search-> {
                 Toast.makeText(this, string.txv_action_search,Toast.LENGTH_LONG).show()
                 true

             }

              id.tvx_action_logout-> {
                    Toast.makeText(this, string.txv_action_logout, Toast.LENGTH_LONG).show()
                    true
                }
                    else -> {
                        super.onOptionsItemSelected(item)
              }
         }



}
