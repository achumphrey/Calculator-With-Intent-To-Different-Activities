package com.example.calculatorwithintenttodifferentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.results_operations.*

class SubtractActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_operations)

        var intent : Intent = getIntent()
        tv_result.text = intent.getStringExtra("message")

    }
}
