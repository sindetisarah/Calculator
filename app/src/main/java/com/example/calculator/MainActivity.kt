package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //initialising all the variables casting them to main activity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etFirstNumber=findViewById<EditText>(R.id.etFirstNumber)
        var etSecondNumber=findViewById<EditText>(R.id.etSecondNumber)
        var tvResult=findViewById<TextView>(R.id.tvResult)
        var btnAdd=findViewById<Button>(R.id.btn1)
        var btnSubtract=findViewById<Button>(R.id.btn2)
        var btnMultiply=findViewById<Button>(R.id.btn3)
        var btnModulus=findViewById<Button>(R.id.btn4)

        btnAdd.setOnClickListener {
            var firstNumber=etFirstNumber.text.toString().toInt()
            var secondNumber=etSecondNumber.text.toString().toInt()
            var sum=firstNumber+secondNumber
            tvResult.text="$sum"

        }
        btnSubtract.setOnClickListener {
            var firstNumber=etFirstNumber.text.toString().toInt()
            var secondNumber=etSecondNumber.text.toString().toInt()
            var sub=firstNumber-secondNumber
            tvResult.text="$sub"

        }
//
        btnMultiply.setOnClickListener {
            var firstNumber=etFirstNumber.text.toString().toInt()
            var secondNumber=etSecondNumber.text.toString().toInt()
            var multiply=firstNumber*secondNumber
            tvResult.text="$multiply"



        }
        btnModulus.setOnClickListener {
            var firstNumber=etFirstNumber.text.toString().toInt()
            var secondNumber=etSecondNumber.text.toString().toInt()
            var modulus=firstNumber%secondNumber
            tvResult.text="$modulus"


        }
    }



}