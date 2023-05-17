package com.angelasanchez.minegocio.db_minegocio

import androidx.room.Entity
import androidx.room.vo.Entity

//la class es de tipo data creamos la llave primaria que es autogenerada y que el nosmbre de la variable que representa la columna id retorna un entero la siguente columna es email y asi...si requiero mas tablas creo mas clases


@Entity
data class Register(
    @primarykey(autoGenerate = true) val id:Int,
     val email:String?,
     val name:String?,
     val password:String?

)
