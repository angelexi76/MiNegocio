package com.angelasanchez.minegocio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

     private var name:EditText?=null
     private var email:EditText?=null
     private var password:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        name=findViewById<EditText>(R.id.name)
        email=findViewById<EditText>(R.id.email)
        password=findViewById<EditText>(R.id.password)

    }
        fun registro (btn2:View){
            if (name!!.text.toString()=="user"){
            }
                if (email!!.text.toString()=="user@"){
                }

                    if (password!!.text.toString()=="1234"){
    }

                        val register= Intent(this,LoginActivity::class.java)
                        startActivity(register)




        }

}


