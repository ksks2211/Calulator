package com.testproject.calulator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*


class Intent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        changeActivity.setOnClickListener{
////            val intent = Intent(this@Intent1, Intent2::class.java)
//////            intent.putExtra("number1",1)
//////            intent.putExtra("number2",2)
//////            startActivity(intent)
//
//            val intent2 = Intent(this@Intent1, Intent2::class.java)
//            intent2.apply{
//                this.putExtra("number1",1)
//                this.putExtra("number2",2)
//            }
//            startActivityForResult(intent2,200)


            //암시적 intent
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        when(requestCode){
            200 ->{
                Log.d("number",requestCode.toString())
                Log.d("number",resultCode.toString())

                val result = data?.getIntExtra("result",0)
                Log.d("number",result.toString())
            }
        }

        super.onActivityResult(requestCode, resultCode, data)

    }
}

