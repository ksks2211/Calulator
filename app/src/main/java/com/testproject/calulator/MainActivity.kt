package com.testproject.calulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {
    val max : Int = 100000000
    var outcome : Int =0
    var tmp: Int =0

    fun check(  v :Int ):Boolean = v < max


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                output.setText(outcome.toString())}
        }

        btn1.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=1
                output.setText(outcome.toString())
            }
        }

        btn2.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=2
                output.setText(outcome.toString())
            }
        }

        btn3.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=3
                output.setText(outcome.toString())
            }
        }

        btn4.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=4
                output.setText(outcome.toString())
            }
        }

        btn5.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=5
                output.setText(outcome.toString())
            }
        }

        btn6.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=6
                output.setText(outcome.toString())
            }
        }

        btn7.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=7
                output.setText(outcome.toString())
            }
        }

        btn8.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=8
                output.setText(outcome.toString())
            }
        }

        btn9.setOnClickListener{
            if(check(outcome)){
                outcome*=10
                outcome+=9
                output.setText(outcome.toString())
            }
        }


        clear.setOnClickListener{
            outcome=0
            tmp=0
            output.setText(outcome.toString())
        }

        btnplus.setOnClickListener{
            outcome+=tmp
            tmp=outcome
            output.setText(outcome.toString())
            outcome=0
        }

    }


}
