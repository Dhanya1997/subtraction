package com.example.subtraction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sub(view: View) {
        var getno1=findViewById<EditText>(R.id.no1)
        var getno2=findViewById<EditText>(R.id.no2)
        var res=getno1.text.toString().toInt()-getno2.text.toString().toInt()
        Toast.makeText(this,res.toString(),Toast.LENGTH_LONG).show()
    }
}