package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buGetAge.setOnClickListener{

            //  Add code run when button click
            val userDOB = Integer.parseInt(etDOB.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears = currentYear - userDOB
            tvShowAge.text = "Your Age is $userAgeInYears Years"


        }


    }
}