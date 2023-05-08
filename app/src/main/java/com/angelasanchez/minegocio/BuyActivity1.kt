package com.angelasanchez.minegocio

import android.content.Intent
import android.net.Uri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.angelasanchez.minegocio.R.*
import com.angelasanchez.minegocio.R.id.*

//conexion del fragment a la activity por medio del id es llamado//
class BuyActivity1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_buy1)




        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(fragment_container_view, BuyFragment::class.java, null, "buy")
                .commit()

        }


    }



    }








