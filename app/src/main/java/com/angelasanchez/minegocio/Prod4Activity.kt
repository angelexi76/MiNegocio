package com.angelasanchez.minegocio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class Prod4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod4)
        setSupportActionBar(findViewById(R.id.my_barra))
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}