package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

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


   // atraves del objecto email extraigo la info del editext .text extrae el text y lo convierte a string con to.string
    //si esto es == se va al a otra condicion si es == 1234
    //!!valido que el objecto no este nulo cuando extraiga la info //
    fun login(login: View) {



        if (email!!.text.toString() == "user@" && password!!.text.toString() == "1234") {
            val alert=AlertDialog.Builder(this).setTitle("WELCOME")
                .setMessage("Login").create().show()

            }

                else{
                    val alert=AlertDialog.Builder(this).setTitle("ERROR")
                        .setMessage("user or password are wrong").create().show()
                }

                       val init = Intent(this,ProdActivity::class.java)

                       startActivity(init)





    }
}