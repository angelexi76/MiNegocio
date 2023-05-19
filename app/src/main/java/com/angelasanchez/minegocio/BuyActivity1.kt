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

    private lateinit var btn_w: Button

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

// La forma correcta de establecer el paquete de destino en el intent es utilizando
// la instancia intent creada previamente, en lugar de utilizar la clase Intent



    fun send(view: View){
        btn_w.setOnClickListener{

            val phoneNumber = "+3138322498"
            val message = "Welcome,to Mafe artisan pastry"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$phoneNumber/?text=$message")
            intent.setPackage("com.whatsapp");
            startActivity(intent)
        }
    }

    }








