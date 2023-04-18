package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

private operator fun Int.plus(s: String) {

}
class Prod1Activity : AppCompatActivity() {

    var contador: Int = 0
    private lateinit var text: View
    private lateinit var btnsum: Button
    private lateinit var btnrest: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contador = 0
        setContentView(R.layout.activity_prod1)
        setSupportActionBar(findViewById(R.id.my_barra))

        btnsum = findViewById<Button>(R.id.btnsum)

        btnsum.setOnClickListener {
            OnClickListener() {
                contador++
                btnsum.text = contador.toString()
            }
        }

        btnrest = findViewById<Button>(R.id.btnrest)
        btnrest.setOnClickListener {
            OnClickListener() {
                contador--
            }
        }

        text = findViewById<Button>(R.id.text)

        text.setOnClickListener {
            OnClickListener() {

                btnsum.text = (contador + "").toString()
                btnrest.text = (contador + "").toString()
            }


        }


    }








        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return super.onCreateOptionsMenu(menu)
        }

}