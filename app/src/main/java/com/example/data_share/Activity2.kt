package com.example.data_share

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val tvname = findViewById<TextView>(R.id.tvame)
        val tvountry = findViewById<TextView>(R.id.tvcountry)
        val tvage = findViewById<TextView>(R.id.tvage)
        val persondata = intent.getSerializableExtra("person_data") as mydata
        tvname.text = persondata.name
        tvountry.text = persondata.country
        tvage.text = persondata.age.toString()


    }
}