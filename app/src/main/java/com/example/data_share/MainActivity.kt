package com.example.data_share

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val save=findViewById<Button>(R.id.button)
        save.setOnClickListener {
            Intent(this, Activity2::class.java).also {

                val name= findViewById<EditText>(R.id.etname).text.toString()
                val age=findViewById<EditText>(R.id.etage).text.toString().toInt()
                val country=findViewById<EditText>(R.id.etcountry).text.toString()
                val persondata=mydata(name,country,age)
                it.putExtra("person_data", persondata)
                startActivity(it)

            }
        }


    }
}