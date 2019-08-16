package com.example.calculatorwithintenttodifferentactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View) {

        var num: String = ""
        var a = 0
        var b = 0
        var intent: Intent? = null


        if (et_number_one.text.toString().isEmpty() || et_number_two.text.toString().isEmpty()) {

            num = "Enter valid real numbers!"
            tv_error_message.text = num

        } else {
            a = Integer.parseInt(et_number_one.text.toString())
            b = Integer.parseInt(et_number_two.text.toString())

            when (view!!.id) {

                R.id.btn_add -> {
         /*         num = (a + b).toString()
                    intent = Intent(this, AddActivity::class.java)
                    intent.putExtra("message", num)*/

                    intent = Intent(this, AddActivity::class.java)


                }

                R.id.btn_subtract -> {
                   /* num = (a - b).toString()
                    intent = Intent(this, SubtractActivity::class.java)
                    intent.putExtra("message", num)*/

                    intent = Intent(this, SubtractActivity::class.java)
                }

                R.id.btn_multiply -> {
                    /*num = (a * b).toString()
                    intent = Intent(this, MultiplyActivity::class.java)
                    intent.putExtra("message", num)*/

                    intent = Intent(this, MultiplyActivity::class.java)
                }

                R.id.btn_divide -> {

                    var db: Double = b.toDouble()

                    if (db.equals(0.0)) {
                        num = "Er!"
                    } else {
                        num = String.format("%.2f", (a / db))
                    }

            /*      intent = Intent(this, DivideActivity::class.java)
                    intent.putExtra("message", num)*/

                    intent = Intent(this, DivideActivity::class.java)

                }
            }//END WHEN
            intent!!.putExtra(Constants.INTENT_MESSAGE_1, a)
            intent.putExtra(Constants.INTENT_MESSAGE_2, b)
            startActivity(intent)
        //    tv_error_message.text = num
        }//END ELSE


    }//END ONCLICK

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_divide.setOnClickListener(this)
        btn_add.setOnClickListener(this)
        btn_subtract.setOnClickListener(this)
        btn_multiply.setOnClickListener(this)

    }
}
