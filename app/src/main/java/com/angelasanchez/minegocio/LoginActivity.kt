package com.angelasanchez.minegocio

import android.content.Intent
import android.media.metrics.LogSessionId
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

// estos dos objetos  guardaran la informacion del editext por eso son variables privadas
    //son mutables pueden cambiar su infomacion
    //?significa que puede ser nula la variable

    private var email: EditText? = null
    private var password: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

                                   //inicializamos para guardar alli lo q traigan las variables

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

    }
                                   //funcion login con parametro de tipo view o vista y condicional para validacion del usuario y contraseña


    fun login(login: View) {

                                   //atraves del objecto email extraigo la info del editext .text extrae el text y lo convierte a string con to.string
        if (email!!.text.toString() == "ifa@email.com") {
                                  //si esto es == se va al a otra condicion si es == 1234
                                  //!!valido que el objecto no este nulo cuando extraiga la info

            if (password!!.text.toString() == "1234") {

              val entrar = Intent(this,prod1Activity::class.java)

              startActivity(entrar)
            }

        }

    }
}