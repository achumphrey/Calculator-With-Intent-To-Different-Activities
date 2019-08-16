package com.example.calculatorwithintenttodifferentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.results_operations.*

class DivideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_operations)

     /*   var intent : Intent = getIntent()
        tv_result.text = intent.getStringExtra("message")*/

        val a = intent.getIntExtra(Constants.INTENT_MESSAGE_1, 0)
        val b = intent.getIntExtra(Constants.INTENT_MESSAGE_2, 0)

        var db: Double = b.toDouble()

        var num: String = ""

        if (db.equals(0.0)) {
            num = "Er!"
        } else {
            num = String.format("%.2f", (a / db))
        }

        tv_result.text = num

    }
}
