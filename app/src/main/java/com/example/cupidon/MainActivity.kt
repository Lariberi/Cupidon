package com.example.cupidon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val NM1 = findViewById(R.id.Name1) as EditText
        val NM2 = findViewById(R.id.Name2) as EditText


        val textView: TextView = findViewById(R.id.TextItog)


        val button: Button = findViewById(R.id.button1)


            button.setOnClickListener {
                val name1: String = NM1.text.toString()
                val name2: String = NM2.text.toString()
                textView.text = (60..110).random().toString()
                if(name1.trim().length>0) {

                }else{
                    Toast.makeText(applicationContext, "ввели имя1", Toast.LENGTH_SHORT).show()
                    textView.text = "введи имя1"
                }
                if(name2.trim().length>0) {

                }else{
                    Toast.makeText(applicationContext, "ввели имя2", Toast.LENGTH_SHORT).show()
                    textView.text = "введи имя2"
                }

            }




    }
}
