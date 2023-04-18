package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.angelasanchez.minegocio.R.*
import com.angelasanchez.minegocio.R.id.frut

class ProdActivity : AppCompatActivity() {

    private lateinit var frut:TextView
    private lateinit var them:TextView
    private lateinit var favor:TextView
    private lateinit var cup1:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_prod)


        frut= findViewById<TextView>(id.frut)
        them = findViewById<TextView>(id.them)
        favor = findViewById<TextView>(id.favor)
        cup1 = findViewById<TextView>(id.cup1)


    }

    fun fruit1(View: View) {

        frut.setOnClickListener {

        }
        val frut1 = Intent(this, Prod1Activity::class.java)
        startActivity(frut1)

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
    }

