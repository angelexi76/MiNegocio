package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


//private operator fun Int.plus(s: String) {

//}//


class Prod1Activity : AppCompatActivity() {

    private var contador: Int = 0
    private lateinit var text: View
    private lateinit var btnsum: Button
    private lateinit var btnrest: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_prod1)

        setSupportActionBar(findViewById(R.id.my_barra))

        btnsum = findViewById<Button>(R.id.btnsum)
        btnrest = findViewById<Button>(R.id.btnrest)
        text=findViewById<Button>(R.id.text)






    fun add1(){
        btnsum.setOnClickListener {
        }
        contador++
        btnsum.text=contador.toString(contador)

    }

     fun subtract1(view: View) {
         btnsum.setOnClickListener {
         }
         contador--
         btnrest.text=contador.toString(contador)
}


    fun textcontador(){
        text.setOnClickListener {

        }


    }

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
             R.id.txv_action_search-> {
                 Toast.makeText(this,R.string.txv_action_search,Toast.LENGTH_LONG).show()
                 true

             }

              R.id.txv_action_search-> {
                    Toast.makeText(this, R.string.txv_action_logout, Toast.LENGTH_LONG).show()
                    true
                }
                    else -> {
                        super.onOptionsItemSelected(item)
              }
         }

}
