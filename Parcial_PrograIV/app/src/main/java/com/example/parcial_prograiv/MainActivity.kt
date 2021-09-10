package com.example.parcial_prograiv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun sentenciaIf()
    {

        val color = "azul"

        if(color == "azul")
        {
            println("$color" )
        }
        else
        {
            println("color no encontrado")
        }
    }

    private fun SentenciaWhen()
    {

        val tipoComida = "Tamales"

        when(tipoComida){
            "Tamales" ->{
                println("El pais de origen es: El salvador, Honduras, Mexico")
            }
            "Pupusas" ->{
                println("El pais de origen es: El salvador")
            }
            "Baleadas" ->{
                println("El pais de origen es: Honduras")
            }
            "Gorditas" ->{

                println("El pais de origen es: Mexico")
            }
            else ->{
                println("No se conoce el pais de Origen")
            }
        }



    }

    private fun Bucle()
    {

        for(x in 0..10){
            println(x)
        }
        for(x in 0..10 step 2){
            println(x)
        }
        for(x in 10 downTo 0 step 1){
            println(x)
        }
        for(x in 10 downTo 0 step 3){
            println(x)
        }


    }












}