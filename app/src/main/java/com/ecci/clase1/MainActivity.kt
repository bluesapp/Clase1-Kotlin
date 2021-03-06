package com.ecci.clase1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton1 = findViewById<Button>(R.id.myButton1)
        val myButton2 = findViewById<Button>(R.id.myButton2)
        val myButton3 = findViewById<Button>(R.id.myButton3)
        val myButton4 = findViewById<Button>(R.id.myButton4)
        val myButton5 = findViewById<Button>(R.id.myButton5)
        val myEditText = findViewById<EditText>(R.id.myEditText)
        val myTextView = findViewById<TextView>(R.id.myTextView)


        myButton1.setOnClickListener {
            if(myTextView.text == ""){
                myTextView.text = "Actividad Botones"
                myTextView.setTextColor(Color.parseColor("#FF00FF"))
            }else{
                myTextView.text = myEditText.text.toString()
                myTextView.setTextColor(Color.parseColor("#FCFF33"))
                myEditText.text.clear()
            }

            return@setOnClickListener
        }

        myButton2.setOnClickListener {
            if(myTextView.text == ""){
                myTextView.text = "Actividad Botones"
                myTextView.setTextColor(Color.parseColor("#FF00FF"))
            }else{
                myTextView.text = myEditText.text.toString()
                myTextView.setTextColor(Color.parseColor("#333BFF"))
                myEditText.text.clear()
            }
            return@setOnClickListener
        }

        myButton3.setOnClickListener {
            if(myTextView.text == ""){
                myTextView.text = "Actividad Botones"
                myTextView.setTextColor(Color.parseColor("#FF00FF"))
            }else {
                myTextView.text = myEditText.text.toString()
                myTextView.setTextColor(Color.parseColor("#FF0000"))
                myEditText.text.clear()
            }
            return@setOnClickListener
        }

        myButton4.setOnClickListener {
            if(myTextView.text == ""){
                myTextView.text = "Actividad Botones"
                myTextView.setTextColor(Color.parseColor("#FF00FF"))
            }else {
                myTextView.text = myEditText.text.toString()
                myTextView.setTextColor(Color.parseColor("#008000"))
                myEditText.text.clear()
            }
            return@setOnClickListener
        }

        myButton5.setOnClickListener {
            if(myTextView.text == ""){
                myTextView.text = "Actividad Botones"
                myTextView.setTextColor(Color.parseColor("#FF00FF"))
            }else {
                myTextView.text = myEditText.text.toString()
                myTextView.setTextColor(Color.parseColor("#800000"))
                myEditText.text.clear()
            }
            return@setOnClickListener
        }
    }

}