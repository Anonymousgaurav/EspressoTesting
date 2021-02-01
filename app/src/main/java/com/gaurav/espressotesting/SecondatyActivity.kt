package com.gaurav.espressotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondaty.*

class SecondatyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondaty)


        button_back.setOnClickListener {
            onBackPressed()
        }
    }
}