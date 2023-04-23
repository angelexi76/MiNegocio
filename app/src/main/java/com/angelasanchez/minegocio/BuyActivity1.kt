package com.angelasanchez.minegocio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BuyActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy1)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, BuyFragment::class.java , null ,"buy")
                .commit()


        }
    }
    }



